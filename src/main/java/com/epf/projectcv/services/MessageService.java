package com.epf.projectcv.services;

import com.epf.projectcv.DAO.MessageDao;
import com.epf.projectcv.DAO.ProfilDao;
import com.epf.projectcv.DTO.MessageDTO;
import com.epf.projectcv.models.Message;
import com.epf.projectcv.models.Profil;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import javax.mail.*;
import javax.mail.internet.*;
import java.util.Properties;

import java.util.List;
import java.util.NoSuchElementException;

@Component
@RequiredArgsConstructor
public class MessageService {
    private final MessageDao messageDao;
    private final ProfilDao profilDao;
    private final static String emailPassword = "pmjg kseu mgzl jhis";
    private final static String emailAddress = "project.cv.msg@gmail.com";
    private final Properties props = new Properties();

    public boolean sendEmail(String to, String subject, String body) {
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com"); // Serveur SMTP de Gmail
        props.put("mail.smtp.port", "587"); // Port SMTP de Gmail

        Session session = Session.getInstance(props, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(emailAddress, emailPassword);
            }
        });

        try {
            Profil profil = profilDao.findById(1)
                    .orElseThrow(() -> new NoSuchElementException("Profil does not exist"));

            String msgBody = body + "\n\nProvenant de " + to + "\n\n\n"
                    + "[Mail automatique, ne pas répondre]";

            javax.mail.Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(emailAddress));
            message.setRecipients(javax.mail.Message.RecipientType.TO,
                    InternetAddress.parse(profil.getEmail()));
            message.setSubject(subject);
            message.setText(msgBody);

            Transport.send(message);
            System.out.println("E-mail envoyé avec succès");
            return true;

        } catch (Exception e) {
            System.out.println("Erruer d'envoie du mail\n" + e.getMessage());
            return false;
        }
    }

    public List<Message> findAll() { return messageDao.findAll(); }

    @Transactional
    public void addMessage(MessageDTO messageDto) {
        Message message;
        try {
            message = MessageDTO.fromDto(messageDto, null);
        } catch (Exception e) {
            throw new RuntimeException("Error with Message image", e);
        }
        sendEmail(message.getEmail(), "Message de " + message.getName(), message.getMessage());
        System.out.println("Message : \n" + message);
        messageDao.save(message);
    }
}

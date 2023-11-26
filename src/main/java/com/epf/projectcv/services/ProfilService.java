package com.epf.projectcv.services;

import com.epf.projectcv.DAO.ProfilDao;
import com.epf.projectcv.DTO.ProfilDTO;
import com.epf.projectcv.models.Profil;
import com.epf.projectcv.models.Profil;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.util.List;
import java.util.NoSuchElementException;

@Component
@RequiredArgsConstructor
public class ProfilService {
    private final ProfilDao profilDao;

    public List<Profil> findAll() { return profilDao.findAll(); }

    @Transactional
    public void updateProfil(ProfilDTO profilDto, Long id) {
        profilDao.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Profil doesn't exist"));
        Profil profil;
        try {
            profil = ProfilDTO.fromDto(profilDto, id);
        } catch (IOException e) {
            throw new RuntimeException("Error with Profil image", e);
        }
        profilDao.save(profil);
    }
}

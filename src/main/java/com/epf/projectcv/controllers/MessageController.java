package com.epf.projectcv.controllers;

import com.epf.projectcv.DAO.MessageDao;
import com.epf.projectcv.DTO.MessageDTO;
import com.epf.projectcv.models.Hobby;
import com.epf.projectcv.models.Message;
import com.epf.projectcv.services.MessageService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RequestMapping("messages")
@RestController
@RequiredArgsConstructor
public class MessageController {
    private final MessageService messageService;

    @GetMapping("")
    public List<Message> findAll() { return messageService.findAll(); }

    @PostMapping("") // Ajouter
    public void addMessage(@RequestBody MessageDTO messageDto) { messageService.addMessage(messageDto); }
}

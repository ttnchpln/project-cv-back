package com.epf.projectcv.controllers;

import com.epf.projectcv.DAO.HobbyDao;
import com.epf.projectcv.DTO.HobbyDTO;
import com.epf.projectcv.models.Formation;
import com.epf.projectcv.models.Hobby;
import com.epf.projectcv.services.HobbyService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RequestMapping("hobbies")
@RestController
@RequiredArgsConstructor
public class HobbyController {
    private final HobbyService hobbyService;

    @GetMapping("")
    public List<Hobby> findAll() { return hobbyService.findAll(); }

    @GetMapping("/{id}")
    public Hobby findById(@PathVariable long id) {
        return hobbyService.findById(id);
    }

    @DeleteMapping("/{id}") // supprimer
    public void deleteHobby(@PathVariable int id) { hobbyService.deleteById(id); }

    @PostMapping("") // Ajouter
    public void addHobby(@RequestBody HobbyDTO hobbyDto) { hobbyService.addHobby(hobbyDto); }

    @PostMapping("/{id}") // Modifier
    public void updateHobby(@RequestBody HobbyDTO hobbyDto, @PathVariable Long id) { hobbyService.updateHobby(hobbyDto, id); }
}

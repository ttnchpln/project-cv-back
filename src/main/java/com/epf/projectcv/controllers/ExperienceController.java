package com.epf.projectcv.controllers;

import com.epf.projectcv.DTO.ExperienceDTO;
import com.epf.projectcv.models.Experience;
import com.epf.projectcv.services.ExperienceService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RequestMapping("experiences")
@RestController
@RequiredArgsConstructor
public class ExperienceController {
    private final ExperienceService experienceService;

    @GetMapping("")
    public List<Experience> findAll() { return experienceService.findAll(); }

    @GetMapping("/{id}")
    public Experience findById(@PathVariable long id) {
        return experienceService.findById(id);
    }

    @DeleteMapping("/{id}") // supprimer
    public void deleteExperience(@PathVariable int id) { experienceService.deleteById(id); }

    @PostMapping("") // Ajouter
    public void addExperience(@RequestBody ExperienceDTO experienceDto) { experienceService.addExperience(experienceDto); }

    @PostMapping("/{id}") // Modifier
    public void updateExperience(@RequestBody ExperienceDTO experienceDto, @PathVariable Long id) { experienceService.updateExperience(experienceDto, id); }
}

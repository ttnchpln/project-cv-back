package com.epf.projectcv.controllers;

import com.epf.projectcv.DTO.RecommandationDTO;
import com.epf.projectcv.models.Recommandation;
import com.epf.projectcv.services.RecommandationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RequestMapping("recommandations")
@RestController
@RequiredArgsConstructor
public class RecommandationController {
    private final RecommandationService recommandationService;

    @GetMapping("")
    public List<Recommandation> findAll() { return recommandationService.findAll(); }

    @GetMapping("/{id}")
    public Recommandation findById(@PathVariable long id) {
        return recommandationService.findById(id);
    }

    @DeleteMapping("/{id}") // supprimer
    public void deleteRecommandation(@PathVariable int id) { recommandationService.deleteById(id); }

    @PostMapping("") // Ajouter
    public void addRecommandation(@RequestBody RecommandationDTO recommandationDto) { recommandationService.addRecommandation(recommandationDto); }

    @PostMapping("/{id}") // Modifier
    public void updateRecommandation(@RequestBody RecommandationDTO recommandationDto, @PathVariable Long id) { recommandationService.updateRecommandation(recommandationDto, id); }
}

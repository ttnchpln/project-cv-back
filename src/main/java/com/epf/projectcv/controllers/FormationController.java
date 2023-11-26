package com.epf.projectcv.controllers;

import com.epf.projectcv.DAO.FormationDao;
import com.epf.projectcv.DTO.FormationDTO;
import com.epf.projectcv.models.Experience;
import com.epf.projectcv.models.Formation;
import com.epf.projectcv.services.FormationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RequestMapping("formations")
@RestController
@RequiredArgsConstructor
public class FormationController {
    private final FormationService formationService;

    @GetMapping("")
    public List<Formation> findAll() { return formationService.findAll(); }

    @GetMapping("/{id}")
    public Formation findById(@PathVariable long id) {
        return formationService.findById(id);
    }

    @DeleteMapping("/{id}") // supprimer
    public void deleteFormation(@PathVariable int id) { formationService.deleteById(id); }

    @PostMapping("") // Ajouter
    public void addFormation(@RequestBody FormationDTO formationDto) { formationService.addFormation(formationDto); }

    @PostMapping("/{id}") // Modifier
    public void updateFormation(@RequestBody FormationDTO formationDto, @PathVariable long id) { formationService.updateFormation(formationDto, id); }
}

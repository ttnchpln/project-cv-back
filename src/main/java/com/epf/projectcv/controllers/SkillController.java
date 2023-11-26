package com.epf.projectcv.controllers;

import com.epf.projectcv.DTO.SkillDTO;
import com.epf.projectcv.models.Skill;
import com.epf.projectcv.services.SkillService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RequestMapping("skills")
@RestController
@RequiredArgsConstructor
public class SkillController {
    private final SkillService skillService;

    @GetMapping("")
    public List<Skill> findAll() { return skillService.findAll(); }

    @GetMapping("/{id}")
    public Skill findById(@PathVariable long id) {
        return skillService.findById(id);
    }

    @DeleteMapping("/{id}") // supprimer
    public void deleteSkill(@PathVariable int id) { skillService.deleteById(id); }

    @PostMapping("") // Ajouter
    public void addSkill(@RequestBody SkillDTO skillDto) {
        System.out.println("DTO = " + skillDto);
        skillService.addSkill(skillDto); }

    @PostMapping("/{id}") // Modifier
    public void updateSkill(@RequestBody SkillDTO skillDto, @PathVariable Long id) { skillService.updateSkill(skillDto, id); }
}

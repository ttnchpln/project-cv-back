package com.epf.projectcv.controllers;

import com.epf.projectcv.DTO.SocialnetworkDTO;
import com.epf.projectcv.models.Socialnetwork;
import com.epf.projectcv.services.SocialnetworkService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RequestMapping("socialnetworks")
@RestController
@RequiredArgsConstructor
public class SocialnetworkController {
    private final SocialnetworkService socialNetworkService;

    @GetMapping("")
    public List<Socialnetwork> findAll() { return socialNetworkService.findAll(); }

    @GetMapping("/{id}")
    public Socialnetwork findById(@PathVariable long id) {
        return socialNetworkService.findById(id);
    }

    @DeleteMapping("/{id}") // supprimer
    public void deleteSocialnetwork(@PathVariable int id) { socialNetworkService.deleteById(id); }

    @PostMapping("") // Ajouter
    public void addSocialnetwork(@RequestBody SocialnetworkDTO socialNetworkDto) { socialNetworkService.addSocialnetwork(socialNetworkDto); }

    @PostMapping("/{id}") // Modifier
    public void updateSocialnetwork(@RequestBody SocialnetworkDTO socialNetworkDto, @PathVariable Long id) { socialNetworkService.updateSocialnetwork(socialNetworkDto, id); }
}

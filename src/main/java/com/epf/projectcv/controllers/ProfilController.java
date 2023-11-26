package com.epf.projectcv.controllers;

import com.epf.projectcv.DAO.ProfilDao;
import com.epf.projectcv.DTO.ProfilDTO;
import com.epf.projectcv.models.Hobby;
import com.epf.projectcv.models.Profil;
import com.epf.projectcv.services.ProfilService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RequestMapping("profil")
@RestController
@RequiredArgsConstructor
public class ProfilController {
    private final ProfilService profilService;

    @GetMapping("")
    public List<Profil> findAll() { return profilService.findAll(); }

    @PostMapping("/{id}") // Modifier
    public void updateProfil(@RequestBody ProfilDTO profilDto, @PathVariable Long id) { profilService.updateProfil(profilDto, id); }

}

package com.epf.projectcv.services;

import com.epf.projectcv.DAO.FormationDao;
import com.epf.projectcv.DTO.FormationDTO;
import com.epf.projectcv.DTO.FormationDTO;
import com.epf.projectcv.models.Formation;
import com.epf.projectcv.models.Formation;
import com.epf.projectcv.models.Formation;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.util.List;
import java.util.NoSuchElementException;

@Component
@RequiredArgsConstructor
public class FormationService {
    private final FormationDao formationDao;

    public List<Formation> findAll() { return formationDao.findAll(); }

    public Formation findById(long id) {
        if (formationDao.findById(id).isPresent()) {
            return formationDao.findById(id).get();
        }
        else {
            return null;
        }
    }

    @Transactional
    public void deleteById(int id) {
        formationDao.deleteById(id);
    }

    @Transactional
    public void addFormation(FormationDTO formationDto) {
        Formation formation;
        try {
            formation = FormationDTO.fromDto(formationDto, null);
        } catch (Exception e) {
            throw new RuntimeException("Error with Formation image", e);
        }
        formationDao.save(formation);
    }

    @Transactional
    public void updateFormation(FormationDTO formationDto, Long id) {
        formationDao.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Formation doesn't exist"));
        Formation formation;
        try {
            formation = FormationDTO.fromDto(formationDto, id);
        } catch (IOException e) {
            throw new RuntimeException("Error with Formation image", e);
        }
        formationDao.save(formation);
    }
}

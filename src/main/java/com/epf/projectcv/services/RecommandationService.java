package com.epf.projectcv.services;

import com.epf.projectcv.DAO.RecommandationDao;
import com.epf.projectcv.DTO.RecommandationDTO;
import com.epf.projectcv.models.Recommandation;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.util.List;
import java.util.NoSuchElementException;

@Component
@RequiredArgsConstructor
public class RecommandationService {
    private final RecommandationDao recommandationDao;

    public List<Recommandation> findAll() { return recommandationDao.findAll(); }

    public Recommandation findById(long id) {
        if (recommandationDao.findById(id).isPresent()) {
            return recommandationDao.findById(id).get();
        }
        else {
            return null;
        }
    }
    @Transactional
    public void deleteById(int id) {
        recommandationDao.deleteById(id);
    }

    @Transactional
    public void addRecommandation(RecommandationDTO hobbyDto) {
        Recommandation hobby;
        try {
            hobby = RecommandationDTO.fromDto(hobbyDto, null);
        } catch (Exception e) {
            throw new RuntimeException("Error with Recommandation image", e);
        }
        recommandationDao.save(hobby);
    }

    @Transactional
    public void updateRecommandation(RecommandationDTO hobbyDto, Long id) {
        recommandationDao.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Recommandation doesn't exist"));
        Recommandation hobby;
        try {
            hobby = RecommandationDTO.fromDto(hobbyDto, id);
        } catch (IOException e) {
            throw new RuntimeException("Error with Recommandation image", e);
        }
        recommandationDao.save(hobby);
    }
}

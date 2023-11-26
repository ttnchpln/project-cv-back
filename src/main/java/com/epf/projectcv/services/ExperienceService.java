package com.epf.projectcv.services;

import com.epf.projectcv.DAO.ExperienceDao;
import com.epf.projectcv.DTO.ExperienceDTO;
import com.epf.projectcv.DTO.ExperienceDTO;
import com.epf.projectcv.models.Experience;
import com.epf.projectcv.models.Experience;
import com.epf.projectcv.models.Experience;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.util.List;
import java.util.NoSuchElementException;

@Component
@RequiredArgsConstructor
public class ExperienceService {
    private final ExperienceDao experienceDao;

    public List<Experience> findAll() { return experienceDao.findAll(); }

    public Experience findById(long id) {
        if (experienceDao.findById(id).isPresent()) {
            return experienceDao.findById(id).get();
        }
        else {
            return null;
        }
    }

    @Transactional
    public void deleteById(int id) {
        experienceDao.deleteById(id);
    }

    @Transactional
    public void addExperience(ExperienceDTO experienceDto) {
        Experience experience;
        try {
            experience = ExperienceDTO.fromDto(experienceDto, null);
        } catch (Exception e) {
            throw new RuntimeException("Error with Experience image", e);
        }
        experienceDao.save(experience);
    }

    @Transactional
    public void updateExperience(ExperienceDTO experienceDto, Long id) {
        experienceDao.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Experience doesn't exist"));
        Experience experience;
        try {
            experience = ExperienceDTO.fromDto(experienceDto, id);
        } catch (IOException e) {
            throw new RuntimeException("Error with Experience image", e);
        }
        experienceDao.save(experience);
    }
}

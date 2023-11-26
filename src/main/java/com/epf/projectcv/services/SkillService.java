package com.epf.projectcv.services;

import com.epf.projectcv.DAO.SkillDao;
import com.epf.projectcv.DTO.SkillDTO;
import com.epf.projectcv.DTO.SkillDTO;
import com.epf.projectcv.models.Skill;
import com.epf.projectcv.models.Skill;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.util.List;
import java.util.NoSuchElementException;

@Component
@RequiredArgsConstructor
public class SkillService {
    private final SkillDao skillDao;

    public List<Skill> findAll() { return skillDao.findAll(); }

    public Skill findById(long id) {
        if (skillDao.findById(id).isPresent()) {
            return skillDao.findById(id).get();
        }
        else {
            return null;
        }
    }
    @Transactional
    public void deleteById(int id) {
        skillDao.deleteById(id);
    }

    @Transactional
    public void addSkill(SkillDTO skillDto) {
        Skill skill;
        try {
            skill = SkillDTO.fromDto(skillDto, null);
        } catch (Exception e) {
            throw new RuntimeException("Error with Student image", e);
        }
        skillDao.save(skill);
    }

    @Transactional
    public void updateSkill(SkillDTO skillDto, Long id) {
        skillDao.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Skill doesn't exist"));
        Skill skill;
        try {
            skill = SkillDTO.fromDto(skillDto, id);
        } catch (IOException e) {
            throw new RuntimeException("Error with Skill image", e);
        }
        skillDao.save(skill);
    }
}

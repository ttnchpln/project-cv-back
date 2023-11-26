package com.epf.projectcv.DAO;

import com.epf.projectcv.models.Skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SkillDao extends JpaRepository<Skill, Integer> {
    Optional<Skill> findById(Long id);
}

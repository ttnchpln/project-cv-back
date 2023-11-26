package com.epf.projectcv.DAO;

import com.epf.projectcv.models.Experience;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ExperienceDao extends JpaRepository<Experience, Integer> {
    Optional<Experience> findById(Long id);
}

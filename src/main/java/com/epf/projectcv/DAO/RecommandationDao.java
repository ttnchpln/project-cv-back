package com.epf.projectcv.DAO;

import com.epf.projectcv.models.Experience;
import com.epf.projectcv.models.Recommandation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RecommandationDao extends JpaRepository<Recommandation, Integer> {
    Optional<Recommandation> findById(Long id);
}

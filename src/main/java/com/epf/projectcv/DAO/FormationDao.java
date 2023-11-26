package com.epf.projectcv.DAO;

import com.epf.projectcv.models.Formation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FormationDao extends JpaRepository<Formation, Integer> {
    Optional<Formation> findById(long id);
}

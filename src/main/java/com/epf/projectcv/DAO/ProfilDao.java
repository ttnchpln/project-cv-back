package com.epf.projectcv.DAO;

import com.epf.projectcv.models.Profil;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProfilDao extends JpaRepository<Profil, Integer> {
    Optional<Profil> findById(Long id);
}

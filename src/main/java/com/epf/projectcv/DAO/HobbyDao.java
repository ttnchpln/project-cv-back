package com.epf.projectcv.DAO;

import com.epf.projectcv.models.Hobby;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface HobbyDao extends JpaRepository<Hobby, Integer> {
    Optional<Hobby> findById(Long id);
}

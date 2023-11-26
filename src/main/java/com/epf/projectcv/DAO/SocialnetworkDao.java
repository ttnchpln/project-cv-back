package com.epf.projectcv.DAO;

import com.epf.projectcv.models.Socialnetwork;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SocialnetworkDao extends JpaRepository<Socialnetwork, Integer> {
    Optional<Socialnetwork> findById(Long id);
}

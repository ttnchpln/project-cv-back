package com.epf.projectcv.DAO;

import com.epf.projectcv.models.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MessageDao extends JpaRepository<Message, Integer> {
    Optional<Message> findById(Long id);
}

package com.epf.projectcv.services;

import com.epf.projectcv.DAO.HobbyDao;
import com.epf.projectcv.DTO.HobbyDTO;
import com.epf.projectcv.DTO.HobbyDTO;
import com.epf.projectcv.models.Hobby;
import com.epf.projectcv.models.Hobby;
import com.epf.projectcv.models.Hobby;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.util.List;
import java.util.NoSuchElementException;

@Component
@RequiredArgsConstructor
public class HobbyService {
    private final HobbyDao hobbyDao;

    public List<Hobby> findAll() { return hobbyDao.findAll(); }

    public Hobby findById(long id) {
        if (hobbyDao.findById(id).isPresent()) {
            return hobbyDao.findById(id).get();
        }
        else {
            return null;
        }
    }
    @Transactional
    public void deleteById(int id) {
        hobbyDao.deleteById(id);
    }

    @Transactional
    public void addHobby(HobbyDTO hobbyDto) {
        Hobby hobby;
        try {
            hobby = HobbyDTO.fromDto(hobbyDto, null);
        } catch (Exception e) {
            throw new RuntimeException("Error with Hobby image", e);
        }
        hobbyDao.save(hobby);
    }

    @Transactional
    public void updateHobby(HobbyDTO hobbyDto, Long id) {
        hobbyDao.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Hobby doesn't exist"));
        Hobby hobby;
        try {
            hobby = HobbyDTO.fromDto(hobbyDto, id);
        } catch (IOException e) {
            throw new RuntimeException("Error with Hobby image", e);
        }
        hobbyDao.save(hobby);
    }
}

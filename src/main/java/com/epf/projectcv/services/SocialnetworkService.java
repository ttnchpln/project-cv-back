package com.epf.projectcv.services;

import com.epf.projectcv.DAO.SocialnetworkDao;
import com.epf.projectcv.DTO.SocialnetworkDTO;
import com.epf.projectcv.DTO.SocialnetworkDTO;
import com.epf.projectcv.models.Socialnetwork;
import com.epf.projectcv.models.Socialnetwork;
import com.epf.projectcv.models.Socialnetwork;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.util.List;
import java.util.NoSuchElementException;

@Component
@RequiredArgsConstructor
public class SocialnetworkService {
    private final SocialnetworkDao socialnetworkDao;

    public List<Socialnetwork> findAll() { return socialnetworkDao.findAll(); }

    public Socialnetwork findById(long id) {
        if (socialnetworkDao.findById(id).isPresent()) {
            return socialnetworkDao.findById(id).get();
        }
        else {
            return null;
        }
    }
    @Transactional
    public void deleteById(int id) {
        socialnetworkDao.deleteById(id);
    }

    @Transactional
    public void addSocialnetwork(SocialnetworkDTO socialnetworkDto) {
        Socialnetwork socialnetwork;
        try {
            socialnetwork = SocialnetworkDTO.fromDto(socialnetworkDto, null);
        } catch (Exception e) {
            throw new RuntimeException("Error with Socialnetwork image", e);
        }
        socialnetworkDao.save(socialnetwork);
    }

    @Transactional
    public void updateSocialnetwork(SocialnetworkDTO socialnetworkDto, Long id) {
        socialnetworkDao.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Socialnetwork doesn't exist"));
        Socialnetwork socialnetwork;
        try {
            socialnetwork = SocialnetworkDTO.fromDto(socialnetworkDto, id);
        } catch (IOException e) {
            throw new RuntimeException("Error with Socialnetwork image", e);
        }
        socialnetworkDao.save(socialnetwork);
    }
}

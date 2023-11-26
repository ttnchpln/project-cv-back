package com.epf.projectcv.DTO;

import com.epf.projectcv.models.Profil;
import lombok.Builder;
import lombok.Getter;

import java.io.IOException;

@Builder
@Getter
public class ProfilDTO {
    private String firstname;
    private String lastname;
    private String email;
    private String title;
    private String logoUrl;
    private String objective;

    public static Profil fromDto(ProfilDTO dto, Long id)  throws IOException {
        return new Profil.Builder()
                .id(id)
                .firstname(dto.firstname)
                .lastname(dto.lastname)
                .email(dto.email)
                .title(dto.title)
                .logoUrl(dto.logoUrl)
                .objective(dto.objective)
                .build();
    }
}
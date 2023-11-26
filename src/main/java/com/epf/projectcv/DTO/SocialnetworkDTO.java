package com.epf.projectcv.DTO;

import com.epf.projectcv.models.Socialnetwork;
import lombok.Builder;
import lombok.Getter;

import java.io.IOException;

@Builder
@Getter
public class SocialnetworkDTO {
    private String logo;
    private String link;

    public static Socialnetwork fromDto(SocialnetworkDTO dto, Long id)  throws IOException {
        return new Socialnetwork.Builder()
                .id(id)
                .logo(dto.logo)
                .link(dto.link)
                .build();
    }
}
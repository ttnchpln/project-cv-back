package com.epf.projectcv.DTO;

import com.epf.projectcv.models.Hobby;
import lombok.Builder;
import lombok.Getter;

import java.io.IOException;
import java.util.Date;

@Builder
@Getter
public class HobbyDTO {
    private String title;
    private String description;
    private String logo;
    private Date dates;

    public static Hobby fromDto(HobbyDTO dto, Long id)  throws IOException {
        return new Hobby.Builder()
                .id(id)
                .title(dto.title)
                .logo(dto.logo)
                .description(dto.description)
                .dates(dto.dates)
                .build();
    }
}
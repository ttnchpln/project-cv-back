package com.epf.projectcv.DTO;

import com.epf.projectcv.models.Formation;
import lombok.Builder;
import lombok.Getter;

import java.io.IOException;
import java.util.Date;

@Builder
@Getter
public class FormationDTO {
    private String school;
    private Date startDate;
    private Date endDate;
    private String description;
    private String logoUrl;

    public static Formation fromDto(FormationDTO dto, Long id)  throws IOException {
        return new Formation.Builder()
                .id(id)
                .school(dto.school)
                .startDate(dto.startDate)
                .endDate(dto.endDate)
                .description(dto.description)
                .logoUrl(dto.logoUrl)
                .build();
    }
}
package com.epf.projectcv.DTO;

import com.epf.projectcv.models.Experience;
import lombok.Builder;
import lombok.Getter;

import java.io.IOException;
import java.util.Date;

@Builder
@Getter
public class ExperienceDTO {
    private String title;
    private String company;
    private String location;
    private Date startDate;
    private Date endDate;
    private String description;
    private String logoUrl;

    public static Experience fromDto(ExperienceDTO dto, Long id)  throws IOException {
        return new Experience.Builder()
                .id(id)
                .title(dto.title)
                .company(dto.company)
                .location(dto.location)
                .startDate(dto.startDate)
                .endDate(dto.endDate)
                .description(dto.description)
                .logoUrl(dto.logoUrl)
                .build();
    }
}
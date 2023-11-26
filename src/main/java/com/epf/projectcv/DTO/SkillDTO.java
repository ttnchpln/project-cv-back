package com.epf.projectcv.DTO;

import com.epf.projectcv.models.Skill;
import lombok.Builder;
import lombok.Getter;

import java.io.IOException;

@Builder
@Getter
public class SkillDTO {
    private String label;
    private String title;
    private String logo;

    public static Skill fromDto(SkillDTO dto, Long id) throws IOException {
        return new Skill.Builder()
                .id(id)
                .label(dto.label)
                .title(dto.title)
                .logo(dto.logo)
                .build();
    }
}



package com.epf.projectcv.DTO;

import com.epf.projectcv.models.Recommandation;
import lombok.Builder;
import lombok.Getter;

import java.io.IOException;

@Builder
@Getter
public class RecommandationDTO {
    private String author;
    private String position;
    private String text;

    public static Recommandation fromDto(RecommandationDTO dto, Long id)  throws IOException {
        return new Recommandation.Builder()
                .id(id)
                .author(dto.author)
                .position(dto.position)
                .text(dto.text)
                .build();
    }
}
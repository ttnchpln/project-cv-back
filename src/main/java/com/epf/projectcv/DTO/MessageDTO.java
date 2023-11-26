package com.epf.projectcv.DTO;

import com.epf.projectcv.models.Message;
import lombok.Builder;
import lombok.Getter;

import java.io.IOException;
import java.util.Date;

@Builder
@Getter
public class MessageDTO {
    private String name;
    private String message;
    private String email;

    public static Message fromDto(MessageDTO dto, Long id)  throws IOException {
        return new Message.Builder()
                .id(id)
                .name(dto.name)
                .message(dto.message)
                .email(dto.email)
                .build();
    }
}
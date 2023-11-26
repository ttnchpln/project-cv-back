package com.epf.projectcv.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Entity
@Table(name = "Message")
@NoArgsConstructor
@Getter
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "email")
    private String email;
    @Column(name = "message", columnDefinition = "TEXT")
    private String message;

    public Message(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.message = builder.message;
        this.email = builder.email;
    }

    public static class Builder {
        private Long id;
        private String name;
        private String message;
        private String email;

        public Builder id(Long id) {
            this.id = id;
            return this;
        }
        public Builder name(String name) {
            this.name = name;
            return this;
        }
        public Builder message(String message) {
            this.message = message;
            return this;
        }
        public Builder email(String email) {
            this.email = email;
            return this;
        }
        public Message build() {
            return new Message(this);
        }
    }
}

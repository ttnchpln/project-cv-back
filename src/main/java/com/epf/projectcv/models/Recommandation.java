package com.epf.projectcv.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Recommandation")
@NoArgsConstructor
@Getter
public class Recommandation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "author")
    private String author;

    @Column(name = "position")
    private String position;

    @Column(name = "text")
    private String text;

    private Recommandation(Builder builder) {
        this.id = builder.id;
        this.author = builder.author;
        this.position = builder.position;
        this.text = builder.text;
    }

    public static class Builder {
        private Long id;
        private String author;
        private String position;
        private String text;

        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        public Builder author(String author) {
            this.author = author;
            return this;
        }

        public Builder position(String position) {
            this.position = position;
            return this;
        }

        public Builder text(String text) {
            this.text = text;
            return this;
        }

        public Recommandation build() {
            return new Recommandation(this);
        }
    }
}
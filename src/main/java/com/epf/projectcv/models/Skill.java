package com.epf.projectcv.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Skill")
@NoArgsConstructor
@Getter
public class Skill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "label")
    private String label;

    @Column(name = "title")
    private String title;

    @Column(name = "logo")
    private String logo;

    private Skill(Builder builder) {
        this.id = builder.id;
        this.label = builder.label;
        this.title = builder.title;
        this.logo = builder.logo;
    }

    public static class Builder {
        private Long id;
        private String label;
        private String title;
        private String logo;

        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        public Builder label(String label) {
            this.label = label;
            return this;
        }

        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public Builder logo(String logo) {
            this.logo = logo;
            return this;
        }

        public Skill build() {
            return new Skill(this);
        }
    }
}
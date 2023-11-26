package com.epf.projectcv.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Entity
@Table(name = "Hobby")
@NoArgsConstructor
@Getter
public class Hobby {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "dates")
    private Date dates;

    @Column(name = "logo")
    private String logo;

    public Hobby(Builder builder) {
        this.id = builder.id;
        this.title = builder.title;
        this.description = builder.description;
        this.dates = builder.dates;
        this.logo = builder.logo;
    }

    public static class Builder {
        private Long id;
        private String title;
        private String description;
        private Date dates;
        private String logo;

        public Builder id(Long id) {
            this.id = id;
            return this;
        }
        public Builder title(String title) {
            this.title = title;
            return this;
        }
        public Builder description(String description) {
            this.description = description;
            return this;
        }
        public Builder dates(Date dates) {
            this.dates = dates;
            return this;
        }
        public Builder logo(String logo) {
            this.logo = logo;
            return this;
        }
        public Hobby build() {
            return new Hobby(this);
        }
    }
}
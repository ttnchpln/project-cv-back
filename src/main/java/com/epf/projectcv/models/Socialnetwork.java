package com.epf.projectcv.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "Socialnetwork")
@NoArgsConstructor
public class Socialnetwork {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "logo")
    private String logo;

    @Column(name = "link")
    private String link;

    public Socialnetwork(Builder builder) {
        this.id = builder.id;
        this.logo = builder.logo;
        this.link = builder.link;
    }

    public static class Builder {
        private Long id;
        private String logo;
        private String link;

        public Builder id(Long id) {
            this.id = id;
            return this;
        }
        public Builder logo(String logo) {
            this.logo = logo;
            return this;
        }
        public Builder link(String link) {
            this.link = link;
            return this;
        }
        public Socialnetwork build() {
            return new Socialnetwork(this);
        }
    }
}
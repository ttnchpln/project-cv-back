package com.epf.projectcv.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@Table(name = "Profil")
@NoArgsConstructor
@Getter
public class Profil {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "firstname")
    private String firstname;

    @Column(name = "lastname")
    private String lastname;

    @Column(name = "email")
    private String email;

    @Column(name = "title")
    private String title;

    @Column(name = "logoUrl")
    private String logoUrl;

    @Column(name = "objective")
    private String objective;

    public Profil(Builder builder) {
        this.id = builder.id;
        this.firstname = builder.firstname;
        this.lastname = builder.lastname;
        this.email = email;
        this.title = builder.title;
        this.logoUrl = builder.logoUrl;
        this.objective = builder.objective;
    }

    public static class Builder {

        private Long id;
        private String firstname;
        private String lastname;
        private String email;
        private String title;
        private String logoUrl;
        private String objective;

        public Builder id(Long id) {
            this.id = id;
            return this;
        }
        public Builder firstname(String firstname) {
            this.firstname = firstname;
            return this;
        }
        public Builder lastname(String lastname) {
            this.lastname = lastname;
            return this;
        }
        public Builder email(String email) {
            this.email = email;
            return this;
        }
        public Builder title(String title) {
            this.title = title;
            return this;
        }
        public Builder logoUrl(String logoUrl) {
            this.logoUrl = logoUrl;
            return this;
        }
        public Builder objective(String objective) {
            this.objective = objective;
            return this;
        }
        public Profil build() {
            return new Profil(this);
        }
    }
}

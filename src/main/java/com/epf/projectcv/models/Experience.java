package com.epf.projectcv.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Entity
@Table(name = "Experience")
@NoArgsConstructor
@Getter
public class Experience {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "company")
    private String company;

    @Column(name = "location")
    private String location;

    @Column(name = "startDate")
    private Date startDate;

    @Column(name = "endDate")
    private Date endDate;

    @Column(name = "description")
    private String description;

    @Column(name = "logoUrl")
    private String logoUrl;

    private Experience(Builder builder) {
        this.id = builder.id;
        this.title = builder.title;
        this.company = builder.company;
        this.location = builder.location;
        this.startDate = builder.startDate;
        this.endDate = builder.endDate;
        this.description = builder.description;
        this.logoUrl = builder.logoUrl;
    }

    public static class Builder {
        private Long id;
        private String title;
        private String company;
        private String location;
        private Date startDate;
        private Date endDate;
        private String description;
        private String logoUrl;

        public Builder id(Long id) {
            this.id = id;
            return this;
        }
        public Builder title(String title) {
            this.title = title;
            return this;
        }
        public Builder company(String company) {
            this.company = company;
            return this;
        }
        public Builder location(String location) {
            this.location = location;
            return this;
        }
        public Builder startDate(Date startDate) {
            this.startDate = startDate;
            return this;
        }
        public Builder endDate(Date endDate) {
            this.endDate = endDate;
            return this;
        }
        public Builder description(String description) {
            this.description = description;
            return this;
        }
        public Builder logoUrl(String logoUrl) {
            this.logoUrl = logoUrl;
            return this;
        }
        public Experience build() {
            return new Experience((this));
        }
    }
}
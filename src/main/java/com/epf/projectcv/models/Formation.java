package com.epf.projectcv.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Entity
@Table(name = "Formation")
@NoArgsConstructor
@Getter
public class Formation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "school")
    private String school;

    @Column(name = "startDate")
    private Date startDate;

    @Column(name = "endDate")
    private Date endDate;

    @Column(name = "description")
    private String description;

    @Column(name = "logoUrl")
    private String logoUrl;

    public Formation(Builder builder) {
        this.id = builder.id;
        this.school = builder.school;
        this.description = builder.description;
        this.startDate = builder.startDate;
        this.endDate = builder.endDate;
        this.logoUrl = builder.logoUrl;
    }

    public static class Builder {
        private Long id;
        private String school;
        private String description;
        private Date startDate;
        private Date endDate;
        private String logoUrl;

        public Builder id(Long id) {
            this.id = id;
            return this;
        }
        public Builder school(String school) {
            this.school = school;
            return this;
        }
        public Builder description(String description) {
            this.description = description;
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
        public Builder logoUrl(String logoUrl) {
            this.logoUrl = logoUrl;
            return this;
        }

        public Formation build() {
            return new Formation(this);
        }

    }
}
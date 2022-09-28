package com.qbrainx.website.Testimonial.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Content {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long contentId;
    private String companyName;
    private String destination;
    private String description;


    public Content(){

    }

    public Content(Long contentId, String companyName, String destination, String description) {
        this.contentId = contentId;
        this.companyName = companyName;
        this.destination = destination;
        this.description = description;
    }
}

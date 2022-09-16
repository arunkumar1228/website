package com.qbrainx.website.partner.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class PartnerImage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "image_name")
    private String imageName;

    @Column(name = "image_type")
    private String imageType;

    @Column(name = "image_size")
    private Long imageSize;


    @Column(name = "image_data")
    @Lob
    private byte[] data;

}

package com.qbrainx.website.Life.entity;


import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "image_details")
public class Image {

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
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "image")
    private Text text;

    public Image() {
    }

    public Image(String fileName, String contentType, long size, byte[] bytes) {
    }
}
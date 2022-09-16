package com.qbrainx.website.partner.controller;

import com.qbrainx.website.partner.entity.PartnerImage;
import com.qbrainx.website.partner.service.PartnerImageServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
public class PartnerController {
    @Autowired
    PartnerImageServiceImpl partnerImageService;

    @PostMapping(value = {"/partnerimageupload"}, consumes = {MediaType.MULTIPART_FORM_DATA_VALUE})
    public PartnerImage saveImage(@RequestPart("file") MultipartFile file) throws IOException {

        return partnerImageService.saveImage(file);
    }
}
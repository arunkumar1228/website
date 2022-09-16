package com.qbrainx.website.partner.service;

import com.qbrainx.website.partner.entity.PartnerImage;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface PartnerImageService {

    public PartnerImage saveImage(MultipartFile multipartFile) throws IOException;
}

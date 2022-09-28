package com.qbrainx.website.partner.service;

import com.qbrainx.website.partner.entity.PartnerImage;
import com.qbrainx.website.partner.repo.PartnerImageRepo;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Service
public class PartnerImageServiceImpl implements PartnerImageService{

   private final PartnerImageRepo  partnerImageRepo;

    public PartnerImageServiceImpl(PartnerImageRepo partnerImageRepo) {
        this.partnerImageRepo = partnerImageRepo;
    }

    @Override

    public PartnerImage saveImage(MultipartFile file) throws IOException {
        PartnerImage partnerImage = new PartnerImage();
        partnerImage.setImageName(file.getOriginalFilename());
        partnerImage.setImageSize(file.getSize());
        partnerImage.setImageType(file.getContentType());
        partnerImage.setData(file.getBytes());
        return partnerImageRepo.save(partnerImage);
    }
}

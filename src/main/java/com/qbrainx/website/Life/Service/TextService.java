package com.qbrainx.website.Life.Service;

import com.qbrainx.website.Life.entity.Image;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface TextService {
    public Image saveImage(MultipartFile file) throws IOException;



}

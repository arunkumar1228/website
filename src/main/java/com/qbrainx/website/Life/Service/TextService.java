package com.qbrainx.website.Life.Service;
import com.qbrainx.website.Life.entity.Image;
import com.qbrainx.website.Life.entity.Text;
import com.qbrainx.website.Life.repo.ImageRepo;
import com.qbrainx.website.Life.repo.TextRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Service
public class TextService {

    @Autowired
    TextRepo textRepo;

    @Autowired
    ImageRepo imageRepo;

    public Text saveText(Text text) {
        text.setMessage(text.getMessage());
        return textRepo.save(text);
    }

    public Image saveImage(MultipartFile file) throws IOException {
        Image image = new Image();
        image.setImageName(file.getOriginalFilename());
        image.setImageSize(file.getSize());
        image.setImageType(file.getContentType());
        image.setData(file.getBytes());
        return imageRepo.save(image);

    }
}

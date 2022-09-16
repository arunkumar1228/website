package com.qbrainx.website.Life.Service;

import com.qbrainx.website.Life.entity.Image;
import com.qbrainx.website.Life.entity.Text;
import com.qbrainx.website.Life.repo.ImageRepo;
import com.qbrainx.website.Life.repo.TextRepo;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Service
public class TextServiceImpl implements TextService {


    private final TextRepo textRepo;

    private final ImageRepo imageRepo;

    public TextServiceImpl(TextRepo textRepo, ImageRepo imageRepo) {
        this.textRepo = textRepo;
        this.imageRepo = imageRepo;
    }

    public Text saveText(Text text, MultipartFile file) throws IOException {
        Image image = new Image();
        image.setImageName(file.getOriginalFilename());
        image.setImageSize(file.getSize());
        image.setImageType(file.getContentType());
        image.setData(file.getBytes());
        text.setMessage(text.getMessage());
        text.setImage(image);
        return textRepo.save(text);
    }


    public ResponseEntity<byte[]> getFile(Long id) {
        Image image = imageRepo.findById(id).get();
        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + image.getImageName() + "\"")
                .body(image.getData());
    }

}

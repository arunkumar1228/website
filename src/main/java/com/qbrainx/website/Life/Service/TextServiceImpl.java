package com.qbrainx.website.Life.Service;
import com.qbrainx.website.Life.entity.Image;
import com.qbrainx.website.Life.entity.Text;
import com.qbrainx.website.Life.repo.ImageRepo;
import com.qbrainx.website.Life.repo.TextRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TextServiceImpl implements TextService{

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

    public ResponseEntity<byte[]> getFile(Long id) {
        Image image = imageRepo.findById(id).get();
        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + image.getImageName() + "\"")
                .body(image.getData());
    }

}

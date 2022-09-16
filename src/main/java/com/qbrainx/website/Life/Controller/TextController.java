package com.qbrainx.website.Life.Controller;

import com.qbrainx.website.Life.Service.TextServiceImpl;
import com.qbrainx.website.Life.entity.Image;
import com.qbrainx.website.Life.entity.Text;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
public class TextController {
    @Autowired
    TextServiceImpl textServiceImpl;

    @PostMapping(value = {"/imageupload"}, consumes = {MediaType.MULTIPART_FORM_DATA_VALUE})
    public Text saveText(@RequestPart("text") Text text, @RequestPart("file") MultipartFile file) throws IOException {
        try {
            Image image = textServiceImpl.saveImage(file);
            text.setImage(image);

        } catch (Exception e) {
            e.printStackTrace();
        }


        return textServiceImpl.saveText(text);
    }


}
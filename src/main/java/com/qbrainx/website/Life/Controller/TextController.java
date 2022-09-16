package com.qbrainx.website.Life.Controller;

import com.qbrainx.website.Life.Service.TextServiceImpl;
import com.qbrainx.website.Life.entity.Text;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
public class TextController {


    private final TextServiceImpl textServiceImpl;

    public TextController(TextServiceImpl textServiceImpl) {
        this.textServiceImpl = textServiceImpl;
    }

    @PostMapping(value = {"/imageUpload/{image}"}, consumes = {MediaType.MULTIPART_FORM_DATA_VALUE})
    public Text saveText(@RequestPart("text") Text text, @RequestPart("file") MultipartFile file) throws IOException {


        return textServiceImpl.saveText(text, file);
    }


}
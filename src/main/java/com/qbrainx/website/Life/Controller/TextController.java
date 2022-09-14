package com.qbrainx.website.Life.Controller;
import com.qbrainx.website.Life.Service.TextService;
import com.qbrainx.website.Life.entity.Image;
import com.qbrainx.website.Life.entity.Text;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
public class TextController {
    @Autowired
    TextService textService;

    @PostMapping(value = {"/imageupload"},consumes = {MediaType.MULTIPART_FORM_DATA_VALUE})
    public Text saveText(@RequestPart("text") Text text, @RequestPart("file") MultipartFile file) throws IOException {
try {
    Image image =textService.saveImage(file);
    text.setImage(image);

    } catch (Exception e) {
    e.printStackTrace();
}


        return textService.saveText(text);
    }
}
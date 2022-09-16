package com.qbrainx.website.Life.Service;

import com.qbrainx.website.Life.entity.Image;
import com.qbrainx.website.Life.entity.Text;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface TextService {
    public Text saveText(Text text, MultipartFile file) throws IOException;



}

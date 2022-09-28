package com.qbrainx.website.Testimonial.controller;

import com.qbrainx.website.Testimonial.entity.Content;
import com.qbrainx.website.Testimonial.service.ContentServiceImpl;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContentController {
    private final ContentServiceImpl contentService;

    public ContentController(ContentServiceImpl contentService) {
        this.contentService = contentService;
    }

    @PostMapping("Content/upload")
    public Content saveContent(@RequestBody Content content) {

        return contentService.saveContent(content);
    }
}

package com.qbrainx.website.Testimonial.service;

import com.qbrainx.website.Testimonial.entity.Content;
import com.qbrainx.website.Testimonial.repository.ContentRepository;
import org.springframework.stereotype.Service;

@Service
public class ContentServiceImpl implements ContentService {
   private final ContentRepository contentRepository;

    public ContentServiceImpl(ContentRepository contentRepository) {
        this.contentRepository = contentRepository;
    }

    @Override
    public Content saveContent(Content content) {
        content.setContentId(content.getContentId());
        content.setCompanyName(content.getCompanyName());
        content.setDestination(content.getDestination());
        content.setDescription(content.getDescription());

                return contentRepository.save(content);
    }
}

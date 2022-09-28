package com.qbrainx.website.Testimonial.repository;

import com.qbrainx.website.Testimonial.entity.Content;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContentRepository extends JpaRepository<Content,Long> {
}

package com.qbrainx.website.Life.repo;
import com.qbrainx.website.Life.entity.Text;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TextRepo extends JpaRepository<Text,Long> {
}

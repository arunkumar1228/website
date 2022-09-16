package com.qbrainx.website.partner.repo;

import com.qbrainx.website.partner.entity.PartnerImage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PartnerImageRepo extends JpaRepository<PartnerImage,Long> {

}

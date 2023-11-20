package com.walter.drugs.repos;

import com.walter.drugs.entities.Image;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ImageRepository extends JpaRepository<Image,Long> {
}
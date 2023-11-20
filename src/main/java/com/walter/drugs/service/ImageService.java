package com.walter.drugs.service;

import com.walter.drugs.entities.Image;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface ImageService {
    Image uploadImage(MultipartFile file) throws IOException;
    Image getImageDetails(Long id) throws IOException;
    ResponseEntity<byte[]> getImage(Long id) throws IOException;
    void deleteImage(Long id) ;

    Image uploadImageDru(MultipartFile file,Long idDru) throws IOException;
    List<Image> getImagesParDru(Long druId);

}

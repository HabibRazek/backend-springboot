package com.walter.drugs.restcontrollers;


import com.walter.drugs.entities.Drugs;
import com.walter.drugs.entities.Image;
import com.walter.drugs.service.DrugsService;
import com.walter.drugs.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

@RestController
@RequestMapping("/api/image")
@CrossOrigin(origins = "*")
public class ImageRestController {
    @Autowired
    ImageService imageService ;

    @Autowired
    DrugsService drugsService ;

    @RequestMapping(value = "/upload" , method = RequestMethod.POST)
    public Image uploadImage(@RequestParam("image") MultipartFile file) throws IOException {
        return imageService.uploadImage(file);
    }
    @RequestMapping(value = "/get/info/{id}" , method = RequestMethod.GET)
    public Image getImageDetails(@PathVariable("id") Long id) throws IOException {
        return imageService.getImageDetails(id) ;
    }
    @RequestMapping(value = "/load/{id}" , method = RequestMethod.GET)
    public ResponseEntity<byte[]> getImage(@PathVariable("id") Long id) throws IOException
    {
        return imageService.getImage(id);
    }


    @RequestMapping(value = "/delete/{id}" , method = RequestMethod.DELETE)
    public void deleteImage(@PathVariable("id") Long id){
        imageService.deleteImage(id);
    }
    @RequestMapping(value="/update",method = RequestMethod.PUT)
    public Image UpdateImage(@RequestParam("image")MultipartFile file) throws IOException {
        return imageService.uploadImage(file);
    }


    @PostMapping(value = "/uploadImageDru/{idDru}" )
    public Image uploadMultiImages(@RequestParam("image")MultipartFile file,
                                   @PathVariable("idDru") Long idDru)
            throws IOException {
        return imageService.uploadImageDru(file,idDru);
    }
    @RequestMapping(value = "/getImagesDru/{idDru}" ,
            method = RequestMethod.GET)
    public List<Image> getImagesVid(@PathVariable("idDru") Long idDru)
            throws IOException {
        return imageService.getImagesParDru(idDru);
    }

    @RequestMapping(value = "/uploadFS/{id}" , method = RequestMethod.POST)
    public void uploadImageFS(@RequestParam("image") MultipartFile
                                      file,@PathVariable("id") Long id) throws IOException {
        Drugs v = drugsService.getDrugsById(id);
        v.setImagePath(id+".jpg");

        Files.write(Paths.get(System.getProperty("user.home")+"/images/"+v.getImagePath())
                , file.getBytes());
        drugsService.saveDrugs(v);

    }
    @RequestMapping(value = "/loadfromFS/{id}" ,
            method = RequestMethod.GET,
            produces = org.springframework.http.MediaType.IMAGE_JPEG_VALUE)
    public byte[] getImageFS(@PathVariable("id") Long id) throws IOException {

        Drugs v = drugsService.getDrugsById(id);
        return
                Files.readAllBytes(Paths.get(System.getProperty("user.home")+"/images/"+v.getImagePath()));
    }
}

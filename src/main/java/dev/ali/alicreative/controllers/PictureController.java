package dev.ali.alicreative.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import dev.ali.alicreative.models.Picture;
import dev.ali.alicreative.services.PictureService;
import lombok.AllArgsConstructor;


@AllArgsConstructor
@RestController
@RequestMapping (path = "/api/pictures")
public class PictureController {

    private final PictureService pictureService;

    @GetMapping(value = "")
    public List<Picture> getAllPictures(){
        return pictureService.findAll();
    }

    @GetMapping("/{id}")
    public Picture getfindById(@PathVariable Long id){
        return pictureService.findById(id);
    }

    @PostMapping(value = "add" , consumes = "application/json")
    public ResponseEntity<Picture> createPicture(@RequestBody Picture picture){
        Picture savePicture = pictureService.save(picture);
        return ResponseEntity.status(HttpStatus.CREATED).body(savePicture);
    }

    @PutMapping("/update/{id}")
    public Picture updatePicture(@PathVariable long id, @RequestBody Picture pictureDetails){
        return pictureService.updatePicture(id, pictureDetails);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletePicture(@PathVariable long id){
        pictureService.deleteById(id);
        return ResponseEntity.ok("Picture deleted Successfully");
    }

}

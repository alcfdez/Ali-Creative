package dev.ali.alicreative.services;

import java.util.List;

import org.springframework.stereotype.Service;

import dev.ali.alicreative.models.Picture;
import dev.ali.alicreative.repositories.PictureRepository;

@Service
public class PictureService {
    private PictureRepository repository;

    public PictureService(PictureRepository repository){
        this.repository = repository;
    }

    public List<Picture>getAll(){
        return repository.findAll();
    }

    public Picture save(Picture picture){
        return repository.save(picture);
    }

    public List<Picture> findAll() {
        return null;
    }

    public Picture findById(Long id) {
        return null;
    }

    public Picture updatePicture(long id, Picture pictureDetails) {
        return null;
    }

    public void deleteById(long id) {
    }
}



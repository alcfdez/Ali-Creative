package dev.ali.alicreative.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.ali.alicreative.models.Picture;

public interface  PictureRepository extends JpaRepository<Picture, Long> {
    Optional<Picture> findById(Long id);
    
}

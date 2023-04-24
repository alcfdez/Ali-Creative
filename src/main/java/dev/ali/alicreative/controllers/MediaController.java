package dev.ali.alicreative.controllers;

import java.io.IOException;
import org.springframework.http.HttpHeaders;
import java.nio.file.Files;
import java.util.Map;

import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import dev.ali.alicreative.models.Picture;
import dev.ali.alicreative.services.PictureService;
import dev.ali.alicreative.services.StorageService;
import jakarta.servlet.http.HttpServletRequest;
import lombok.AllArgsConstructor;


@RestController
@RequestMapping("media")
@AllArgsConstructor
public class MediaController {
    private final StorageService storageService;
    private final HttpServletRequest request;
    private final PictureService pictureService;

    @PostMapping("upload")
    public Map<String, String> uploadFile(@RequestParam("file") MultipartFile multiparFile) {

        // Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        // String currentUserName = authentication.getName();
        // user = userRepository.findByUsername(currentUserName)
        //         .orElseThrow(() -> new RuntimeException("User not found with username " + currentUserName));

        //         user.setImage(multiparFile.getOriginalFilename());
        //         userService.save(user);

        String path = storageService.store(multiparFile);
        String host = request.getRequestURL().toString().replace(request.getRequestURI(), "");
        String url = ServletUriComponentsBuilder
                .fromHttpUrl(host)
                .path("/media/")
                .path(path)
                .toUriString();

        return Map.of("url", url);
    }

    @GetMapping("{filename:.+}")
    public ResponseEntity<Resource> getFile(@PathVariable String filename) throws IOException {
        Resource file = storageService.loadAsResource(filename);
        String contentType = Files.probeContentType(file.getFile().toPath());

        return ResponseEntity
                .ok()
                .header(HttpHeaders.CONTENT_TYPE, contentType)
                .body(file);
    }

    @CrossOrigin( origins = "*")
    @PostMapping("upload/picture")
    public Map<String, String> uploadFile(@RequestParam("file") MultipartFile multipartFile, Picture picture) {
        System.out.println(multipartFile.getOriginalFilename());
        // String url = "";
        // if (multipartFile != null) {
            picture.setImage(multipartFile.getOriginalFilename());
            pictureService.save(picture);
    
            String path = storageService.store(multipartFile);
            String host = request.getRequestURL().toString().replace(request.getRequestURI(), "");
            String url = ServletUriComponentsBuilder
                    .fromHttpUrl(host)
                    .path("/media/")
                    .path(path)
                    .toUriString();


// else {
//             postService.save(post);
//         }
    
        return Map.of("url", url);
    }
}


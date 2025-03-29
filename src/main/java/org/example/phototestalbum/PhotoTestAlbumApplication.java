package org.example.phototestalbum;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PhotoTestAlbumApplication {

    public static void main(String[] args) {
        SpringApplication.run(PhotoTestAlbumApplication.class, args);
    }

    @RequestMapping("/")
    public String home(){
        return "Hello World";
    }
}

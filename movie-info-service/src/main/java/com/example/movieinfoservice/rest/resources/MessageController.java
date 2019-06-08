package com.example.movieinfoservice.rest.resources;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    @Value("${message}")
    private String message;

    @GetMapping("/message")
    public String getMessage() {
        return "<h2>" + this.message + "</h2>";
    }

}

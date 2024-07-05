package com.mindfulsoftware.com.spring_web_demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewsController {
    @GetMapping("/name")
    public String appName() {
        return "{ \"appName\": \"News Web App\"}";
    }
}

package com.mindfulsoftware.spring_web_demo.reactssr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReactSSRController {

    @Autowired
    private ReactSSRService reactSSRService;

    @GetMapping("/render")
    public String render(@RequestParam String component, @RequestParam String props) {
        try {
            return reactSSRService.renderComponent(component, props);
        } catch (Exception e) {
            e.printStackTrace();
            return "Error rendering component: " + e.getMessage();
        }
    }
}
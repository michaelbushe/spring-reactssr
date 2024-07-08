package com.mindfulsoftware.spring_web_demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class DemoController {
    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String homePage() {
        System.out.println("[DemoController] Rendering home page");
        return "home";
    }

    @RequestMapping(value = "/welcome", method = RequestMethod.GET)
    public String welcomePage(Model model) {
        System.out.println("[DemoController] Rendering welcome page");
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyy hh:mm:ss");
        String formattedDate = formatter.format(date);
        model.addAttribute("now", formattedDate);
        return "welcome";
    }
}

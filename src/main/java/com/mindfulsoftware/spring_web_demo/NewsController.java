package com.mindfulsoftware.spring_web_demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

@RestController
public class NewsController {
    static String host = "https://newsapi.org/v2/top-headlines";
    static String NEWS_API_KEY = "8a6bc5cce01b47af8ee9e26b2a37308e";
    static String categoryString = "country=US&category=business";
    static String newsRESTUrl =  host + "?" + categoryString + "&apiKey=" +NEWS_API_KEY;
    @GetMapping("/name")
    public String appName() {
        return "News Web App";
    }

    @GetMapping("/news")
    public LinkedHashMap<String, Object> getNews(){
        LinkedHashMap<String, Object> newsMap = new LinkedHashMap<>();
        newsMap.put("status", "OK");
        com.mindfulsoftware.com.spring_web_demo.NewsModel news1 = new com.mindfulsoftware.com.spring_web_demo.NewsModel("john", "News Article 1", "This is news 1");
        com.mindfulsoftware.com.spring_web_demo.NewsModel news2 = new com.mindfulsoftware.com.spring_web_demo.NewsModel("jennie", "News Article 2", "This is news 2");
        com.mindfulsoftware.com.spring_web_demo.NewsModel news3 = new com.mindfulsoftware.com.spring_web_demo.NewsModel("fionna", "News Article 3", "This is news 3");
        com.mindfulsoftware.com.spring_web_demo.NewsModel news4 = new com.mindfulsoftware.com.spring_web_demo.NewsModel("john", "News Article 4", "This is news 4");
        com.mindfulsoftware.com.spring_web_demo.NewsModel news5 = new com.mindfulsoftware.com.spring_web_demo.NewsModel("dave", "News Article 5", "This is news 5");
        com.mindfulsoftware.com.spring_web_demo.NewsModel news6 = new com.mindfulsoftware.com.spring_web_demo.NewsModel("john", "News Article 6", "This is news 6");
        com.mindfulsoftware.com.spring_web_demo.NewsModel news7 = new com.mindfulsoftware.com.spring_web_demo.NewsModel("jennie", "News Article 7", "This is news 7");
        List<com.mindfulsoftware.com.spring_web_demo.NewsModel> news =  List.of(news1, news2, news3, news4, news5, news6, news7);
        newsMap.put("total", news.size());
        newsMap.put("articles", news);
        return newsMap;
    };
}

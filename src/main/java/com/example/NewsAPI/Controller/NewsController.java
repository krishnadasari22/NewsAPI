package com.example.NewsAPI.Controller;

import com.example.NewsAPI.Entity.News;
import com.example.NewsAPI.Repository.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NewsController {
    @Autowired
    private NewsRepository newsRepository;

    @GetMapping("/news")
    public List<News> getTopNews() {
        return newsRepository.findAll();
    }
}


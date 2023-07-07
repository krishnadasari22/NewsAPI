package com.example.NewsAPI.Service;

import com.example.NewsAPI.Entity.News;
import com.example.NewsAPI.Repository.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class NewsService {
   private static final String NEWS_API_URL = "https://api.example.com/news";

    @Autowired
    private NewsRepository newsRepository;

    public void fetchAndSaveNews() {
        RestTemplate restTemplate = new RestTemplate();
        News[] newsArray = restTemplate.getForObject(NEWS_API_URL, News[].class);
        if (newsArray != null) {
            for (News news : newsArray) {
                newsRepository.save(news);
            }
        }
    }
}


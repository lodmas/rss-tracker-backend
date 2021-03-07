package jskno.news.rsstracker.controller;

import jskno.news.rsstracker.model.RssNews;
import jskno.news.rsstracker.services.RssNewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/news")
@CrossOrigin
public class RssTrackerController {

    private RssNewsService rssNewsService;

    @Autowired
    public RssTrackerController(RssNewsService rssNewsService) {
        this.rssNewsService = rssNewsService;
    }

    @GetMapping
    public Map<String, List<RssNews>> getRssNewsByKeyword() {
        System.out.println("You got here... !!!");
        Map<String, List<RssNews>> map = rssNewsService.fetchRssNewsByKeyword();
        return map;
    }
}

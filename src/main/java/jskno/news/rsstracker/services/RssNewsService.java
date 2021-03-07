package jskno.news.rsstracker.services;

import jskno.news.rsstracker.model.RssNews;

import java.util.List;
import java.util.Map;

public interface RssNewsService {

    Map<String, List<RssNews>> fetchRssNewsByKeyword();
}

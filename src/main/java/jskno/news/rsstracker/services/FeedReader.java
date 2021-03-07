package jskno.news.rsstracker.services;

import jskno.news.rsstracker.model.RssNews;

import java.util.List;

public interface FeedReader {

    List<RssNews> getRssNewsByURL(String url);

}

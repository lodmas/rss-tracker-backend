package jskno.news.rsstracker.services;

import jskno.news.rsstracker.model.Keywords;
import jskno.news.rsstracker.model.RssNews;
import jskno.news.rsstracker.model.RssUrls;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.spi.AbstractResourceBundleProvider;
import java.util.stream.Collectors;

@Service
public class RssNewsServiceImpl implements RssNewsService {

    private FeedReader feedReader;

    @Autowired
    public RssNewsServiceImpl(FeedReader feedReader) {
        this.feedReader = feedReader;
    }

    @Override
    public Map<String, List<RssNews>> fetchRssNewsByKeyword() {
        List<RssNews> allNews = EnumSet.allOf(RssUrls.class)
                .stream()
                .map(rssUrls -> feedReader.getRssNewsByURL(rssUrls.getUrl()))
                .flatMap(Collection::stream)
                .collect(Collectors.toList());

        return classifyByKeyword(allNews);
    }

    private Map<String, List<RssNews>> classifyByKeyword(List<RssNews> allNews) {
        Map<String, List<RssNews>> newsClassifiedByKey = createStructure();

        ListIterator<RssNews> iterator = allNews.listIterator();

        while (iterator.hasNext()) {
            classifiedRssNewsInMap(newsClassifiedByKey, iterator);
        }

        return newsClassifiedByKey;
    }

    private void classifiedRssNewsInMap(Map<String, List<RssNews>> newsClassifiedByKey,
                                        ListIterator<RssNews> iterator) {

        RssNews rssNews = iterator.next();
        for(Keywords keyword : Keywords.values()) {
            for(String literal : keyword.getLiterals()) {
                if (rssNews.getTitle().contains(literal) ||
                        rssNews.getDescription().contains(literal)) {
                    newsClassifiedByKey.get(keyword.name()).add(rssNews);
                    iterator.remove();
                    return;
                }
            }
        }
    }

    private Map<String, List<RssNews>> createStructure() {
        return EnumSet.allOf(Keywords.class)
                .stream()
                .collect(Collectors.toMap(
                        Keywords::name,
                        keyword -> new ArrayList()));
    }
}

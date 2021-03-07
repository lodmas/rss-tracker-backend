package jskno.news.rsstracker.services;

import com.rometools.rome.feed.synd.SyndFeed;
import com.rometools.rome.io.FeedException;
import com.rometools.rome.io.SyndFeedInput;
import com.rometools.rome.io.XmlReader;
import jskno.news.rsstracker.model.RssNews;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class FeedReaderImpl implements FeedReader {

    public List<RssNews> getRssNewsByURL(String url) {

        URL feedSource = null;
        try {
            feedSource = new URL(url);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        SyndFeedInput input = new SyndFeedInput();
        SyndFeed feed = null;
        try {
            feed = input.build(new XmlReader(feedSource));
        } catch (FeedException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return feed.getEntries().stream()
                .map(syndEntry -> RssNews.builder()
                        .title(syndEntry.getTitle())
                        .description(syndEntry.getDescription() != null ?
                                syndEntry.getDescription().getValue() : "")
                        .link(syndEntry.getLink())
                        .build())
                .collect(Collectors.toList());
    }
}

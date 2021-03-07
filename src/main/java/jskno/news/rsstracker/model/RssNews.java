package jskno.news.rsstracker.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RssNews {

    public String title;
    public String description;
    public String link;
    public Boolean selected = false;
}

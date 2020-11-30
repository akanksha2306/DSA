import filtering.AuthorFeedFilter;
import filtering.FilterStrategy;
import filtering.UserFeedFilter;
import ranking.DsFeedRanker;
import ranking.RandomFeedRanker;
import ranking.RankerStrategy;
import requests.FeedRequest;

public class FeedManager {

    FilterStrategy filterStrategy;
    RankerStrategy rankerStrategy;

    public FilterStrategy getFilterStrategy() {
        return filterStrategy;
    }

    public void setFilterStrategy(FilterStrategy filterStrategy) {
        this.filterStrategy = filterStrategy;
    }

    public RankerStrategy getRankerStrategy() {
        return rankerStrategy;
    }

    public void setRankerStrategy(RankerStrategy rankerStrategy) {
        this.rankerStrategy = rankerStrategy;
    }

    public int[] filter(FeedRequest feedRequest){
        return filterStrategy.filterFeed(feedRequest);
    }

    public int[] rank(int[] postIds){
        return rankerStrategy.rankFeed(postIds);
    }

    public static void main(String[] args) {

        FeedManager feedManager = new FeedManager();
        feedManager.setFilterStrategy(new AuthorFeedFilter());
        feedManager.setRankerStrategy(new RandomFeedRanker());

        int[] postIds = feedManager.filter(new FeedRequest());
        int[] rankedPostIds = feedManager.rank(postIds);
    }
}

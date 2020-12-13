package filtering;

import requests.FeedRequest;

public class TopicFeedFilter implements FilterStrategy {
    @Override
    public int[] filterFeed(FeedRequest feedRequest) {
        // logic
        return new int[0];
    }
}

package filtering;

import requests.FeedRequest;

public class DefaultFeedFilter implements FilterStrategy {
    @Override
    public int[] filterFeed(FeedRequest feedRequest) {
        // logic
        return new int[0];
    }
}

package filtering;

import requests.FeedRequest;

public interface FilterStrategy {

    int[] filterFeed(FeedRequest feedRequest);
}

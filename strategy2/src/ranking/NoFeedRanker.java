package ranking;

public class NoFeedRanker implements RankerStrategy {
    @Override
    public int[] rankFeed(int[] postIds) {
        return postIds;
    }
}

package ranking;

public class RandomFeedRanker implements RankerStrategy {
    @Override
    public int[] rankFeed(int[] postIds) {
        return postIds;
    }
}

package ranking;

public class DsFeedRanker implements RankerStrategy {
    @Override
    public int[] rankFeed(int[] postIds) {
        return postIds;
    }
}

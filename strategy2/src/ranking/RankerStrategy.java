package ranking;

public interface RankerStrategy {
    int[] rankFeed(int[] postIds);
}

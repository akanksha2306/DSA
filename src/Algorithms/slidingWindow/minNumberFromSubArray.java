package Algorithms.slidingWindow;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
//identification of sliding window-

/**
 * arr OR String might be given
 * Subarray/Substring might be given
 * window size = k
 * all above 3 points are indentification of sliding window
 */
public class minNumberFromSubArray {

    public static int maxOfMins(int[] arr, int k) {

        List<Integer> givenList = new ArrayList<>();
        // Iterate through the array
        for (int t : arr) {
            givenList.add(t);
        }

        int max = Integer.MIN_VALUE;

        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        int start = 0;
        int end;
        for (end = 0; end < k; end++) {
            pq.add(givenList.get(end));
        }

        int minOfKWindow = pq.peek();

        max = Math.max(max, minOfKWindow);

        for (; end < givenList.size(); end++) {
            pq.remove(givenList.get(start));
            pq.add(givenList.get(end));

            minOfKWindow = pq.peek();
            max = Math.max(max, minOfKWindow);

            start++;

        }
        System.out.println("max is:-> " + max);
        return max;
    }


    public static void main(String[] args) {

    }
}
package sde_questions.arrays.mergerOverlappingSubIntervals;

import java.util.LinkedList;
import java.util.List;

public class Solution {

    static int[][] mergeOverlappingIntervals(int[][] arr) {

        List<int[]> ret = new LinkedList<>();

        int x = arr[0][0];
        int y = arr[0][1];

        for (int i = 1; i < arr.length; i++) {
            if (y >= arr[i][0]) {
                y = Math.max(y, arr[i][1]);
            } else {
                x = arr[i][0];
                y = arr[i][1];
                ret.add(new int[]{x, y});
            }
        }
        ret.add(new int[]{x, y});
        int[][] out = new int[ret.size()][];
        out = ret.toArray(out);
        return out;

    }

    public static void main(String[] args) {
        int[][] arr = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] ans = mergeOverlappingIntervals(arr);
        System.out.println(ans);
    }


    //(1,3)(2,6)(4,8)(9,13)
}

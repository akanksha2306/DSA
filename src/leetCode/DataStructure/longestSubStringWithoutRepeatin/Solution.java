package leetCode.DataStructure.longestSubStringWithoutRepeatin;

import java.util.HashSet;

public class Solution {

    public static int lengthOfLongestSubstring(String s) {


        char[] y = s.toCharArray();
        int start = 0;
        int end = 0;
        int max = 0;
        HashSet<Character> hash_set = new HashSet();

        //end will go till end and will expand and will keep moving

        while (end < y.length) {
            if (!hash_set.contains(y[end])) {

                hash_set.add(y[end]);

                end++;

                max = Math.max(hash_set.size(), max);
            } else {
                hash_set.remove(y[start]);
                start++;
            }

        }
        return max;

    }


    public static void main(String[] args) {
        String s = "pwwkew";
        int ans = lengthOfLongestSubstring(s);
        System.out.print(ans);


    }
}

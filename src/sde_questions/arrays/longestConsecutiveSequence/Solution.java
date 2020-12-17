package sde_questions.arrays.longestConsecutiveSequence;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public static int longestConsecutive(int[] nums) {

        if(nums.length<=0)
            return 0;

        Set<Integer> set = new HashSet<Integer>();

        for(int num: nums){
            set.add(num);
        }

        int ls = 1;

        for(int num: nums){
            if(!set.contains(num-1)){
                int currentNum = num;
                int currentStreak = 1;

                while(set.contains(currentNum +1)){
                    currentNum =  currentNum+1;
                    currentStreak += 1;
                }
                ls=Math.max(ls,currentStreak);
            }

        }
        return ls;

    }

    public static void main(String[] args) {
        int [] arr = new int[]{100,4,99, 3,2,1,0};
        int ans = longestConsecutive(arr);
        System.out.println("ans is" +" "+ ans);
    }
}


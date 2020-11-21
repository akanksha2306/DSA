package sde_questions.arrays.findMissing;

public class Solution {

    public int missingNumber(int[] nums) {

        int n = nums.length;
        int output = 0;
        for (int ele : nums) {
            output = output + ele;
        }
        return (n * (n + 1) / 2 - output);
    }
}

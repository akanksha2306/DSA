package sde_questions.arrays.fourSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class four_sum {


    //0,0,-1,-1,-2,2
    //target =0;

    static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        int n =nums.length;
        int front = 0;
        int back = n - 1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                int target2 = target-nums[i]-nums[j];


                while(front<back){

                    if(target2>nums[front]+ nums[back])back--;
                    else if(target2<nums[front]+ nums[back])front++;
                    else{
                        List<Integer> quad = new ArrayList<>();
                        quad.add(nums[i]);
                        quad.add(nums[j]);
                        quad.add(nums[front]);
                        quad.add(nums[back]);

                        while(front<back && nums[front]== quad.get(2)) front++;
                        while(front<back && nums[back]== quad.get(3)) back--;
                        res.add(quad);

                    }
                }

                while(j+1<n && nums[j+1] == nums[j])j--;
                while(i+1<n && nums[i+1] == nums[i])i++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,0,-1,0,-2,2};
       List<List<Integer>> list =  fourSum(arr,0);
        System.out.println(Arrays.toString(list.toArray()));

    }
}
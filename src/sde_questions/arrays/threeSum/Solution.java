package sde_questions.arrays.threeSum;

import javafx.util.Pair;

import java.lang.reflect.Array;
import java.util.*;
//https://www.youtube.com/watch?v=-SJrqMyQoNg
public class Solution {

    public static List<List<Integer>> threeSum(int[] nums) {
        if(nums.length == 0 || nums == null){
            return new ArrayList<>();
        }
        Arrays.sort(nums); //nlogn
        Set<List<Integer>> res = new HashSet<>();
        for(int i=0; i<nums.length-2; i++){
            int j = i+1;int k = nums.length-1;
            while(j<k){
                if(nums[i]+nums[j]+nums[k] > 0)k--;
                else if(nums[i]+nums[j]+nums[k] < 0)j++;
                else{
                   // if(!set.contains( new Pair(nums[i],nums[j]))){
                        res.add(new ArrayList<>(Arrays.asList(nums[i], nums[j], nums[k])));
                        //set.add(new Pair(nums[i],nums[j]));
                   // }
                    j++;
                    k--;
                }
            }
        }
        return new ArrayList<>(res);

    }

    public static void main(String[] args) {
        int[] nums = new int[]{};
        List<List<Integer>> list = threeSum(nums);
        System.out.println(list);

    }

}

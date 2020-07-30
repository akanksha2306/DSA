package leetCode.DataStructure.NearesGreaterOnRight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

//https://www.geeksforgeeks.org/next-greater-element/
//https://www.geeksforgeeks.org/find-the-nearest-smaller-numbers-on-left-side-in-an-array/
class Solution {
    public int[] nextGreaterRight(int[] nums1, int[] nums2) {
        Stack<Integer> s = new Stack<>();

        //start from right of num2
        int size1 = nums1.length;
        int size2 = nums2.length;

        int[] tempResult = new int[size2];

        // System.out.println("stack values" + s);

        for (int i = size2 - 1; i >= 0; i--) {

            while (!s.empty() && s.peek() <= nums2[i]) {
                s.pop();
            }
            if (s.empty()) {
                tempResult[i] = -1;
            } else {
                tempResult[i] = s.peek();
            }
            s.push(nums2[i]);
        }

        List<Integer> nums2List = new ArrayList<Integer>(nums2.length);
        for (int i : nums2) {
            nums2List.add(i);
        }

        System.out.println(Arrays.toString(nums2));
        System.out.println(Arrays.toString(nums2List.toArray()));

        int[] result = new int[size1];

        for (int i = 0; i < size1; i++) {
            int j = nums2List.indexOf(nums1[i]);
            System.out.println("j is" + j);
            System.out.println("nums1[i] is" + nums1[i]);
            result[i] = tempResult[j];
        }

        return result;
    }


    public static void main(String[] args) {

        int[] result = new Solution().nextGreaterRight(new int[]{4, 1, 2}, new int[]{1, 3, 4, 2});
        // System.out.print(result);
        System.out.print(Arrays.toString(result));

    }


}

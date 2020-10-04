package sde_questions.Two_Pointer;

public class Two_pointer {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0)
            return 0;

        int j = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                nums[j] = nums[i];
                j++;
            }
            //now we will transfer the last element into jth position
            nums[j] = nums[nums.length - 1];
            //System.out.println(nums.toString());
        }
        System.out.println("the value of j is" + " " + j);
        return ++j;

    }
    //space complexity will be o(1)- no space is being used.
    //time complexity will o(n)- since one for loop which will run n number of times, n is length of array.


    public static void main(String[] args) {
        int[] arr = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int ans = removeDuplicates(arr);
        System.out.println(ans);
    }
}


package sde_questions.arrays;

public class reverseArray {

    static int[] solution(int[] arr, int start, int end){

         start = 0;
         end = arr.length-1;

        while(start<end){
            int temp=arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        return arr;
    }
}

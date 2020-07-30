package leetCode.DataStructure.StockSpanProblem;

import java.util.Arrays;
import java.util.Stack;

public class spp {

    public int[] spp1(int a[]) {
//we have to keep the record of ngl and index of ngl, so we will use pair to store it
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();


        int size = a.length;
        //now along with nearest greater element , we need to store the index too

        int[] result = new int[size];
        //iterating over the given array in the question
        for (int i = 0; i < size; i++) {

            while (!stack1.empty() && stack1.peek() < a[i]) {
                stack1.pop();
            }
            if (stack1.empty()) {
                result[i] = -1;
            } else {
                    result[i] = stack2.peek();

            }
            stack1.push(a[i]);
            stack2.push(i);

        }

//        for(int i =0; i<result.length; i++){
//            result[i]= i-result[i];
//        }
        return result;
    }

    public static void main(String[] args) {
        int[] result = new spp().spp1(new int[]{100, 80, 60, 70, 60, 75, 85});
        // System.out.print(result);
        System.out.print(Arrays.toString(result));

    }

}



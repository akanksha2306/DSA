package leetCode.DataStructure.NearestGeaterToLeft;

import java.util.Arrays;
import java.util.Stack;

public class nextGreaterLeft {
    public int[] ngl(int a[]) {

        Stack<Integer> s = new Stack<>();
        int Size = a.length;

        int[] result = new int[Size];
        //iterating over the given array in the question
        for (int i = 0; i < Size; i++) {

            while (!s.empty() && s.peek() < a[i]) {
                s.pop();
            }
            if (s.empty()) {
                result[i] = -1;
            }
            else{
                result[i] = s.peek();
            }
            s.push(a[i]);

        }
        return result;
    }

    public static void main(String[] args) {
        int[] result = new nextGreaterLeft().ngl(new int[]{100,80,60,70,60,75,85});
        // System.out.print(result);
        System.out.print(Arrays.toString(result));

    }

}



package DataStructures.Stack.nearestGreaterToLeft;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Ngl {

    public List<Integer> nearestLargestToLeft(int[] arr) {
        int n = arr.length;

        Stack<Integer> s = new Stack<>();
        List<Integer> list = new ArrayList<>();



        if (s.empty()) {
            list.add(-1);
        }

        s.push(arr[0]);

        //pushed arrays 0th element onto the stack


        for (int i = 1; i < n; i++) {

            while (!s.empty() && s.peek() <= arr[i]) {
                s.pop();
                //list.add(-1);
            }
            if (s.empty()) {
                list.add(-1);
            }

            if (!s.empty() && s.peek() >= arr[i]) {
                list.add(s.peek());
            }

            s.push(arr[i]);
        }

        return list;

    }

    public static void main(String[] args) {
        int[] arr = new int[]{401, 5, 6000, 900};
        Ngl n = new Ngl();
        System.out.println(n.nearestLargestToLeft(arr));
    }
}

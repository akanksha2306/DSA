package DataStructures.Stack.nearestGreaterToRight;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class NGR {
//3,4,4,-1
    //1,3,2,4

    //stack = 4,

    public List<Integer> nextGreaterRight(int[] nums1, int n) {

        n = nums1.length;

        Stack s = new Stack();

        List<Integer> list = new ArrayList<>();

        //push 4 on the stack
        s.push(nums1[n - 1]);
        //if stack is empty then push - 1 on the list
        if (s.empty()) {
            list.add(-1);
        }
        //now iterate array from last
        for (int i = n - 1; i >= 0; i--) {

            int elementToped = (int) s.peek();

            while (!s.empty() && elementToped <= nums1[i]) {
                s.pop();
                list.add(-1);
            }

            //agar stack ka top element bada hua, then usko add kardo list main


            if (!s.empty() && elementToped > nums1[i]) {
                list.add(elementToped);
            }

            s.push(nums1[i]);
        }

//        while(!s.empty()){
//            int element = (int)s.pop();
//            int next = -1;
//
//
//        }
        Collections.reverse(list);
        return list;

    }
}




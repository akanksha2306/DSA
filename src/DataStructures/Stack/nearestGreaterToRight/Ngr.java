package DataStructures.Stack.nearestGreaterToRight;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class Ngr {
//3,4,4,-1
    //1,3,2,4

    //stack = 4,

    public List<Integer> nextGreaterRight(int[] nums1) {

        int n = nums1.length;

        Stack<Integer> s = new Stack<>();
        List<Integer> list = new ArrayList<>();

//        if (s.empty()) {
//            list.add(-1);
//        }
        s.push(nums1[n - 1]);
        //if stack is empty then push - 1 on the list

        //now iterate array from last
        for (int i = n - 1; i >= 0; i--) {

            while (!s.empty() && s.peek() <= nums1[i]) {
                s.pop();
                //list.add(-1);
            }
            if (s.empty()) {
                list.add(-1);
            }
            //agar stack ka top element bada hua, then usko add kardo list main
            if (!s.empty() && s.peek() > nums1[i]) {
                list.add(s.peek());
            }
            s.push(nums1[i]);
        }

        while(!s.empty()){
            int element = (int)s.pop();
            int next = -1;


        }
        Collections.reverse(list);
        return list;

    }

    public static void main(String[] args) {

        int[] arr = new int[]{40, 5, 6, 9};
        Ngr n = new Ngr();
        System.out.println(n.nextGreaterRight(arr));

    }
}

//public class Solution {
//    public ListNode oddEvenList(ListNode head) {
//        if (head == null) return null;
//        ListNode odd = head, even = head.next, evenHead = even;
//        while (even != null && even.next != null) {
//            odd.next = even.next;
//            odd = odd.next;
//            even.next = odd.next;
//            even = even.next;
//        }
//        odd.next = evenHead;
//        return head;
//    }
//}

//    public boolean isValid(String s) {
//        Stack<Character> stack = new Stack<Character>();
//        for (char c : s.toCharArray()) {
//            if (c == '(')
//                stack.push(')');
//            else if (c == '{')
//                stack.push('}');
//            else if (c == '[')
//                stack.push(']');
//            else if (stack.isEmpty() || stack.pop() != c)
//                return false;
//        }
//        return stack.isEmpty();
//    }
package sde_questions.linkList.intersectionOfTwoLll;

import DataStructures.LinkedLists.ListNode;

public class Solution {

    public int length(ListNode head){
        int c = 0;
        while(head != null){
            head = head.next;
            c++;
        }
        return c;
    }


    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null){
            return null;
        }

        ListNode dummyA = headA;
        ListNode dummyB = headB;
        int lengthOfA = length(headA);
        int lengthOfB = length(headB);
        int diff = Math.abs(lengthOfA-lengthOfB);

        while(diff-->0){
            if(lengthOfA>lengthOfB){
                dummyA = dummyA.next;
            }
            else
            {
                dummyB = dummyB.next;
            }
        }
        while(dummyA != dummyB){//here why not dummyA.next != dummyB.next??
            dummyA = dummyA.next;
            dummyB = dummyB.next;
        }
        return dummyA;
    }
}

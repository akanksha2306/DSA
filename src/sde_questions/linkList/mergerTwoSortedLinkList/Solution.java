package sde_questions.linkList.mergerTwoSortedLinkList;

import DataStructures.LinkedLists.ListNode;

public class Solution {


    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode head = new ListNode(0);
        ListNode dummyhead = head;

        if(l1 == null){
            return l2;
        }
        if(l2 == null){
            return l1;
        }

        while(l1 != null && l2 != null){
            if(l1.val <= l2.val){
                dummyhead.next = l1;
                l1 = l1.next;
            }
            else{
                dummyhead.next = l2;
                l2 = l2.next;
            }
            dummyhead = dummyhead.next;
        }

        if(l1 != null){
            dummyhead.next = l1;
            l1 = l1.next;
        }
        if(l2 != null){
            dummyhead.next = l2;
            l2 = l2.next;
        }

        return head.next;
    }

    public static void main(String[] args) {

    }
}

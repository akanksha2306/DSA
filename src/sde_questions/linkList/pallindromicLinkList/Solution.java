package sde_questions.linkList.pallindromicLinkList;

import DataStructures.LinkedLists.ListNode;

public class Solution {

    ListNode reverse(ListNode head){

        ListNode r = null;
        ListNode q = null;
        ListNode p = head;
        while( p != null){
            r = q;
            q=p;
            p = p.next;
            q.next = r;
        }
        head = q;
        return head;
    }

    public boolean isPalindrome(ListNode head) {

        //find the middle of the link list
        ListNode slow_p = head;
        ListNode fast_p = head;
        ListNode mid = null;

        while(fast_p != null && fast_p.next != null){
            slow_p = slow_p.next;
            fast_p = fast_p.next.next;
        }
        //if linked lists blocks are even
        if(fast_p == null){
            mid = slow_p;
        }//if linked lists blocks are odd
        if(fast_p != null){
            mid = slow_p.next;
        }

        ListNode reversed=reverse(mid);

        while(reversed != null){
            if(head.val != reversed.val){
                return false;
            }
            else{
                head = head.next;
                reversed = reversed.next;
            }
        }
        return true;
    }
}

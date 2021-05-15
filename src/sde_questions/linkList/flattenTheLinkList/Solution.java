package sde_questions.linkList.flattenTheLinkList;

import bst.Node;
//https://www.youtube.com/watch?v=F-oPHhK1em0
//https://leetcode.com/problems/flatten-a-multilevel-doubly-linked-list/submissions/https://leetcode.com/problems/flatten-a-multilevel-doubly-linked-list/submissions/
import java.util.Stack;

public class Solution {
    public Node flatten(Node head) {

        Node curr = head;
        Node tail = head;

        Stack<Node> stack = new Stack<>();

        while (curr != null) {

            if (curr.child != null) {

                Node child = curr.child;

                if (curr.next != null) {

                    stack.push(curr.next);
                    curr.next.prev = null;
                }

                curr.next = child;
                child.prev = curr;
                curr.child = null;

            }
            tail = curr;
            curr = curr.next;
        }

        while (!stack.isEmpty()) {
            curr = stack.pop();
            tail.next = curr;
            curr.prev = tail;
            while (curr != null) {
                tail = curr;
                curr = curr.next;
            }
        }

        return head;
    }
}


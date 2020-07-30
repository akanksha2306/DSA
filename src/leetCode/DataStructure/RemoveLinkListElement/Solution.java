package leetCode.DataStructure.RemoveLinkListElement;

public class Solution {
    ListNode head ;
    ListNode temp = head;


    //Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public void printList()
    {
        ListNode tnode = head;
        while (tnode != null)
        {
            System.out.print(tnode.val+" ");
            tnode = tnode.next;
        }
    }



    public void push(int new_data)
    {
        ListNode new_node = new ListNode(new_data);
        new_node.next = head;
        head = new_node;
    }

    public ListNode removeElements(int val) {

        ListNode prevNode = null;

        while(temp != null){

            if(temp.next != null && temp.val != val){
                prevNode = temp;
                temp = temp.next;
            }
        }

        prevNode.next = temp.next;
        return temp;

    }

    public static void main(String[] args) {

        Solution llist = new Solution();
        llist.push(7);
        llist.push(1);
        llist.push(6);
        llist.push(2);

        llist.printList();

        llist.removeElements(1);
        llist.printList();

    }

}


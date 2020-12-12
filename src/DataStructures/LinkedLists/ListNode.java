package DataStructures.LinkedLists;


public class ListNode {


    public int val;
    public ListNode next;


    public ListNode(int data) {
        this.val = data;
    }

    public int getData() {
        return val;
    }


    public void setData(int data) {
        this.val = data;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + val +
                ", next=" + next +
                '}';
    }
}

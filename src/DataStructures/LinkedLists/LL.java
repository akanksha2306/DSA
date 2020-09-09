package DataStructures.LinkedLists;

public class LL {

    ListNode head;

    public void insertNodeAtHead(int data) {

        //create a newNode object

        ListNode newNode = new ListNode(data);

        newNode.setNext(this.head);
        this.head = newNode;

    }

    public void deleteTheNodeStart(){
        this.head = head.getNext();
    }

    public int length() {

        ListNode current = head;
        int count = 0;

        while (current != null) {
            current = current.getNext();
            count++;
        }

        return count;

    }


    @Override
    public String toString() {

        String result = "{";

        ListNode current = this.head;

        while (current != null) {
            result += current.toString() + ",";
            current = current.getNext();
        }

        result += "}";
        return result;

    }

}

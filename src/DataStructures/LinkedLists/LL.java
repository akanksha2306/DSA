package DataStructures.LinkedLists;

public class LL {

    Node head;

    public void insertNodeAtHead(int data) {

        //create a newNode object

        Node newNode = new Node(data);

        newNode.setNext(this.head);
        this.head = newNode;

    }

    public void deleteTheNodeStart(){
        this.head = head.getNext();
    }

    public int length() {

        Node current = head;
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

        Node current = this.head;

        while (current != null) {
            result += current.toString() + ",";
            current = current.getNext();
        }

        result += "}";
        return result;

    }

}

package DataStructures.LinkedLists;

public class Demo {

    public static void main(String[] args) {
        LL list = new LL();


        list.insertNodeAtHead(4);
        list.insertNodeAtHead(6);
        list.insertNodeAtHead(20);
        list.insertNodeAtHead(26);
        list.insertNodeAtHead(36);

        list.deleteTheNodeStart();


        System.out.println(list);
        System.out.println("length" + list.length());


    }
}



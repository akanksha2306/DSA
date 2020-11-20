package collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListImplementations {


    public static void main(String[] args) {
        int n =10;
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        ArrayList<String> arrayList2 = new ArrayList<String>();
        for(int i =0; i<=n; i++){
            arrayList.add(i);

        }
        System.out.println(arrayList);
        arrayList.remove(2);

        arrayList2.add("geeks");
        arrayList2.add("for");
        arrayList2.add("geeks");
        System.out.println(arrayList2);
        arrayList2.set(1,"kkeckjacka ");
        System.out.println(arrayList2);
        arrayList2.remove("geeks"); //If there are multiple such objects, then the first occurrence of the object is removed.
        arrayList2.remove(1);
        arrayList2.get(1);

        for (String s : arrayList2) {
            System.out.print(s + " ");
        }

        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList.add(3);
        linkedList.set(0,4);
       // linkedList.addLast();
        //linkedList.addAll();
        linkedList.peekFirst();
        linkedList.pollFirst();
        linkedList.pollLast();


    }




}

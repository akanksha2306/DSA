package Test;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class byteMark {

    public void test(int[] arr, int d) {

        //Input1: {20,10,100,30,50}
        //d: 1000

        List<MyPair> myPairs = new ArrayList<>();

        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int x : arr) {
            hm.put(x, 1);
        }

        for (int i = 0; i <= arr.length - 1; i++) {
            int val = d / arr[i];

            if (hm.containsKey(val)) {
                MyPair obj = new MyPair(val, arr[i]);
                if (!myPairs.contains(obj)) {
                    myPairs.add(obj);
                }
            }
        }


        System.out.println("myPair" + " " + myPairs.toString());
    }

    class MyPair {
        int x;
        int y;

        @Override
        public String toString() {
            return "MyPair{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }

        public MyPair(int x, int y) {
            this.x = x;
            this.y = y;
        }


    }

//    public static void main(String[] args) {
//        byteMark ans = new byteMark();
//        int[] arr = {20, 10, 100, 30, 50};
//        int d = 1000;
//        ans.test(arr, d);
//    }

// Question: byteMark
    public static void main(String[ ] args) {
        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]);
        } catch (Exception e) {
            e.printStackTrace();
            throw  e;
            //throw new RuntimeException();
        }

        System.out.println("nnn");
        System.out.println("llllll ");
    }
}

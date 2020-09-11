package DataStructures.Stack.stockSpanProblem;

import java.util.*;

public class spp {

    public List<Integer> stockSpan(int[] arr) {

        Stack<Integer> stack = new Stack<>();

        Stack<Integer> s = new Stack<>();
        List<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer>hm = new HashMap<Integer, Integer>();
        if (s.empty()) {
            list.add(-1);
        }

        s.push(arr[0]);
        for (int i = 0; i < arr.length; i++) {

            while (!s.empty() && s.peek() < arr[i]) {
                s.pop();
                //list.add(-1);
            }
            if (s.empty()) {
                hm.put(-1,i);
            }
            if (!s.empty() && s.peek() > arr[i]) {
                //list.add(s.peek());
                hm.put(s.peek(),i);
                System.out.println( );
            }
            s.add(i,arr[i] );
        }
        for(int i = 0; i<list.size(); i++){
            int v = i -list.indexOf(i);
            list.add(v);
        }

        return list;
    }


        public static void main (String[]args){
            int[] arr = new int[]{401, 5, 6000, 900};
            DataStructures.Stack.stockSpanProblem.spp n = new DataStructures.Stack.stockSpanProblem.spp();
            System.out.println(n.stockSpan(arr));
        }
    }


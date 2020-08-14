package Algorithms;

import java.util.PriorityQueue;

public class Cables {

        public static  int cables(int A[]) {
            PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

            for (int i = 0; i <= A.length - 1; i++) {
                pq.add(A[i]);
            }

            int sum = 0;
            while (pq.size() > 1) {

                int first = pq.remove();
                int second = pq.remove();

                sum = sum + first + second;
                pq.add(first + second);
            }
            return sum;
        }

    public static void main(String[] args) {
            int len[] = {4, 3, 2,6};
            System.out.println(cables(len));


    }


}


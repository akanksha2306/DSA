package DataStructures.Arrays;

import java.util.Arrays;
import java.util.HashMap;

public class MissingAndRepeating {

    public static void printTwoElements(int[] a) {

        HashMap<Integer, Integer> count = new HashMap<>();
        int missing = 0;
        int repeating = 0;

        for (int j : a) {

            // write to map
            if (!count.containsKey(j)) {
                count.put(j, 1);
            } else {
                int c = count.get(j);
                count.put(j, c + 1);
            }
        }

        // read from map
        for (int i = 1; i <= a.length; i++) {
            if (!count.containsKey(i)) {
                missing = i;
                System.out.println("The missing number is" + " "+ missing);
            } else if (count.get(i) > 1) {
                repeating = i;
                System.out.println("The repeating number is" + repeating);
            }

        }
    }

    public static void main(String[] args) {
        int[] z = {3,1,2,5,5};
        printTwoElements(z);

    }

}


package hackerearthInput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class readingInput {

    static int sumOfNumbers(int[] intArray) {

        int sum = 0;

        for (int i : intArray) {
            sum = sum + i;
        }
        return sum;
    }

    public static void main(String[] args) throws IOException {
        System.out.println("enter the array element");

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader ib = new BufferedReader(isr);

        int t = Integer.parseInt(ib.readLine());
        System.out.println("the number of test cases are " + t);

        for (int ti = 0; ti < t; ti++) {
            int n = Integer.parseInt(ib.readLine());
            System.out.println("the number of arrays in test case " + ti + " is: " + n);

            for (int ni = 0; ni < n; ni++) {

                String[] strArray = ib.readLine().trim().split("\\s+");
                int[] intArr = new int[strArray.length];

                for (int i = 0; i < intArr.length; i++) {
                    intArr[i] = Integer.parseInt(strArray[i]);
                }

                System.out.println(sumOfNumbers(intArr));

            }
        }
    }
}
// Reading input from STDIN



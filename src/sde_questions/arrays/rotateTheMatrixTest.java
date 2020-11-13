package sde_questions.arrays;

import org.junit.Test;

public class rotateTheMatrixTest {

    @Test
   public void rotate(){

        int arr[][] = new int[][]{ { 1, 2, 3 },
                { 5, 6, 7 },
                { 9, 10, 11 }};

        int[][]ans = rotateTheMatrix.rotate(arr);
        System.out.println(ans.toString());

    }


}
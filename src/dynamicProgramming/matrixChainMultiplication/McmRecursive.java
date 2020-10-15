package dynamicProgramming.matrixChainMultiplication;

public class Mcm {
    /**
     * https://www.youtube.com/watch?v=D7AFvtnDeMU&list=PL_z_8CaSLPWekqhdCPmFohncHwz8TY2Go&index=33
     * we will be given array aor string,
     * base condition of recursion-think of the smallest valid input and smallest invalid input
     * int[]arr, int i, int j and there is int k moves from i to j;
     * if i == j then there is only one element in array
     * if i>j - means there is no element in the array-invalid
     * if i<j;
     * we have to break i on every k, so for doing this we will put a loop
     *we will move k from i to j and will keep calculating the temporary answers at every step and
     * will store everything and calculate the max from there.
     * **/

}

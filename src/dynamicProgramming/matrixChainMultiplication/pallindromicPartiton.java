package dynamicProgramming.matrixChainMultiplication;

public class pallindromicPartiton {

    static int pp(String[] arr, int i, int j) {

        //base condition
        if (i >= j) {
            return 0;
        }


        int min = (int) 1e10;
        for (int k = i; k <= j - 1; k++) {
            int temp = pp(arr, i, k) + pp(arr, k + 1, j) + 1;

            if (temp < min) {
                min = temp;
            }
        }
       return min;
    }

    public static void main(String[] args) {
        String[] arr = new String[]{"nitin"};
        int i = arr.length;
        int j = arr.length-1;
        System.out.println(pp(arr,i,j));
    }
}


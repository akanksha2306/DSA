package dynamicProgramming.unboundedKnapsack;

public class CoinChangeProblem {

    //choice of including the coin from coin arrays
    //so knapsack pattern
    //in knapsack we are given 2 properties for of the item ie, wt array and value array, here we are given only one
    //array, so ignore the value array of knapsack and consider coin array == wt array of knapsack, W -->Sum
    //its unbounded becoz infinite supply of coins are there.

//coin array == wt array of knapsack, sumOfSubset -->SumOfCoin
    // try taking any the values of array 2 times, if its allowing u to take it 2 times, then it is unbounded knapsack

    //excatly same as CountOfSubset sum+unbounded knapsack

    public static int ccp(int[] coinArray, int sum) {

        int n = coinArray.length;
        int[][] T = new int[n + 1][sum + 1];

        //this is possible by empty subset.
        for (int i = 0; i < n + 1; i++) {
            T[i][0] = 1;
        }

        for (int j = 1; j < sum + 1; j++) {
            T[0][j] = 0;
        }

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < sum + 1; j++) {
                if (coinArray[i - 1] <= j) {
                    //T[i][j] = T[i][j - coinArray[i - 1]] + T[i - 1][j];
                    //T[i][j] =Math.min(T[i][j - coinArray[i - 1]] , T[i - 1][j]);
                } else {
                    T[i][j] = T[i - 1][j];

                }
            }
        }
        return T[n][sum];


    }

    public static void main(String[] args) {

        int[] coinArray = new int[]{1,2,3};
        int sum = 5;
        System.out.println(CoinChangeProblem.ccp(coinArray, sum));
    }


}

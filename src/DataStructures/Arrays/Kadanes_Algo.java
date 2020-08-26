package DataStructures.Arrays;

public class Kadanes_Algo {
//carry a subarray sum as long as it gives us a positive sum
    //first we will put max = a[0]
    //check if this a[0] < 0
    //if yes then max = 0
// -2, -3, 4, -1,-2, 1,5,-3
    public static int MaximumSubArray(int [] a){
        int sum= 0;
        int max = sum;

        for(int i =0;i <=a.length-1; i++){
            sum += a[i];
            if (sum<0){
                sum = 0;
                i++;
            }
            if(sum > 0){
                i++;
                max = sum;
                sum += a[i];
            }
        }
        return Math.max(max,sum);
    }

    public static void main(String[] args) {

        int [] a = {-2,1,-3,4,-1,2,1,-5,4};
        int ans = MaximumSubArray(a);
        System.out.println("ans is" + " "+ ans);




    }

}

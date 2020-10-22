package PatternPrinting;

import java.util.Arrays;
import java.util.HashMap;

public class c {

    static int birthdayCakeCandles(int[] ar){

        Arrays.sort(ar);
        System.out.print(Arrays.toString(ar));
        int max =0;
        int n = ar.length;
        int c = 0;
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

         for(int i=0;i<=ar.length-1; i++){
             if(max<ar[i]){
                 max = ar[i];
             }

            if(hm.containsKey(ar[i])){
                c=hm.get(ar[i]);
                hm.put(ar[i], c+1);
            }else{
                hm.put(ar[i],1);
            }
             System.out.println(ar[max]);

         }
         return hm.get(ar[max]);
    }

    public static void main(String[] args) {


        int [] ar = {23,4,5,23};
        birthdayCakeCandles(ar);




    }

}


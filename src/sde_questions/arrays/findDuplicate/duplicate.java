package sde_questions.arrays.findDuplicate;

import java.util.HashSet;
import java.util.Set;
//https://leetcode.com/problems/find-the-duplicate-number/solution/
public class duplicate {

   public static int findDuplicate(int[] array){
        int i =0;
        Set<Integer> seenOnes = new HashSet<>();
        for ( i =0; i<array.length; i++){
            if(!seenOnes.contains(array[i])){
                seenOnes.add(array[i]);
            }else{
                return array[i];
            }
        }

        return array[i];
    }

//space- o(n)
// time-o(n)


}

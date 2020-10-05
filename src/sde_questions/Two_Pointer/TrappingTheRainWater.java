//package sde_questions.Two_Pointer;
//
//import java.lang.reflect.Array;
//
//public class TrappingTheRainWater {
//
//    public static int waterTrapped(int[] input){
//
//        //2,0,2
//        //first i need to find out the nearest greater to right and nearest greater to left across each
//        //building.
//        int n = input.length;
//
//        int[] ngr = new int[n];
//        int nearestGreaterToRight = input[0];
//
//        for(int i = 0; i<n; i++){
//            if(input[i]>=ngr[i]){
//                nearestGreaterToRight= ngr[i];
//            }
//        }
//
//
//        int[] ngl = new int[n];
//        int nearestGreaterLeft = input[n-1];
//
//        for(int i = n-2; i>=n; i--){
//            if(input[i]>=ngl[i]){
//                nearestGreaterToRight= ngr[i];
//            }
//        }
//
//    }
//}

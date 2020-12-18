package leetCode.DataStructure.stringCompression;

public class Solution {
    //https://www.youtube.com/watch?v=6W1MDK7nPZs
    public static String compression(String s){
        //aaabbbcccd- a3b3c3d
//ans = a
        String ans = "";
        int count = 1;
        ans =s.charAt(0) + "";
        for(int i=1; i<s.length(); i++){
            //appending the first character of given


            String curr = s.charAt(i) + "";
            String prev = s.charAt(i-1) + "";
            if(curr.equals(prev)){
                 count = count+1;
            }else{
                if(count>1){
                    ans = ans+count;
                    count = 1;
                }
                ans = ans+curr;
            }
        }
        if(count>1){
            ans = ans+count;
        }
       return ans;
    }

    public static void main(String[] args) {
        String s = "aaabcccd";
        String ans = compression(s);
        System.out.println(ans);
    }
}

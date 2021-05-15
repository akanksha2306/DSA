package Algorithms.slidingWindow;

public class matchSubString {

    static int match(String k, String s) {
        String modifiedK = k.toUpperCase();
        String modifiedS = s.toUpperCase();

        int maxNum = 0;
        int counter = 0;
        for (int i = 0; i <= modifiedK.length() - 1; i++) {

            for (int j = 0; j <= modifiedS.length() - 1; j++) {

                if (k.charAt(i + j) == s.charAt(j)) {
                    counter++;
                } else
                    break;

                maxNum = Math.max(maxNum, counter);
            }


        }
        return maxNum;
    }

    public static void main(String[] args) {
        String k = "geeksforgeeks";
        String s = "";

        int ans = match(k, s);
        System.out.println(ans);
    }
}

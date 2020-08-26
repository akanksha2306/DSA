package AlphabetPrinting;

public class alpha4 {

    public static void main(String[] args) {

        int i,j =0;

        int alphabet = 65;

        for (i = 0; i <= 5; i++) {

            for (j = 0; j <= i; j++) {

                System.out.print((char)(j+ 67));
            }
            System.out.println("");
        }
    }
}

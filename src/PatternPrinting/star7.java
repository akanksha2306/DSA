package PatternPrinting;

public class star7 {
    public static void main(String[] args) {

        for (int i = 1; i <= 4; i++) {
            for (int j = 3; j >= i; j--) {
                System.out.print("8");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("8");
            }
            for (int j = 3; j >= i; j--) {
                System.out.print("*");
            }

            System.out.println(" ");
        }
    }
}

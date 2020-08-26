package AlphabetPrinting;

public class alpha3 {
    public static void main(String[] args) {

        char i,j;

        for(i = 'E'; i>='A';i--){

            for(j = 'E';j>='A'; j--){
                System.out.print(i);
            }
            System.out.println(" ");
        }
    }
}

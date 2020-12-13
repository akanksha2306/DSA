package Test;

public class h {
    int x =4;

    static{
        int y =7;
    }
    public static void main(String[] args) {
        int x = 5;
        {
            int y =6;
            System.out.println(x+""+y);

        }
    }
}

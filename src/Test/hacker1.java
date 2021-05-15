package Test;

import java.io.IOException;

public class hacker1 {
    public static char readInput()
    {
        char c = '\u0000';
        int input = 0;

        try
        {
            input = System.in.read();
            if (input != -1)
            {
                c = (char)input;
            }
        }

        catch (IOException e)
        {
            System.out.print("An Exception occurred while reading input.");
        }
        return c;
    }

    public static void main(String[] args)
    {
        char c = hacker1.readInput();
        System.out.println(c);
    }
}

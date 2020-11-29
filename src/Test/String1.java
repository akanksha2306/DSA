package Test;

public class String1 {

    public static void main(String[] args)
    {
        String s1 = new String("HELLO");
        String s2 = new String("HELLO");

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));//here matching the content

        String s11 = "Rachel";
        String s22 = "Rachel";
        String s33 = new String("Rachel");
        String s44= new String("Rachel").intern();
        //Now, if you are willing to add this string to the string literal pool,
        // Java provides you with a method called, intern() method; you can call
        // native intern() method like this:

        System.out.println(s11 == s22); // true
        System.out.println(s11 == s33); // false
        System.out.println(s11 == s44); // true

    }
}

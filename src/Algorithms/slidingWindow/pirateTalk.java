package Algorithms.slidingWindow;

import java.util.Properties;

public class pirateTalk {

    class A {
    }

    class B extends A {
    }

    class C extends B {
    }

    public static void main(String... arrrrgs) {
//        Properties p = System.getProperties();
//        p.setProperty("pirate", "scuruv");
//        String s = p.getProperty("argProp") + " ";
//        s += p.getProperty("pirate");
//        System.out.println(s);


        pirateTalk p = new pirateTalk();
        p.something();


        // /* hjfjhfe // ***** */


    }

    public void something() {
        B b = new B();

        System.out.println(b instanceof B);
        System.out.println((b instanceof B) && (!(b instanceof A)));
        System.out.println((b instanceof B) && (!(b instanceof C)));
    }
}

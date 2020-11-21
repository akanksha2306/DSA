package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class mapImplementations {

    public static void main(String[] args) {

        Map<Integer, String> hm1 = new HashMap<>();//default initilization
        Map<Integer, String> hm2 = new HashMap<Integer, String>();//initialization of map using generics
        hm1.put(new Integer(1), "A");
        hm1.remove(new Integer(1));
        hm1.get(1);
        hm1.clear();
        hm1.containsKey(2);
        hm1.containsValue("kll");
        hm1.entrySet();
        hm1.equals(hm2);
        hm1.hashCode();
        hm1.isEmpty();
        hm1.keySet();
        hm1.values();

        // Creating an empty TreeMap

        // Default Initialization of a
        // TreeMap
        TreeMap tm1 = new TreeMap();

        // Initialization of a TreeMap
        // using Generics
        TreeMap<Integer, String> tm2 = new TreeMap<Integer, String>();
        tm2.put(3,"geeks");
        tm2.remove(3);
        tm2.comparator();
        tm2.containsKey(2);
        tm1.clone();
        tm1.clear();
        tm2.containsValue("a");
        tm2.values();
//        TreeMap in Java does not allow null keys (like Map) and
//        thus a NullPointerException is thrown. However,
//        multiple null values can be associated with different keys.



    }
}
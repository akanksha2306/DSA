package DataStructures.graphs.shoppingPatterns;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class shpTest {

    @Test
    public void returnMin() {
        int products_nodes = 6;
        int products_edges = 6;
        List<Integer> products_from = new ArrayList<Integer>() {
            {
                add(1);
                add(2);
                add(2);
                add(3);
                add(4);
                add(5);
            }
        };
        List<Integer> products_to = new ArrayList<Integer>() {
            {
                add(2);
                add(4);
                add(5);
                add(5);
                add(6);

            }
        };

    }


}
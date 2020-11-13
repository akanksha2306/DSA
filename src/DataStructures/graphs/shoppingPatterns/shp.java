package DataStructures.graphs.shoppingPatterns;

import java.util.*;

public class shp {

    static int returnMin(int product_nodes, int product_edges, List products_from, List products_to) {

        Map<Integer, Set<Integer>> edgeMap = new HashMap<>();
        for (int i = 0; i < product_edges; i++) {
            int from = (int) products_from.get(i);
            int to = (int) products_to.get(i);

            if (!edgeMap.containsKey(from))
                edgeMap.put(from, new HashSet<>());
            if (!edgeMap.containsKey(to))
                edgeMap.put(to, new HashSet<>());

            edgeMap.get(from).add(to);
            edgeMap.get(to).add(from);
        }
        int minScore = Integer.MAX_VALUE;
        for (Map.Entry<Integer, Set<Integer>> edges : edgeMap.entrySet()) {
            Integer u = edges.getKey();
            Set<Integer> u_edges = edges.getValue();

            for (Integer v : u_edges) {
                Set<Integer> v_edges = edgeMap.get(v);
                if (v_edges.size() < 2)
                    continue;
                for (Integer w : v_edges) {
                    if (w.equals(u) || w.equals(v))
                        continue;
                    Set<Integer> w_edges = edgeMap.get(w);
                    if (w_edges.contains(u) && w_edges.contains(v)) {
                        minScore = Math.min(minScore, u_edges.size() + v_edges.size() + w_edges.size() - 6);
                    }
                }
            }
        }
        return minScore == Integer.MAX_VALUE ? -1 : minScore;

    }

    public static void main(String[] args) {
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

        int ans = returnMin(products_nodes, products_edges, products_from, products_to);
        System.out.println("ans is"+ ans);

    }
}


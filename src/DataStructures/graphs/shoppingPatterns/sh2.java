package DataStructures.graphs.shoppingPatterns;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class sh2 {
    public static int getMinScore(int products_nodes, int products_edges , int[] products_from, int[] products_to)
    {
        Map<Integer, Set<Integer>> edges = buildGraph(products_from, products_to);
        Set<Set<Integer>> trioList = buildTrioSet(edges);

        int minSum = Integer.MAX_VALUE;

        int count = 0;
        for (Set<Integer> trios : trioList) {
            count = 0;
            for (int node : trios) {
                for (int vert : edges.get(node)) {
                    if (!trios.contains(vert))
                        count++;
                }
            }
            minSum = Math.min(minSum, count);
        }
        return minSum == Integer.MAX_VALUE ? -1 : minSum;
    }

    public static Set<Set<Integer>> buildTrioSet(Map<Integer, Set<Integer>> edges) {
        Set<Set<Integer>> trioList = new HashSet<>();
        if (edges == null || edges.isEmpty()) return trioList;

        for (int startNode : edges.keySet()) {
            Set<Integer> vertices1 = edges.get(startNode);
            for (int vert1 : vertices1) {
                Set<Integer> vertices2 = edges.get(vert1);
                for (int vert2 : vertices2) {
                    if (edges.get(vert2).contains(startNode)) {
                        Set<Integer> trio = new HashSet<>();
                        trio.add(startNode); trio.add(vert1); trio.add(vert2);
                        trioList.add(trio);
                    }
                }
            }
        }
        return trioList;
    }

    public static Map<Integer, Set<Integer>> buildGraph(int[] start, int[] end)
    {
        Map<Integer, Set<Integer>> edges = new HashMap();

        for(int i=0;i<start.length;i++)
        {
            Set<Integer> vertices = edges.getOrDefault(start[i], new HashSet<>());
            vertices.add(end[i]);
            edges.put(start[i], vertices);

            vertices = edges.getOrDefault(end[i], new HashSet<>());
            vertices.add(start[i]);
            edges.put(end[i], vertices);
        }

        return edges;
    }

    public static void main(String[] args) {
        System.out.println(3 == getMinScore(6,6,new int[]{1,2,2,3,4,5}, new int[]{2,4,5,5,5,6}) ? "Test 1 Passed" : "Test 1 failed");
        System.out.println(2 == getMinScore(5,6,new int[]{1,1,2,2,3,4}, new int[]{2,3,3,4,4,5}) ? "Test 2 Passed" : "Test 2 failed");
    }
}

package graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;


class Node {
    int first;
    int second;

    Node(int first, int second) {
        this.first = first;
        this.second = second;
    }
}

class UndirectedGraphsBFS {
    static boolean checkForCycle(ArrayList<ArrayList<Integer>> adj, int s, boolean[] vis) {

        Queue<Node> q = new LinkedList<>();
        //starting node wont have the previous node, becoz this is the point hwere I start traversing, parent node = -1
        q.add(new Node(s, -1));
        //mark starting as visted.
        vis[s] = true;

        while (!q.isEmpty()) {
            int node = q.peek().first;//s node aayegi
            int previous = q.peek().second;// -1 aayega
            q.remove();

            for (Integer it : adj.get(node)) {
                if (vis[it] == false) {
                    q.add(new Node(it, previous));
                    vis[it] = true;
                } else if (previous != it) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
//visiting array
        //everything will be marked as unvisited initially
        boolean vis[] = new boolean[V + 1];
        Arrays.fill(vis, false);
//calling bfs for every unvisited node-1-N
        for (int i = 1; i <= V; i++) {
            if (vis[i] == false) {
                if (checkForCycle(adj, i, vis)) ;
                return true;
            }
        }
        return false;
    }


}

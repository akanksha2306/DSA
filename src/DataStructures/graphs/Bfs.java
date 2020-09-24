package DataStructures.graphs;

import java.util.LinkedList;
import java.util.Queue;

public class Bfs {

    public void traverse(Vertex root) {


        Queue<Vertex> queue = new LinkedList<>();
        //will set the root node to be visited
        root.setVisited(true);
        queue.add(root);

        while (!queue.isEmpty()) {
            Vertex actualVertex = queue.remove();
            System.out.println("actualVertex is" + ""+ actualVertex);

            for (Vertex v : actualVertex.getAdjacencyList()) {
                if (!v.isVisited()) {
                    v.setVisited(true);
                    queue.add(v);

                }
            }

        }

    }

}

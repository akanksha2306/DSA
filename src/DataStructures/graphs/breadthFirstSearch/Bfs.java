package DataStructures.graphs.breadthFirstSearch;

import java.util.LinkedList;
import java.util.Queue;

/****, we explore one vertex then we go to the next vertex
 * 1-start exploration from any one vertex, lets say 1, pu this into queue[we use queue data structure]
 * 2-now exolore kids of 1, add those kids into the queue,
 * 3- while queue is not empty, explore the remaining nodes and in this process, once which are already explored,
 * skip them from adding into queue,becoz they are already added in the queue.
 */

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

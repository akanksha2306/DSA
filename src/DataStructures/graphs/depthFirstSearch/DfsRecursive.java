package DataStructures.graphs.depthFirstSearch;

import java.util.List;

public class DfsRecursive {

    public void dfs(List<Vertex> listOfVertex) {

        for (Vertex v : listOfVertex) {
            if (!v.isVisited()) {
                v.setVisited(true);
                dfsRecursive(v);
            }
        }
    }

    //recursion will also be using stack only in the deep down level.
    private void dfsRecursive(Vertex v) {

        for (Vertex vertex : v.getNeighbourList()) {
            if (!vertex.isVisited()) {
                vertex.setVisited(true);
                dfsRecursive(vertex);
            }
        }

    }
}

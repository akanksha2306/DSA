package DataStructures.graphs.depthFirstSearch;

import java.util.List;
import java.util.Stack;

//we use stack data structure here
//push the starting vertex onto the stack,  and while the last item is not empty we can pop, inorder to
//get the last item to be inserted.we set it to be visisted and we consider all the neighbour,
//if we havent visited that v neightbour, then we push that given v vertex onto that stack
//we can also use recursion.
public class Dfs {

    private Stack<Vertex> stack;

    public Dfs() {
        this.stack = new Stack<>();
    }
    public void dfs(List<Vertex> vertexList) {
        for (Vertex v : vertexList) {
            if (!v.isVisited()) {
                v.setVisited(true);
                dfsWithStack(v);
            }
        }
    }

    private void dfsWithStack(Vertex rootVertex) {
        //will add this rootvertex onto the stack and will make it visisted
        this.stack.add(rootVertex);
        rootVertex.setVisited(true);

        while (!stack.isEmpty()) {
            Vertex actualVertex = this.stack.pop();
            System.out.println(actualVertex + " ");
            // now will visist brothers and sisters of this actual vertex

            for (Vertex v : actualVertex.getNeighbourList()) {
                if (!v.isVisited()) {
                    v.setVisited(true);
                    this.stack.push(v);
                }
            }
        }
    }
//TODO: interview Question
//why stack in dfs and why queue in bfs?

}



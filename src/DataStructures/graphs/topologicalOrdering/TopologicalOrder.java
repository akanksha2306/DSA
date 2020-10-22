package DataStructures.graphs.topologicalOrdering;

import java.util.Stack;

public class TopologicalOrder {

    private Stack<Vertex> stack;


    public TopologicalOrder() {
        this.stack = new Stack<>();
    }
    //https://www.youtube.com/watch?v=eL-KzMXSXXI&t=248s

    /***
     *
     * topological sort is only possile when you have DAG
     */
    //pickup an unvisited node
    //beginning with the selected node, do a dfs , exploring only un-visited node.
    //on the recursive callback of the dfs, add the current node in
    // topological ordering in the reverse order
    //https://www.youtube.com/watch?v=qe_pQCh09yU- good explanation here
    public void dfs(Vertex vertex) {
        vertex.setVisited(true);

        for (Vertex v : vertex.getNeighbourList()) {
            //if not visisted do a dfs recursively
            if (!v.isVisited()) {
                dfs(v);
            }
        }
        //before backtrackiing, we will push a node in to the stack
        stack.push(vertex);
    }

    public Stack<Vertex> getStack() {
        return this.stack;
    }
    //pop the vertices of the stack and that will be our answer.
}

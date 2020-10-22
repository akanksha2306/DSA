package DataStructures.graphs.bfs;

import java.util.ArrayList;
import java.util.List;


//list for all the vertices starting with the given vertex
//adjacenecy list is used for every single vertex(node) in the graph .

//adjacency matrix = assume we have G(V,E) graph  with V vertices(nodes),and E edges(links, weights)
//we construct size M matrix, with size V*V where M[i][j] represnts the edge weight or going from node i to j.
public class Vertex {
    private String name;
    private boolean visited;

    List<Vertex> adjacencyList;

    public Vertex(String name ){
        this.name = name;
        this.adjacencyList=new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public void addNeighbour(Vertex vertex) {
        this.adjacencyList.add(vertex);
    }

    @Override
    public String toString() {
        return "Vertex{" +
                "name='" + name + '\'' +
                ", visited=" + visited +
                ", adjacencyList=" + adjacencyList +
                '}';
    }

    public List<Vertex> getAdjacencyList() {
        return adjacencyList;
    }



}

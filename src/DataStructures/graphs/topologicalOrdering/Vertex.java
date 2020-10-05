package DataStructures.graphs.topologicalOrdering;


import java.util.ArrayList;
import java.util.List;
//topological ordering relies heavily on depth first search
public class Vertex {

    private String data;
    private boolean visited;
    private List<Vertex> neighbourList;

    public Vertex(String data) {
        this.data = data;
        this.neighbourList = new ArrayList<>();
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public List<Vertex> getNeighbourList() {
        return neighbourList;
    }
    public void setNeighbourList(List<Vertex> neighbourList) {
        this.neighbourList = neighbourList;
    }



    public void addNeighbour(Vertex vertex) {
        this.neighbourList.add(vertex);
    }



    @Override
    public String toString() {
        return this.data;
    }



}

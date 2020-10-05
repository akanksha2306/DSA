package DataStructures.graphs.depthFirstSearch;

import java.util.ArrayList;
import java.util.List;

public class Vertex {

    private String name;

    public List<Vertex> getNeighbourList() {
        return neighbourList;
    }

    //lists to store refence to the neighbours
    private List<Vertex> neighbourList;

    private boolean visited;

    public Vertex(String name) {
        this.name = name;
        this.neighbourList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addNeighbour(Vertex vertex) {
        this.neighbourList.add(vertex);
    }

    public void setNeighbourList(List<Vertex> neighbourList) {
        this.neighbourList = neighbourList;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }


}

package DataStructures.graphs.breadthFirstSearch;

public class App {
    public static void main(String[] args) {
        Bfs bf = new Bfs();
        Vertex a = new Vertex("A");
        Vertex b = new Vertex("B");
        Vertex c = new Vertex("C");
        Vertex d = new Vertex("D");
        Vertex e = new Vertex("E");
        Vertex f = new Vertex("F");
        Vertex g = new Vertex("G");
        Vertex h = new Vertex("H");

        a.addNeighbour(b);
        a.addNeighbour(f);
        a.addNeighbour(g);

        b.addNeighbour(a);
        b.addNeighbour(c);
        b.addNeighbour(d);

        c.addNeighbour(b);

        d.addNeighbour(e);
        d.addNeighbour(b);

        e.addNeighbour(d);

        f.addNeighbour(a);

        g.addNeighbour(h);
        g.addNeighbour(a);

        bf.traverse(a);


    }
}

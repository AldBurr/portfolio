package unit10;

public class Graphs 
{
    public static AdjacencyGraphs<Vertex<String>> makeGraph()
    {
        AdjacencyGraphs<Vertex<String>> graph = new AdjacencyGraphs<>();
        Vertex<String> a = new Vertex<String>("A");
        Vertex<String> b = new Vertex<String>("B");
        Vertex<String> c = new Vertex<String>("C");
        Vertex<String> d = new Vertex<String>("D");
        Vertex<String> e = new Vertex<String>("E");
        Vertex<String> f = new Vertex<String>("F");
        Vertex<String> g = new Vertex<String>("G");
        Vertex<String> h = new Vertex<String>("H");
        Vertex<String> i = new Vertex<String>("I");
        Vertex<String> j = new Vertex<String>("J");
        Vertex<String> k = new Vertex<String>("K");

        graph.connectUndirected(a, b);
        graph.connectUndirected(b, e);
        graph.connectUndirected(c, e);
        graph.connectUndirected(c, e);
        graph.connectUndirected(c, d);
        graph.connectUndirected(d, f);
        graph.connectUndirected(f, g);
        graph.connectUndirected(j, k);
        graph.connectUndirected(k, i);

        graph.connectDirected(a, c);
        graph.connectDirected(c, h);
        graph.connectDirected(d, b);
        graph.connectDirected(j, i);
        return graph;
    }
}

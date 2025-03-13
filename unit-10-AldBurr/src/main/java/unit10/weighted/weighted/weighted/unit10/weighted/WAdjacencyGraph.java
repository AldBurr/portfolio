package unit10.weighted.weighted.weighted.unit10.weighted;

import java.util.HashMap;
import java.util.Map;

public class WAdjacencyGraph<E> implements WGraph<E> {
    private final Map<E, WVertex<E>> vertices;
    
    public WAdjacencyGraph() {
        vertices = new HashMap<>();
    }

    @Override
    public void add(E value) {
        WVertex<E> vertex = new WVertex<>(value);
        vertices.put(value, vertex);
    }

    @Override
    public boolean contains(E value) {
        return vertices.containsKey(value);
    }

    @Override
    public int size() {
        return vertices.size();
    }

    @Override
    public void connect(E a, E b, double weight) {
        WVertex<E> vertexA = vertices.get(a);
        WVertex<E> vertexB = vertices.get(b);
        vertexA.connect(vertexB, weight);
        vertexB.connect(vertexA, weight);
    }

    @Override
    public boolean connected(E a, E b) {
        WVertex<E> vertexA = vertices.get(a);
        WVertex<E> vertexB = vertices.get(b);
        return vertexA.edge(vertexB) != null;
    }

    @Override
    public double weight(E a, E b) {
        WVertex<E> vertexA = vertices.get(a);
        WVertex<E> vertexB = vertices.get(b);
        return vertexA.edge(vertexB).getWeight();
    }
    public WPath<E> dijkstrasPath(E start, E end)
    {
        for(E value : vertices.keySet())
        {
            WVertex<E> vertex = vertices.get(value);
            PathTuple<E> tuple = new PathTuple<>(vertex);
            tuples.put(vertex, tuple);
            queue.enqueue(tuple);
        }

        tuples.get(startV).update(null, 0);

        while(queue.size() > 0)
        {
            PathTuple<E> tuple = queue.dequeue();
            if(tuple.getDistance() == Double.MAX_VALUE)
            {
                break;
            }
            else
            {
                WVertex<E> v = tuple.getVertex();
                for(Edge<E> edge: v.edges())
                {
                    WVertex<E> n = edge.getTo();
                    double distanceToN = tuple.getDistance();
                    PathTuple<E> nTuple = tuples.get(n);
                    if(distanceToN < nTuple.getDistance())
                    {
                        nTuple.update(v, distanceToN);
                    }
                }
            }
        }
        PathTuple<E> tuple = tuples.get(endV);
        double distance = tuple.getDistance();
        if(distance < Double.MAX_VALUE)
        {
            WPath<E> path = new WPath<>(endV.getValue());
            WVertex<E> v = tuple.getPredecessor();
            while(v != null)
            {
                path.prepend(v.getValue(), distance);
            }
        }
    }
}

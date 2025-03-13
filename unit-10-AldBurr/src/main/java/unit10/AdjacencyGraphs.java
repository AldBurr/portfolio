package unit10;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.LinkedList;
public class AdjacencyGraphs<E> implements Graph<E>
{
    private Map<E, Vertex<E>> verticies;
    public AdjacencyGraphs()
    {
        verticies = new HashMap<>();
    }
    @Override
    public void add(E value)
    {
        Vertex<E> vertex = new Vertex<>(value);
        verticies.put(value, vertex);
    }
    @Override
    public boolean contains(E value)
    {
        return verticies.containsKey(value);
    }
    @Override
    public int size()
    {
        return verticies.size();
    }
    @Override
    public void connectDirected(E a, E b)
    {
        Vertex<E> vertexA = verticies.get(a);
        Vertex<E> vertexB = verticies.get(b);
        vertexA.connect(vertexB);
    }
    @Override
    public void connectUndirected(E a, E b)
    {
        Vertex<E> vertexA = verticies.get(a);
        Vertex<E> vertexB = verticies.get(b);
        vertexA.connect(vertexB);
        vertexB.connect(vertexA);
    }
    @Override
    public boolean connected(E a, E b)
    {
        Vertex<E> vertexA = verticies.get(a);
        Vertex<E> vertexB = verticies.get(b);
        return vertexA.connected(vertexB);
    }
    @Override
    public List<E> bfSearch(E start, E end)
    {
        Vertex<E> s = verticies.get(start);
        Vertex<E> e = verticies.get(end);
        List<E> queue = new LinkedList<>();
        queue.add(start);
        Map<Vertex<E>, E> predecessors = new HashMap<>();
        while(!queue.isEmpty())
        {
            Vertex<E> v = queue.poll();
            if(v == e)
            {
                break;
            }
            else
            {
                for(Vertex<E> n : v.getNeighbors())
                {
                    if(predecessors.containsKey(n))
                    {
                    }
                }
            }
        }
    }
    private List<E> makePath(Map<Vertex<E>, Vertex<E>> predecessors, Vertex<E> end)
    {
        if(predecessors.containsKey(end))
        {
            List<E> path = new LinkedList<>();
            Vertex<E> current = end;
            while(current != null)
            {
                path.add(0, current.getValue());
                current = predecessors.get(current);
            }
            return path;
        }
        else
        {
            return null;
        }
    }
    @Override
    public List<E> dfSearch(E start, E end)
    {
        Vertex<E> s = verticies.get(start);
        Vertex<E> e = verticies.get(end);
    }
    public List<E> visitDFS(Vertex<E> v, Vertex<E> e, Set<Vertex<E>> visitied)
    { 
        if(v == e)
        {
            List<E> path = new LinkedList<>();
            path.add(e.getValue());
            return path;
        }
        else
        {
            for(Vertex<E> neighbor : v.getNeighbors())
            {
                if(!visitied.contains(neighbor))
                {
                    visitied.add(neighbor);
                    List<E> path = visitDFS(neighbor, e, visitied);
                    if(path != null)
                    {
                        path.add(0, v.getValue());
                        return path;
                    }
                }
            }
            return null;
        }
    }
}

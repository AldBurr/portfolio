package unit11.practicum;

import java.util.List;

import unit11.graphs.AdjacencyGraph;
import unit11.graphs.Graph;
import java.util.ArrayList;
import java.util.Arrays;
public class Mothers
{
    public static List<ArrayList<String>> findMother(Graph<String> unweightedGraph, List<String> allValues)
    {
        ArrayList<String> listofMothers = new ArrayList<>();
        for(String val : allValues)
        {
            if(unweightedGraph.bfSearch(allValues.get(0), allValues.get(allValues.size()-1)))
            {
                listofMothers.add(val);
            }
        }
        return Arrays.asList(listofMothers);
    }
    public static void main(String[] args) 
    {
        Graph<String> graph1 = new AdjacencyGraph<String>();
        List<String> listofVals = new List<String>();
        listofVals.add("A");
        listofVals.add("B");
        listofVals.add("C");
        listofVals.add("D");
        listofVals.add("E");
        graph1.add("A");
        graph1.add("B");
        graph1.add("C");
        graph1.add("D");
        graph1.add("E");
        graph1.connectDirected("A", "B");
        graph1.connectDirected("B", "C");
        graph1.connectDirected("B", "E");
        graph1.connectDirected("C", "D");
        graph1.connectDirected("E", "A");
        System.out.println(findMother(graph1, ));
    }
}

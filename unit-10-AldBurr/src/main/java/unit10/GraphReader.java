package unit10;
import static unit10.FileLineReader.open;
public class GraphReader 
{
    public static Graph<String> readGraph(String filename)
    {
        Graph<String> lines = new AdjacencyGraphs<String>();
        for(String line : open("path/to/" + filename))
        {   
            if(lines.contains(line))
            {
                break;
            }
            else
            {
            lines.add(line);
            }
        }
        return lines;
    }
}

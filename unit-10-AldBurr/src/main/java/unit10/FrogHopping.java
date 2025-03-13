package unit10;

import java.io.IOException;
import java.util.List;
import static unit10.FileLineReader.open;
public class FrogHopping {
    //Uncomment
    private AdjacencyGraphs<Hole> graph;
    private String[][] arrayBoard;
    private final int ROWS, COLS;

    public FrogHopping(String filename) throws IOException{
        // Initialize all of the fields
        for(String line : open(filename))
        {
            String[] lines = line.split(" ");
            for(int x = 0; x < lines.length; x++)
            {
                for(int y = 0; y < lines.length; y++)
                {
                    arrayBoard[x][y] = lines[y];
                }
            }
        }
        // Construct the array and add all vertices to the graph
        ROWS = 0;
        COLS = 0;


        // Connect vertices
        connectVertices();      
            
    }
    private void connectVertices(){
        
    }
    
    // The frog can't jump to a hole which was visited before
    public List<Hole> dfPathV0(Hole start, Hole end) 
    {
        return null;
    }
    // The frog can't jump over the same peg more than once
    public List<Hole> dfPathV1(Hole start, Hole end) 
    {
        return null;
    }
    public static void main(String[] args) throws IOException {
        FrogHopping frog = new FrogHopping("data/frog_3.txt");
        System.out.println(frog);
        Hole start = new Hole(2, 1);
        Hole end = new Hole(0, 5);
        System.out.println(frog.dfPathV0(start, end)); //[(2,1), (0,3), (2,5), (2,3), (0,5)]
        System.out.println(frog.dfPathV1(start, end)); //[(2,1), (0,3), (2,5), (2,3), (0,3), (0,5)]
        System.out.println("The frog game graph representation:");
        
    }
}

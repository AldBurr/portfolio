package unit10;

import java.util.HashMap;
import java.util.Map;

public class Hole{
    private final int row, col;
    public Hole(int row, int col){
        this.row = row;
        this.col = col;
    }
    public int getRow(){
        return row;
    }
    public int getCol(){
        return col;
    }
    @Override
    public String toString()
    {
        return "(" + row + ", " + col + ")";
    }
    public boolean equals(Hole h1, Hole h2)
    {
        if(h1.getRow() == h2.getRow() && h1.getCol() == h2.getCol())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String[] args) {
        Map<Hole, Integer> map = new HashMap<>();
        map.put(new Hole(0, 0), 0);
        map.put(new Hole(0, 3), 0);
        map.put(new Hole(5, 2), 5);
        System.out.println(map.containsKey(new Hole(5, 2))); //true
        System.out.println(map.get(new Hole(5, 2))); //5   
    }
}
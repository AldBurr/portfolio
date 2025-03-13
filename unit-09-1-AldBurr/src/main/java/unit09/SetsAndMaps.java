package unit09;

import java.util.Map;
import java.util.Set;

public class SetsAndMaps 
{
    public void addAndPrint(Set<String> set)
    {
        set.add("aardvark");
        set.add("Zoo");
        for(String val : set)
        {
            System.out.println(val);
        }
    }
    public void putAndPrint(Map<String, Integer> map)
    {
        map.add("aardvark", 1);
        map.add("Zoo", 2);
        map.add("Monkey", 3);
        map.add("zebra", 4);
        map.add("shark", 5);
        for(String key : map.keySet())
        {
            System.out.println(key + ": " + map.get(key));
        }
    }
}

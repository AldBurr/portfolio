package unit13.haunted;

import java.io.FileReader;
import java.io.IOException;
import java.util.Collection;
import java.util.Map;
import java.util.Random;

public class BuildingFileParser 
{
    private Random RNG = new Random();
    private Collection<Area> safeAreas;
    private Collection<Area> unsafeAreas;
    private Collection<Area> exitAreas;
    private Map<Area, Collection<Area>> passages;
    public BuildingFileParser(String filename) throws IOException
    {
        FileReader reader = new FileReader(filename);
    }
    public Collection<Area> getSafAreas()
    {
        return safeAreas;
    }
    public Collection<Area> getUnsafeAreas()
    {
        return unsafeAreas;
    }
    public Collection<Area> getExitAreas()
    {
        return exitAreas;
    }
    public Map<Area, Collection<Area>> getPassages()
    {
        return passages;
    }
}

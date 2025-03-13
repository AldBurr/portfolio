package parsers;

public class Constant implements Expressions 
{
    private final double constval;
    public Constant(double userNum)
    {
        constval = userNum;
    }
    @Override
    public double evaluate()
    {
        return constval;
    }
}

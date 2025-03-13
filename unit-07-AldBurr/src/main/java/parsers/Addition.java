package parsers;

public class Addition implements Expressions
{
    private final Expressions expressionOne;
    private final Expressions expressionTwo;
    public double evaluate()
    {
        double one = expressionOne.evaluate();
        double two = expressionTwo.evaluate();
        return one + two;
    }
}

package parsers;

public class Increment implements Expressions
{
    private final Expressions expression;
    public double evaluate()
    {
        return expression.evaluate() + 1;
    }
    public static void main(String[] args) {
        Expressions value = new Constant(12.0);
    }
}

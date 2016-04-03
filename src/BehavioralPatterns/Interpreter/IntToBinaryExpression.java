package BehavioralPatterns.Interpreter;

/**
 * Created by aleksandrlazarenko on 03.04.16.
 */
public class IntToBinaryExpression implements Expression {
    private int i;

    public IntToBinaryExpression(int c) {
        this.i = c;
    }

    @Override
    public String interpret(InterpreterContext ic) {
        return ic.getBinaryFormat(this.i);
    }
}
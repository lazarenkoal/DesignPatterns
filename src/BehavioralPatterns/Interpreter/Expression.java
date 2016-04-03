package BehavioralPatterns.Interpreter;

/**
 * Created by aleksandrlazarenko on 03.04.16.
 */
public interface Expression {
    String interpret(InterpreterContext ic);
}

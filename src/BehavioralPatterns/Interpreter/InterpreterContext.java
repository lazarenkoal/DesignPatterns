package BehavioralPatterns.Interpreter;

/**
 * Created by aleksandrlazarenko on 03.04.16.
 */
public class InterpreterContext {
    public String getBinaryFormat(int i) {
        return Integer.toBinaryString(i);
    }

    public String getHexadecimalFormat(int i) {
        return Integer.toHexString(i);
    }
}

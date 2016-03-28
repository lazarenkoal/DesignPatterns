package StructuralPatterns.Adapter;

/**
 * Created by aleksandrlazarenko on 28.03.16.
 */
public interface SocketAdapter {
    public Volt get120Volt();
    public Volt get12Volt();
    public Volt get3Volt();
}

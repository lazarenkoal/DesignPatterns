package StructuralPatterns.Adapter;

/**
 * Created by aleksandrlazarenko on 28.03.16.
 */
public class Socket {

    public Volt getVolt() {
        return new Volt(120);
    }
}

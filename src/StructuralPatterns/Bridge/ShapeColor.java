package StructuralPatterns.Bridge;

/**
 * Two interfaces for building the bridge
 * <p>
 * Created by aleksandrlazarenko on 02.04.16.
 */
interface Color {
    void applyColor();
}

abstract class Shape { //Composition - implementor protected Color color;
    protected Color color;
    //constructor with implementor as input argument
    public Shape(Color c) {
        this.color = c;
    }

    abstract public void applyColor();
}
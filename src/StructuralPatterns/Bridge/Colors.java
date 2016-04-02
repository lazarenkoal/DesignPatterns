package StructuralPatterns.Bridge;

/**
 * Implementation of colors
 * <p>
 * Created by aleksandrlazarenko on 02.04.16.
 */
class RedColor implements Color {
    public void applyColor() {
        System.out.println("red.");
    }
}

class GreenColor implements Color {
    public void applyColor() {
        System.out.println("green.");
    }
}

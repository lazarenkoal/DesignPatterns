package StructuralPatterns.Bridge;

/**
 * Bridge between classes
 * <p>
 * Created by aleksandrlazarenko on 02.04.16.
 */

class Triangle extends Shape {
    public Triangle(Color c) {
        super(c);
    }

    @Override
    public void applyColor() {
        System.out.print("Triangle filled with color ");
        color.applyColor();
    }
}

class Pentagon extends Shape {
    public Pentagon(Color c) {
        super(c);
    }

    @Override
    public void applyColor() {
        System.out.print("Pentagon filled with color ");
        color.applyColor();
    }
}

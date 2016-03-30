package StructuralPatterns.Composite;

/**
 * Build components for composite
 *
 * Created by aleksandrlazarenko on 30.03.16.
 */
class Triangle implements BaseComponent {

    @Override
    public void draw(String fillColor) {
        System.out.println("The triangle will be: " + fillColor);
    }
}

class Circle implements BaseComponent {

    @Override
    public void draw(String fillColor) {
        System.out.println("Drawing Circle with color: " + fillColor);
    }
}
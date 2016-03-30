package StructuralPatterns.Composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Composite
 *
 * Created by aleksandrlazarenko on 30.03.16.
 */
public class Composite implements BaseComponent {

    //collection of Shapes
    private List<BaseComponent> shapes = new ArrayList<BaseComponent>();


    //adding shape to drawing
    public void add(BaseComponent s) {
        this.shapes.add(s);
    }

    //removing shape from drawing
    public void remove(BaseComponent s) {
        shapes.remove(s);
    }

    //removing all the shapes
    public void clear() {
        System.out.println("Clearing all the shapes from drawing");
        this.shapes.clear();
    }

    @Override
    public void draw(String fillColor) {
        for (BaseComponent sh : shapes) {
            sh.draw(fillColor);
        }
    }
}

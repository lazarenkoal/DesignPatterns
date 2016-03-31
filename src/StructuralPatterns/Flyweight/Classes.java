package StructuralPatterns.Flyweight;

import java.awt.*;

/**
 * Flyweight interface and concrete classes
 * <p>
 * Created by aleksandrlazarenko on 31.03.16.
 */
interface Shape {
    void draw(Graphics g, int x, int y, int width, int height, Color color);
}

class Line implements Shape {

    public Line() {
        System.out.println("Creating Line object"); //adding time delay
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void draw(Graphics line, int x1, int y1, int x2, int y2, Color color) {
        line.setColor(color);
        line.drawLine(x1, y1, x2, y2);
    }
}

class Oval implements Shape {
    //intrinsic property
    private boolean fill;

    public Oval(boolean f) {
        this.fill = f;
        System.out.println("Creating Oval object with fill=" + f); //adding time delay
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void draw(Graphics circle, int x, int y, int width, int height,
                     Color color) {
        circle.setColor(color);
        circle.drawOval(x, y, width, height);
        if (fill) {
            circle.fillOval(x, y, width, height);
        }
    }
}
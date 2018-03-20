package ru.shapovalov.JavaConcurrencyBasics.ExampleOne;

import java.awt.*;

/**
 * Rectangular area in a coordinate space,
 * specified by a top left point, its width, height and name.
 */
public class RectangularArea {
    private volatile String name;
    private final Point topLeft;
    private int width;
    private int height;

    public RectangularArea(String s, Point p, int w, int h) {
        name = s;
        topLeft = new Point(p);
        width = w;
        height = h;
    }

    public synchronized int getHeight() {
        return height;
    }

    public synchronized int getWidth() {
        return width;
    }

    public synchronized Point getLocation() {
        return new Point(topLeft);
    }

    public String getName() {
        return name;
    }

    public synchronized void resize(int factor) {
        width *= factor;
        height *= factor;
    }

    public synchronized void translate(Point p) {
        topLeft.x += p.x;
        topLeft.y += p.y;
    }

    public void rename(String s) {
        name = s;
    }
}
package org.example;

public abstract class Shape {
    protected final Color color;

    public Shape(Color color) {
        this.color = color;
    }

    abstract void draw();
}

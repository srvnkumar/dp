package org.example;

public class Rectangle extends Shape{
    public Rectangle(Color color) {
        super(color);
    }

    @Override
    void draw() {
        System.out.println(color.applyColor());
    }
}

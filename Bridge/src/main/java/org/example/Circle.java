package org.example;

public class Circle extends Shape{
    public Circle(Color color) {
        super(color);
    }

    @Override
    void draw() {
        System.out.println(color.applyColor());
    }
}

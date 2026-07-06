package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Shape shape = new Rectangle(new BlueColor());
        shape.draw();

        shape = new Circle(new RedColor());
        shape.draw();
    }
}
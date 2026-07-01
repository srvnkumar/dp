package org.example.org.example.practical;

public class Main {
    public static void main(String[] args) {
        CarFactory factory = new MFactory();
        factory.getEngine();
        factory.getWheels();
    }
}

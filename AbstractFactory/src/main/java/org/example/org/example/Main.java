package org.example.org.example;

import org.example.org.example.factory.CarFactory;
import org.example.org.example.factory.HFactory;
import org.example.org.example.factory.MFactory;

public class Main {
    public static void main(String[] args) {
        CarFactory factory = new MFactory();
        factory.getEngine();
        factory.getWheels();
        factory = new HFactory();
        factory.getEngine();
        factory.getWheels();
    }
}

package org.example;

import org.example.org.example.fluentbuilder.Car;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            Car car = new Car.Builder("FordFigo","Titanium").color("red").build();
        System.out.println(car);
        Car car2 = new Car.Builder("FordFigo","Titanium").color("red").horsePower("16.2").build();
        System.out.println(car2);
    }
}
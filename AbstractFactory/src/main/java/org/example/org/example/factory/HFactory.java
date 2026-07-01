package org.example.org.example.factory;

import org.example.org.example.product.Engine;
import org.example.org.example.product.impl.HEngine;
import org.example.org.example.product.impl.HWheel;
import org.example.org.example.product.Wheel;

public class HFactory implements CarFactory{
    @Override
    public Wheel getWheels() {
        return new HWheel();
    }

    @Override
    public Engine getEngine() {
        return new HEngine();
    }
}

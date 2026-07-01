package org.example.org.example.factory;

import org.example.org.example.product.Engine;
import org.example.org.example.product.impl.MEngine;
import org.example.org.example.product.impl.MWheel;
import org.example.org.example.product.Wheel;

public class MFactory implements CarFactory{
    @Override
    public Wheel getWheels() {
        return new MWheel();
    }

    @Override
    public Engine getEngine() {
        return new MEngine();
    }
}

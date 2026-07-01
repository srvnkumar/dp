package org.example.org.example.practical;

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

package org.example.org.example.practical;

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

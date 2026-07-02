package org.example.gof.builder;

public abstract class CarBuilder {

    protected final Car car = new Car();

    public abstract  void buildColor();
    public abstract void buildModel();
    public abstract void buildBrand();

    public Car getCar(){
        return car;
    }
}

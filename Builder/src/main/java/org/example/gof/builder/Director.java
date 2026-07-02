package org.example.gof.builder;

public class Director {
    private final CarBuilder builder;

    public Director(CarBuilder builder){
        this.builder = builder;
    }

    public Car construct(){
        builder.buildColor();
        builder.buildBrand();
        builder.buildModel();
        return builder.getCar();
    }
}

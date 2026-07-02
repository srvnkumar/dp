package org.example.gof.builder;

public class EconomyCarBuilder extends CarBuilder{
    @Override
    public void buildColor() {
        car.setBrand("Red");
    }

    @Override
    public void buildModel() {
        car.setModel("Suzuki");
    }

    @Override
    public void buildBrand() {
        car.setBrand("Suzuki");
    }

    @Override
    public String toString() {
        return "EconomyCarBuilder{" +
                "car=" + car +
                '}';
    }
}

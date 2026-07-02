package org.example.gof.builder;

public class LuxuryCarBuilder extends CarBuilder{

    @Override
    public void buildColor() {
        car.setBrand("Red");
    }

    @Override
    public void buildModel() {
        car.setModel("ZXI");
    }

    @Override
    public void buildBrand() {
        car.setBrand("Honda");
    }


    @Override
    public String toString() {
        return "LuxuryCarBuilder{" +
                "car=" + car +
                '}';
    }
}

package org.example.org.example.fluentbuilder;

public class Car {
    //Required fields
    private final String brand;

    private final String model;

    //optional fields
    private final String horsepower;

    private final String color;

    private Car(Builder builder){
        this.brand = builder.brand;
        this.model = builder.model;
        this.color = builder.color;
        this.horsepower = builder.horsepower;
    }

    //static Builder class
    public static class Builder{
        private final String brand;

        private final String model;

        private String color="black";

        private String horsepower = "10.2";

        public Builder(String brand, String model) {
            this.brand = brand;
            this.model = model;
        }

        public Builder color(String color){
            this.color = color;
            return this;
        }

        public Builder horsePower(String horsepower){
            this.horsepower = horsepower;
            return this;
        }

        public Car build(){
            return new Car(this);
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", horsepower='" + horsepower + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}

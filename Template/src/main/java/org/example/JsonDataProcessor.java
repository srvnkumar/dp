package org.example;

public class JsonDataProcessor extends DataProcessor{
    @Override
    protected void readData() {
        System.out.println("Reading JSON data");
    }

    @Override
    protected void transformData() {
        System.out.println("Transforming JSON data");
    }

    @Override
    protected void saveData() {
        System.out.println("Saving JSON data");
    }
}

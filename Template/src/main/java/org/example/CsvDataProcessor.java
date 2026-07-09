package org.example;

public class CsvDataProcessor extends DataProcessor{
    @Override
    protected void readData() {
        System.out.println("Reading CSV Data");
    }

    @Override
    protected void transformData() {
        System.out.println("Transforming CSV data");
    }

    @Override
    protected void saveData() {
        System.out.println("Saving CSV data");
    }
}

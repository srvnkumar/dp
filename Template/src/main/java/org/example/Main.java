package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        DataProcessor csv = new CsvDataProcessor();
        csv.process();
        DataProcessor json = new JsonDataProcessor();
        json.process();

    }
}
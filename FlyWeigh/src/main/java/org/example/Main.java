package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CoffeFactory factory = new CoffeFactory();
        Coffee c1 = factory.getCoffeFlavour("Expresso");
        Coffee c2 = factory.getCoffeFlavour("Cappicino");
        Coffee c3 = factory.getCoffeFlavour("Expresso"); //reused not new

        c1.serve(1);
        c2.serve(2);
        c3.serve(3);

        System.out.println("Total coffee served:"+ factory.getTotalSize());
    }
}
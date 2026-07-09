package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ItemElement[] items = {
                new Book(200, "ISBN-1111"),
                new Book(450, "ISBN-222"),
                new Fruit(50, 2, "Apple"),
                new Fruit(70, 1, "Banana")
        };


        Visitor pricingVisitor = new PriceVisitor();
        for (ItemElement item : items) {
                item.accept(pricingVisitor);
        }
    }
}
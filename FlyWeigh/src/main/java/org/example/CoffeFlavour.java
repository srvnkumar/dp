package org.example;

public class CoffeFlavour implements Coffee{

    private final String flavour;

    public CoffeFlavour(String flavour) {
        this.flavour = flavour;
    }

    @Override
    public void serve(int table) {
        System.out.println("Serving "+ flavour+" on table "+table);
    }
}

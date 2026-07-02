package org.example.gof.builder;

public class Main {
    public static void main(String[] args) {
        Director director = new Director(new LuxuryCarBuilder());
        System.out.println(director.construct());
        Director director2 = new Director(new EconomyCarBuilder());
        System.out.println(director2.construct());
    }
}

package org.example.org.example.product.impl;


import org.example.org.example.product.Engine;

public class HEngine implements Engine {

    public HEngine(){
        System.out.println("HEngine");
    }
    @Override
    public String getName() {
        return "Honda Engine";
    }
}

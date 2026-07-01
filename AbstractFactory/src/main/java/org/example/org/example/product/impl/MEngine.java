package org.example.org.example.product.impl;


import org.example.org.example.product.Engine;

public class MEngine implements Engine {
    public MEngine(){
        System.out.println("MEngine");
    }

    @Override
    public String getName() {
        return "Marutin Engine";
    }
}

package org.example.org.example.product.impl;

import org.example.org.example.product.Wheel;

public class HWheel implements Wheel {

    public HWheel(){
        System.out.println("HWheel");
    }
    @Override
    public String getName() {
        return "Hwheel";
    }
}

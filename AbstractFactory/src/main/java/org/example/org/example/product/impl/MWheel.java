package org.example.org.example.product.impl;

import org.example.org.example.product.Wheel;

public class MWheel implements Wheel {


    public MWheel(){
        System.out.println("Mwheel");
    }
    @Override
    public String getName() {
        return "MWheels";
    }
}

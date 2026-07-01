package org.example.org.example.factory;

import org.example.org.example.product.Engine;
import org.example.org.example.product.Wheel;

public interface CarFactory {
     Wheel getWheels();
     Engine getEngine();
}

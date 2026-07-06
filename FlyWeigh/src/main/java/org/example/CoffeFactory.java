package org.example;

import java.util.HashMap;
import java.util.Map;

public class CoffeFactory {
    private final  Map<String, CoffeFlavour> coffeMap = new HashMap<>();

    public CoffeFlavour getCoffeFlavour(String flavour){
        return coffeMap.computeIfAbsent(flavour, CoffeFlavour::new);
    }

    public int getTotalSize(){
        return coffeMap.size();
    }


}

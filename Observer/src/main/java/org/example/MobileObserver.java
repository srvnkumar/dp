package org.example;

public class MobileObserver implements Observer{
    @Override
    public void update(int newState) {
        System.out.println("Mobile App received update: "+ newState);
    }
}

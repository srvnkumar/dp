package org.example;

public class EmailObserver implements  Observer{
    @Override
    public void update(int newState) {
        System.out.println("Email Service received update "+  newState);
    }
}

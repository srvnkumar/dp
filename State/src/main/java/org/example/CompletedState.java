package org.example;

public class CompletedState implements  State{
    @Override
    public void handleRequest(Context ctx) {
        System.out.println("Request already Completed. No further Transactions.");
    }
}

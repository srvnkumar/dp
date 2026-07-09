package org.example;

public class IdleState implements  State{
    @Override
    public void handleRequest(Context ctx) {
        System.out.println("System is idle. Moving to Procesing state ..");
        ctx.setState(new ProcessingState());
    }
}

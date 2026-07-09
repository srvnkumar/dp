package org.example;

public class ProcessingState implements State{
    @Override
    public void handleRequest(Context ctx) {
        System.out.println("Processing request. Moving to Completed state");
        ctx.setState(new CompletedState());

    }
}

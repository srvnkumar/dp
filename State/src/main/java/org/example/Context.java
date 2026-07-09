package org.example;

public class Context {

    private State currentState;

    public Context() {
        this.currentState = new IdleState(); //intial state
    }

    public void setState(State currentState) {
        this.currentState = currentState;
    }

    public void request(){
        currentState.handleRequest(this);
    }
}

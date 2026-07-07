package org.example;

import java.util.ArrayDeque;
import java.util.Deque;

public class CommandInvoker {
    private final Deque<Command> history = new ArrayDeque<>();
    public void execute(Command command){
        command.execute();
        history.push(command);
    }

    public void undo(){
        if(!history.isEmpty()){
            history.pop().undo();
        }
    }
}

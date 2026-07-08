package org.example;

import java.util.Stack;

public class EditorHistory {
    private final Stack<EditorMemento> history = new Stack<>();

    public void saveState(EditorMemento memento){
        history.push(memento);
    }

    public EditorMemento undo(){
        if(!history.isEmpty()){
            return history.pop();
        }
        return  null;
    }
}

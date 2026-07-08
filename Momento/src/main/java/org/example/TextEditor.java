package org.example;

public class TextEditor {

    private String content ="";

    public void type(String words){
        content += words;
    }

    public String getContent() {
        return content;
    }

    public EditorMemento save(){
        return new EditorMemento(content);
    }

    public void restore(EditorMemento memento){
        this.content = memento.getState();
    }
}

package org.example;

public class TextEditor {
    private final StringBuilder text = new StringBuilder();
    public void insert(String content, int position){
        text.insert(position,content);
    }

    public void delete(int startindex, int length){
        text.delete(startindex, startindex+length);
    }

    public String getText(){
        return text.toString();
    }
}

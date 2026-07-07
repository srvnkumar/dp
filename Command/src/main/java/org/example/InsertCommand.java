package org.example;

public class InsertCommand implements Command{

    private final String content;
    private final TextEditor editor;
    private final int position;

    public InsertCommand(String content, TextEditor editor, int position) {
        this.content = content;
        this.editor = editor;
        this.position = position;
    }

    @Override
    public void execute() {
        editor.insert(content, position);
    }

    @Override
    public void undo() {
        editor.delete(position, content.length());
    }
}

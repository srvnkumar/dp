package org.example;

public class DeleteCommand implements Command{
    private final TextEditor editor;
    private final int start;
    private String deletedText;

    public DeleteCommand(TextEditor editor, int start, int length) {
        this.editor = editor;
        this.start = start;
        this.length = length;
    }

    private final int length;
    @Override
    public void execute() {
        deletedText = editor.getText().substring(start, start+length);
        editor.delete(start, length);
    }

    @Override
    public void undo() {
        editor.insert(deletedText, start);
    }
}

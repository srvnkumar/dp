package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        extracted();


    }

    private static void extracted() {
        TextEditor editor = new TextEditor();
        EditorHistory history = new EditorHistory();

        editor.type("Welcome - ");
        history.saveState(editor.save());

        editor.type("Hello ");
        history.saveState(editor.save());

        editor.type("World!");
        history.saveState(editor.save());

        System.out.println(editor.getContent());

        editor.restore(history.undo());
        System.out.println(editor.getContent());

        editor.restore(history.undo());
        System.out.println(editor.getContent());
    }
}
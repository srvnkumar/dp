package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
                //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        TextEditor editor = new TextEditor();
        CommandInvoker invoker = new CommandInvoker();
        invoker.execute(new InsertCommand("hello", editor,0));
        invoker.execute(new InsertCommand(" world", editor, 5));
        System.out.println(editor.getText());

        invoker.undo();
        System.out.println(editor.getText());
        invoker.execute(new DeleteCommand(editor,0,5));
       // invoker.undo();
        System.out.println(editor.getText());

    }
}
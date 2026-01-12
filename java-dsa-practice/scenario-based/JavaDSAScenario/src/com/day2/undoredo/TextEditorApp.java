package com.day2.undoredo;

public class TextEditorApp {

    public static void main(String[] args) {

        TextEditor editor = new TextEditor();

        editor.insert("Hello ");
        editor.insert("World");

        editor.showContent();

        editor.delete(5);
        editor.showContent();

        editor.undo();
        editor.showContent();

        editor.redo();
        editor.showContent();
    }
}

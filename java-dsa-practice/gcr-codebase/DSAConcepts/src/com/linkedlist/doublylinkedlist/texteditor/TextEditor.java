package com.linkedlist.doublylinkedlist.texteditor;

class TextState {
    String text;
    TextState prev, next;

    TextState(String txt) {
        text = txt;
        prev = next = null;
    }
}

public class TextEditor {
    private TextState head, tail, current;
    private final int HISTORY_LIMIT = 10;
    private int size = 0;

    // Add new state
    public void addState(String text) {
        TextState newState = new TextState(text);

        if (head == null) {
            head = tail = current = newState;
            size = 1;
            return;
        }

        // Remove redo history if current is not tail
        if (current != tail) {
            current.next = null;
            tail = current;
        }

        tail.next = newState;
        newState.prev = tail;
        tail = newState;
        current = newState;
        size++;

        // Limit history to HISTORY_LIMIT
        if (size > HISTORY_LIMIT) {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    // Undo
    public void undo() {
        if (current != null && current.prev != null) {
            current = current.prev;
            System.out.println("Undo: " + current.text);
        } else {
            System.out.println("Nothing to undo");
        }
    }

    // Redo
    public void redo() {
        if (current != null && current.next != null) {
            current = current.next;
            System.out.println("Redo: " + current.text);
        } else {
            System.out.println("Nothing to redo");
        }
    }

    // Display current state
    public void displayCurrent() {
        if (current != null)
            System.out.println("Current Text: " + current.text);
        else
            System.out.println("No text available");
    }

    public static void main(String[] args) {
        TextEditor editor = new TextEditor();

        editor.addState("Hello");
        editor.addState("Hello World");
        editor.addState("Hello World!");

        editor.displayCurrent();

        editor.undo();
        editor.undo();
        editor.redo();
        editor.addState("Hello Everyone"); 

        editor.displayCurrent();
        editor.undo();
    }
}


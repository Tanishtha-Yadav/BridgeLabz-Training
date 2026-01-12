package com.day2.undoredo;

import java.util.Stack;

class TextEditor {

    private StringBuilder content;
    private Stack<Action> undoStack;
    private Stack<Action> redoStack;

    public TextEditor() {
        content = new StringBuilder();
        undoStack = new Stack<>();
        redoStack = new Stack<>();
    }

    // Insert text
    public void insert(String text) {
        content.append(text);
        undoStack.push(new Action("insert", text));
        redoStack.clear();
        System.out.println("Inserted: " + text);
    }

    // Delete text
    public void delete(int length) {
        if (length > content.length()) return;

        String removed = content.substring(content.length() - length);
        content.delete(content.length() - length, content.length());
        undoStack.push(new Action("delete", removed));
        redoStack.clear();
        System.out.println("Deleted: " + removed);
    }

    // Undo operation
    public void undo() {
        if (undoStack.isEmpty()) {
            System.out.println("Nothing to undo.");
            return;
        }

        Action action = undoStack.pop();

        if (action.type.equals("insert")) {
            content.delete(content.length() - action.text.length(), content.length());
        } else {
            content.append(action.text);
        }

        redoStack.push(action);
        System.out.println("Undo performed.");
    }

    // Redo operation
    public void redo() {
        if (redoStack.isEmpty()) {
            System.out.println("Nothing to redo.");
            return;
        }

        Action action = redoStack.pop();

        if (action.type.equals("insert")) {
            content.append(action.text);
        } else {
            content.delete(content.length() - action.text.length(), content.length());
        }

        undoStack.push(action);
        System.out.println("Redo performed.");
    }

    // Display content
    public void showContent() {
        System.out.println("Editor Content: " + content);
    }
}

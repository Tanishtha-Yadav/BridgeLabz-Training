package com.day2.undoredo;

class Action {
    String type;      // insert or delete
    String text;

    Action(String type, String text) {
        this.type = type;
        this.text = text;
    }
}

package com.day2.texteditor;
public class Action {
    String type;   // insert or delete
    String text;   // text involved

    // Constructor
    public Action(String type, String text) {
        this.type = type;
        this.text = text;
    }
}

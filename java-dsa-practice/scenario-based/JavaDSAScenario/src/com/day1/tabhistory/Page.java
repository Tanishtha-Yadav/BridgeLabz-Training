package com.day1.tabhistory;

public class Page {
    String url;
    Page prev;
    Page next;

    public Page(String url) {
        this.url = url;
    }
}

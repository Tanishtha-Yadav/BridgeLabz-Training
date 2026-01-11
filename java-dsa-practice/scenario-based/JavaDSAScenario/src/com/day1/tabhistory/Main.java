package com.day1.tabhistory;

public class Main {
    public static void main(String[] args) {

        BrowserHistory tab = new BrowserHistory();
        TabManager manager = new TabManager();

        tab.visit("google.com");
        tab.visit("github.com");
        tab.visit("stackoverflow.com");

        tab.back();
        tab.back();
        tab.forward();

        manager.closeTab(tab);

        BrowserHistory restoredTab = manager.reopenTab();
        if (restoredTab != null) {
            System.out.println("Current Page: " + restoredTab.getCurrentPage());
        }
    }
}


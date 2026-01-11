package com.day1.tabhistory;

import java.util.Stack;

public class TabManager {

    private Stack<BrowserHistory> closedTabs = new Stack<>();

    public void closeTab(BrowserHistory tab) {
        closedTabs.push(tab);
        System.out.println("Tab closed");
    }

    public BrowserHistory reopenTab() {
        if (!closedTabs.isEmpty()) {
            System.out.println("Tab reopened");
            return closedTabs.pop();
        }
        System.out.println("No tabs to reopen");
        return null;
    }
}

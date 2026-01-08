package com.day6.medistore;

interface ISellable {
    double sell(int qty);
    boolean checkExpiry();
}

package com.stringbuffer;

public class BufferBuilder {

    public static void main(String[] args) {
        int n = 1_000_000;

        // StringBuffer
        long startBuffer = System.nanoTime();
        StringBuffer sbuffer = new StringBuffer();
        for (int i = 0; i < n; i++) {
            sbuffer.append("hello");
        }
        long endBuffer = System.nanoTime();

        // StringBuilder
        long startBuilder = System.nanoTime();
        StringBuilder sbuilder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sbuilder.append("hello");
        }
        long endBuilder = System.nanoTime();

        System.out.println("StringBuffer Time (ns): " + (endBuffer - startBuffer));
        System.out.println("StringBuilder Time (ns): " + (endBuilder - startBuilder));
    }
}

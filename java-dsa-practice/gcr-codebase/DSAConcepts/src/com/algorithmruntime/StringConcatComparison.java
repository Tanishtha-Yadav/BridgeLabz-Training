package com.algorithmruntime;

public class StringConcatComparison {

    public static void main(String[] args) {

        int n = 100000; // change to 1000 / 10000 / 1000000 if system allows

        // -------- Using String (Immutable) --------
        long start = System.nanoTime();
        String s = "";
        for (int i = 0; i < n; i++) {
            s = s + "a";
        }
        long end = System.nanoTime();
        System.out.println("String Time: " + (end - start) / 1_000_000 + " ms");

        // -------- Using StringBuilder --------
        start = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append("a");
        }
        end = System.nanoTime();
        System.out.println("StringBuilder Time: " + (end - start) / 1_000_000 + " ms");

        // -------- Using StringBuffer --------
        start = System.nanoTime();
        StringBuffer sf = new StringBuffer();
        for (int i = 0; i < n; i++) {
            sf.append("a");
        }
        end = System.nanoTime();
        System.out.println("StringBuffer Time: " + (end - start) / 1_000_000 + " ms");
    }
}

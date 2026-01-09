package com.algorithmruntime;

public class FibonacciComparison {

    // -------- Recursive Fibonacci (O(2^N)) --------
    static long fibonacciRecursive(int n) {
        if (n <= 1) return n;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    // -------- Iterative Fibonacci (O(N)) --------
    static long fibonacciIterative(int n) {
        if (n <= 1) return n;
        long a = 0, b = 1, sum = 0;
        for (int i = 2; i <= n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }

    public static void main(String[] args) {

        int n = 40; // Change N to test
        System.out.println("Fibonacci number at position " + n);

        // Recursive
        long start = System.nanoTime();
        long recursiveResult = fibonacciRecursive(n);
        long end = System.nanoTime();
        System.out.println("Recursive Result: " + recursiveResult +
                " | Time: " + (end - start) / 1_000_000 + " ms");

        // Iterative
        start = System.nanoTime();
        long iterativeResult = fibonacciIterative(n);
        end = System.nanoTime();
        System.out.println("Iterative Result: " + iterativeResult +
                " | Time: " + (end - start) / 1_000_000 + " ms");
    }
}

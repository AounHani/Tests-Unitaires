package org.example.Exo3;

public class Fibonacci {
    public static int fibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be positive");
        }
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
// on a 4 branche d apres organigramme -> 4 classe d equivalence a tester
package testsTp0.Exo3;

import org.example.Exo3.Fibonacci;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FibonacciTest {
    @Test
    void FibonacciShouldThrowsExceptionForNegativeNumbers() {
        assertThrows(IllegalArgumentException.class, () -> Fibonacci.fibonacci(-1));
    }

    @Test
    void FibonacciShouldReturnsZeroForNumberEqualZero() {
        assertEquals(0, Fibonacci.fibonacci(0));
    }

    @Test
    void FibonacciShouldReturnsOneForNumberEqualOne() {
        assertEquals(1, Fibonacci.fibonacci(1));
    }

    @Test
    void FibonacciShouldReturnsCorrectValuesForNumbersGreaterThanOne() {
        assertEquals(1, Fibonacci.fibonacci(2));
        assertEquals(2, Fibonacci.fibonacci(3));
        assertEquals(3, Fibonacci.fibonacci(4));


    }
}

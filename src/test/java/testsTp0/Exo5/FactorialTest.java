package testsTp0.Exo5;

import org.example.Exo5.Factorial;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FactorialTest {
    @Test
    void FactorialShouldReturnForNumberEqualZero() {
        // Arrange & Act
        int result = Factorial.factorial(0);
        // Assert
        assertEquals(1, result);
    }

    @Test
    void FactorialShouldReturnForNumberEqualOne() {
        // Arrange & Act
        int result = Factorial.factorial(1);
        // Assert
        assertEquals(1, result);
    }

    @Test
    void FactorialForPositiveNumbers() {
        // Arrange & Act
        int result2 = Factorial.factorial(2);
        int result3 = Factorial.factorial(3);
        int result4 = Factorial.factorial(4);
        // Assert
        assertEquals(2, result2);
        assertEquals(6, result3);
        assertEquals(24, result4);
    }

    @Test
    void FactorialShouldThrowsExceptionForNegativeNumber() {
        // Act and Assert
        assertThrows(IllegalArgumentException.class, () -> Factorial.factorial(-1));
    }
}

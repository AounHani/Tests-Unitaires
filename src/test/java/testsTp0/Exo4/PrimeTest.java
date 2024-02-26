package testsTp0.Exo4;

import org.example.Exo4.Prime;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PrimeTest {
    @Test
    public void PrimeShouldReturnsFalseForNegativeAndLessThanTwoNumbers() {
        assertFalse(Prime.isPrime(1));
        assertFalse(Prime.isPrime(0));
        assertFalse(Prime.isPrime(-1));
    }

    @Test
    public void PrimeShouldReturnsFalseForNonPrimeNumbers() {
        assertFalse(Prime.isPrime(4));
        assertFalse(Prime.isPrime(9));

    }

    @Test
    public void PrimeShouldReturnsTrueForPrimeNumbers() {
        assertTrue(Prime.isPrime(2));
        assertTrue(Prime.isPrime(13));
    }

    @Test
    public void PrimeShouldReturnsFalseForPerfectSquareOfPrimeNumbers() {
        assertFalse(Prime.isPrime(4));
        assertFalse(Prime.isPrime(25));
    }

    @Test
    public void PrimeShouldReturnsFalseForLargeNonPrimeNumbers() {
        assertFalse(Prime.isPrime(10010));
        assertFalse(Prime.isPrime(10000));
    }

    @Test
    public void PrimeShouldReturnsTrueForLargePrimeNumbers() {
        assertTrue(Prime.isPrime(89));
        assertTrue(Prime.isPrime(113));
    }
}

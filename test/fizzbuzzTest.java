import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzbuzzTest {
    Fizzbuzz tester = new Fizzbuzz();

    @Test
    @DisplayName("Should return Fizzbuzz when divisible by 5 and 3")
    void shouldReturnFizzbuzz () {
        assertEquals("Fizzbuzz", tester.fizzbuzz(15));
    }

    @Test
    @DisplayName("Should return Fizz if divisible by 3")
    void shouldReturnFizz () {
        assertEquals("Fizz", tester.fizzbuzz(9));
    }

    @Test
    @DisplayName("Should return Buzz if divisible by 5")
    void shouldReturnBuzz () {
        assertEquals("Buzz", tester.fizzbuzz(10));
    }

    @Test
    @DisplayName("Should return the number if not divisible by 3, 5, 15")
    void shouldReturnNumber () {
        assertEquals("8", tester.fizzbuzz(8));
    }
}
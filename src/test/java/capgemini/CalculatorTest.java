package capgemini;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    Calculator calculator;

    @BeforeEach
    void setup() {
        calculator = new Calculator();
    }

    @Test
    @DisplayName("Test that sum of two positive numbers is positive number")
    void plus_twoPositiveNumbers_resultIsPositive() {
        long sum = calculator.plus(1, 2);
        assertEquals(3, sum);
    }

    @Test
    @DisplayName("Test that sum of two big positive numbers is positive number")
    void plus_twoBigPositiveNumbers_resultIsPositive() {
        long sum = calculator.plus(Integer.MAX_VALUE, Integer.MAX_VALUE);
        assertTrue(sum > 0);
    }

    @Test
    @DisplayName("Test that multiply two big pisitive numbers is positive number")
    void multiply_twoBigPositiveNumbers_resultIsPositive(){
        long multiply = calculator.multiple(Integer.MAX_VALUE, Integer.MAX_VALUE);
        assertTrue(multiply > 0);
    }

    @Test
    @DisplayName("Test that divides by 0 - throws a exception")
    void divideByZero_throwException () {
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(1,0));
    }

}

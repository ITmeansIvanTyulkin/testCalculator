import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;

/* Это те же тесты, что и в "Tests.java", только параметризованные.
Используемые литералы идентичные непараметризованным тестам.
*/

// Тесты калькулятора на умножение.

@RunWith(Parameterized.class)

public class CalculatorTestsMultiply {
    private final int firstNumber;
    private final int secondNumber;
    private final int expectedNumber;


    public CalculatorTestsMultiply(int firstNumber, int secondNumber, int expectedNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.expectedNumber = expectedNumber;
    }

    @Parameterized.Parameters
    public static Object[][] getMultiplyData() {
        return new Object[][]{
                {3, 4, 12},
                {-3, 2, -6},
                {-3, -5, 15},
                {-3, 0, 0},
        };
    }

    @Test
    public void shouldBeMultiply() {
        Calculator calculator = new Calculator();
        int actual = calculator.multiply(firstNumber, secondNumber);
        assertEquals("The result is incorrect.", actual, expectedNumber);
        System.out.println("\nThe result is correct. The calculator works well.");
    }
}
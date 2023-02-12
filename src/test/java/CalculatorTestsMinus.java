import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;

/* Это те же тесты, что и в "Tests.java", только параметризованные.
Используемые литералы идентичные непараметризованным тестам.
*/

// Тесты калькулятора на вычитание.

@RunWith(Parameterized.class)

public class CalculatorTestsMinus {
    private final int firstNumber;
    private final int secondNumber;
    private final int expectedNumber;


    public CalculatorTestsMinus(int firstNumber, int secondNumber, int expectedNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.expectedNumber = expectedNumber;
    }

    @Parameterized.Parameters
    public static Object[][] getMinusData() {
        return new Object[][]{
                {5, 3, 2},
                {-2, 5, -7},
                {-2, -3, 1},
                {4, 0, 4},
        };
    }
    @Test
    public void shouldBeMinus() {
        Calculator calculator = new Calculator();
        int actual = calculator.minus(firstNumber, secondNumber);
        assertEquals("The difference is incorrect.", actual, expectedNumber);
        System.out.println("\nThe difference is correct. The calculator works well.");
    }
}
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;

/* Это те же тесты, что и в "Tests.java", только параметризованные.
Используемые литералы идентичные непараметризованным тестам.
*/

// Тесты калькулятора на сложение.

@RunWith(Parameterized.class)

public class CalculatorTestsSum {
    private final int firstNumber;
    private final int secondNumber;
    private final int expectedNumber;


    public CalculatorTestsSum(int firstNumber, int secondNumber, int expectedNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.expectedNumber = expectedNumber;
    }

    @Parameterized.Parameters
    public static Object[][] getSumData() {
        return new Object[][]{
                {2, 3, 5},
                {-2, 7, 5},
                {-2, -3, -5},
                {0, 3, 3},
        };
    }
    @Test
    public void shouldBeSum() {
        Calculator calculator = new Calculator();
        int actual = calculator.sum(firstNumber, secondNumber);
        assertEquals("The sum is incorrect.", actual, expectedNumber);
        System.out.println("\nThe sum is correct. The calculator works well.");
    }
}
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;

/* Это те же тесты, что и в "Tests.java", только параметризованные.
Используемые литералы идентичные непараметризованным тестам.
*/

// Тесты калькулятора на деление.

@RunWith(Parameterized.class)

public class CalculatorTestsDivision {
    private final int firstNumber;
    private final int secondNumber;
    private final int expectedNumber;


    public CalculatorTestsDivision(int firstNumber, int secondNumber, int expectedNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.expectedNumber = expectedNumber;
    }

    @Parameterized.Parameters
    public static Object[][] getDivisionData() {
        return new Object[][]{
                {15, 3, 5},
                {-15, 3, -5},
                {-20, -5, 4},
                {-5, 0, 0}, // Проверка деления на ноль. Сообщение: "Forbidden! Error.". Тест НЕ упал, так задумано.
                {0, 3, 0},
        };
    }

    @Test
    public void shouldBeDivision() {
        Calculator calculator = new Calculator();
        int actual = calculator.division(firstNumber, secondNumber);
        assertEquals("The result is incorrect.", actual, expectedNumber);
        System.out.println("\nThe result is correct. The calculator works well.");
    }
}
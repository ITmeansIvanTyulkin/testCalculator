import org.junit.Assert;
import org.junit.Test;

/* Это непараметризованные тесты.
Используемые в них литералы - идентичны параметризованным тестам в CalculatorTests.
*/

public class Tests {
    // Sum tests.
    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        Assert.assertEquals("The sum is incorrect.", calculator.sum(2, 3), 5);
        System.out.println("\nThe sum is correct. The calculator works well.");
    }

    @Test
    public void testSumWhenOneOfTheNumsIsNegative() {
        Calculator calculator = new Calculator();
        Assert.assertEquals("The sum is incorrect.", calculator.sum((-2), 7), 5);
        System.out.println("\nThe sum is correct. The calculator works well.");
    }

    @Test
    public void testSumWhenBothOfTheNumsAreNegative() {
        Calculator calculator = new Calculator();
        Assert.assertEquals("The sum is incorrect.", calculator.sum(-2, -3), -5);
        System.out.println("\nThe sum is correct. The calculator works well.");
    }

    @Test
    public void testSumWhenOneOfTheNumsIsZero() {
        Calculator calculator = new Calculator();
        Assert.assertEquals("The sum is incorrect.", calculator.sum(0, 3), 3);
        System.out.println("\nThe sum is correct. The calculator works well.");
    }

    // Minus tests.
    @Test
    public void testMinus() {
        Calculator calculator = new Calculator();
        Assert.assertEquals("The difference is not correct.", calculator.minus(5, 2), 3);
        System.out.println("\nThe difference is correct. The calculator works well.");
    }

    @Test
    public void testMinusWhenOneOfTheNumsIsNegative() {
        Calculator calculator = new Calculator();
        Assert.assertEquals("The difference is not correct.", calculator.minus(-5, 2), -7);
        System.out.println("\nThe difference is correct. The calculator works well.");
    }

    @Test
    public void testMinusWhenBothOfTheNumsAreNegative() {
        Calculator calculator = new Calculator();
        Assert.assertEquals("The difference is incorrect.", calculator.minus(-2, -3), 1);
        System.out.println("\nThe difference is correct. The calculator works well.");
    }

    @Test
    public void testMinusWhenOneOfTheNumsIsZero() {
        Calculator calculator = new Calculator();
        Assert.assertEquals("The difference is incorrect.", calculator.minus(4, 0), 4);
        System.out.println("\nThe difference is correct. The calculator works well.");
    }

    // Multiply tests.
    @Test
    public void testMultiply() {
        Calculator calculator = new Calculator();
        Assert.assertEquals("The result is incorrect.", calculator.multiply(3, 4), 12);
        System.out.println("\nThe result is correct. The calculator works well.");
    }

    @Test
    public void testMultiplyWhenOneOfTheNumsIsNegative() {
        Calculator calculator = new Calculator();
        Assert.assertEquals("The result is incorrect.", calculator.multiply(-3, 2), -6);
        System.out.println("\nThe result is correct. The calculator works well.");
    }

    @Test
    public void testMultiplyWhenBothOfTheNumsAreNegative() {
        Calculator calculator = new Calculator();
        Assert.assertEquals("The result is incorrect.", calculator.multiply(-3, -5), 15);
        System.out.println("\nThe result is correct. The calculator works well.");
    }

    @Test
    public void testMultiplyWhenOneOfTheNumsIsZero() {
        Calculator calculator = new Calculator();
        Assert.assertEquals("The result is incorrect.", calculator.multiply(-3, 0), 0);
        System.out.println("\nThe result is correct. The calculator works well.");
    }

    // Division tests.
    @Test
    public void testDivision() {
        Calculator calculator = new Calculator();
        Assert.assertEquals("The result is incorrect.", calculator.division(15, 3), 5);
        System.out.println("\nThe result is correct. The calculator works well.");
    }

    @Test
    public void testDivisionyWhenOneOfTheNumsIsNegative() {
        Calculator calculator = new Calculator();
        Assert.assertEquals("The result is incorrect.", calculator.division(-15, 3), -5);
        System.out.println("\nThe result is correct. The calculator works well.");
    }

    @Test
    public void tastDivisionWhenBothOfTheNumsAreNegative() {
        Calculator calculator = new Calculator();
        Assert.assertEquals("The result is incorrect.", calculator.division(-20, -5), 4);
        System.out.println("\nThe result is correct. The calculator works well.");
    }

    @Test
    public void testDivisionWhenOneOfTheNumsIsZero() {
        Calculator calculator = new Calculator();
        Assert.assertEquals("The result is incorrect.", calculator.division(-5, 0), 0);
        System.out.println("\nThe result is correct. The calculator works well.");
    }

    @Test
    public void testDivisionWhenOneOfTheNumsIsZero1() {
        Calculator calculator = new Calculator();
        Assert.assertEquals("The result is incorrect.", calculator.division(0, 3), 0);
        System.out.println("\nThe result is correct. The calculator works well.");
    }
}
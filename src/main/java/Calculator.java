public class Calculator {
    public int sum(int a, int b) {
        return a + b;
    }

    public int minus(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int division(int a, int b) {
        if (b == 0) {
            System.out.println("\nForbidden! Error.");
        }
        return a / b;
    }
}
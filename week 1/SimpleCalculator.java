package week1;

class Calculator {
    int result;

    public Calculator() {
        this.result = 0;
    }

    public int add(int a, int b) {
        return this.result = a + b;
    }

    public int subtract(int a, int b) {
        return this.result = a - b;
    }

    public int multiply(int a, int b) {
        return this.result = a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) return 0;
        return this.result = a / b;
    }
}

public class SimpleCalculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(4, 6));
        System.out.println(calculator.subtract(6, 4));
        System.out.println(calculator.multiply(4, 6));
        System.out.println(calculator.divide(6,2));
    }
}





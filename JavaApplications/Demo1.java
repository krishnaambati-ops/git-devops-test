class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

}

class Division1 {
    public double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        return (double) a / b;
    }
}

public class Demo1 {
	public static void main(String a[]) {
		Calculator calc = new Calculator();
		int sum = calc.add(5, 10);
		System.out.println("The sum is: " + sum);
        int difference = calc.subtract(10, 5);
		System.out.println("The difference is: " + difference);
        int product = calc.multiply(5, 10);
        System.out.println("The product is: " + product);
        Division1 calc2 = new Division1();
        double quotient = calc2.divide(10, 5);
        System.out.println("The quotient is: " + quotient); 
	}
}
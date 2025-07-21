public class Demo8 {
    public static void main(String[] args) {
        AdvancedCalculator advCalc = new AdvancedCalculator();
        int result = advCalc.add(5, 10);
        System.out.println("The sum is: " + result);
        int difference = advCalc.subtract(10, 5);
        System.out.println("The difference is: " + difference);



        int product = advCalc.multiply(4, 5);
        System.out.println("The product is: " + product);
        try {
            int quotient = advCalc.divide(20, 4);
            System.out.println("The quotient is: " + quotient);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
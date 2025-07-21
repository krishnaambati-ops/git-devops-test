class First{
    public First() {
        System.out.println("First class constructor called.");
        }

    public First(int value) {
        System.out.println("First class constructor with parameter called. Value: " + value);
    }
}

class Second extends First {
    public Second() {
        super(); // Calls the default constructor of First
        System.out.println("Second class constructor called.");
    }

    public Second(int value) {
        super(value);
        System.out.println("Second class constructor with parameter called. Value: " + value);
    }
}

public class Demo6 {
    public static void main(String[] args) {
        Second second = new Second();
        Second secondWithParam = new Second(10);
    }

}

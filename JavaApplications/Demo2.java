class Car {
    String color;
    String model;
    int year;
    int basePrice=10000;

    public Car(String color, String model, int year) {
        this.color = color;
        this.model = model;
        this.year = year;
    }

    public void displayInfo() {
        System.out.println("Car Model: " + model + ", Color: " + color + ", Year: " + year);
    }

    public int cost(int price) {
        // Placeholder for cost calculation logic
        return price;
    }

    public double costtax(int price, double tax) {
        // Placeholder for cost calculation logic
        return  (price + (price * tax / 100));
    }

    public double costtax(double price, double tax) {
        // Placeholder for cost calculation logic
        return price + (price * tax / 100);
    }
}

public class Demo2 {
    public static void main(String a[]) {
        Car car1 = new Car("Red", "Toyota", 2020);
        Car car2 = new Car("Blue", "Honda", 2019);
        car1.displayInfo();
        car2.displayInfo();
        System.out.println("Cost of car1: $" + car1.cost(10000));
        System.out.println("Cost of car2: $" + car2.cost(12000));
        System.out.println("Cost of car1 with tax: $" + car1.costtax(10000, 8.5));
        System.out.println("Cost of car2 with tax: $" + car2.costtax(12000, 3.5));
        car1.basePrice = 15000;
        System.out.println("Cost of car1 with base price: $" + car1.cost(car1.basePrice));
        System.out.println("Cost of car2 with base price: $" + car2.cost(car2.basePrice));
    }
}
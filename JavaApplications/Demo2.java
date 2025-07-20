class Car {
    String color;
    String model;
    int year;

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
}

public class Demo2 {
    public static void main(String a[]) {
        Car car1 = new Car("Red", "Toyota", 2020);
        Car car2 = new Car("Blue", "Honda", 2019);
        car1.displayInfo();
        car2.displayInfo();
        System.out.println("Cost of car1: $" + car1.cost(10000));
        System.out.println("Cost of car2: $" + car2.cost(12000));
    }
}
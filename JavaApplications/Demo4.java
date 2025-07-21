class Mobile {

    static String name;

    int price;
    
    static {
        name = "Mobile";
        System.out.println("Static Block: Initializing Mobile class");
    }

    public static void display(){
        System.out.println("Static Method: Displaying Mobile Name: " + name);
    }

    public static void display2(Mobile m) {
        System.out.println("Static Method 2: Displaying Mobile Price: " + m.price);
    }

    public String getName() {
        return name;
    }
}

public class Demo4 {
    public static void main(String[] args) throws ClassNotFoundException {

        Class.forName("Mobile");
        Mobile.name = "Nokia";
        System.out.println("Static Mobile Name: " + Mobile.name);  

        Mobile m1 = new Mobile();
        m1.price = 10000;
        System.out.println("Mobile Price: " + m1.price);
        System.out.println("Mobile Name: " + m1.getName());
        Mobile m2 = new Mobile();
        System.out.println("Mobile Name: " + m2.getName());
        Mobile.display();
        Mobile.display2(m1);
    }


}

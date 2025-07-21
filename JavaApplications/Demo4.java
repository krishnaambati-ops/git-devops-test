class Mobile {

    static String name;
    static {
        name = "Mobile";
        System.out.println("Static Block: Initializing Mobile class");
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
        System.out.println("Mobile Name: " + m1.getName());
        Mobile m2 = new Mobile();
        System.out.println("Mobile Name: " + m2.getName());
    }


}

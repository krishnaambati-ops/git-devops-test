class Mobile {
    static String name;
    


    public String getName() {
        return name;
    }
}

public class Demo4 {
    public static void main(String[] args) {

        Mobile.name = "Nokia";

        System.out.println("Static Mobile Name: " + Mobile.name);  

        Mobile m1 = new Mobile();
        System.out.println("Mobile Name: " + m1.getName());
        Mobile m2 = new Mobile();
        System.out.println("Mobile Name: " + m2.getName());
    }


}

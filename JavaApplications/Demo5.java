class Windows {
    private int age;
    private String name;

    public Windows() {
        // Default constructor
        System.out.println("New Windows object created.");
        age=0;  // Default age 
        name=""; 
    } 

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }

}

public class Demo5 {
    public static void main(String[] args) {
        Windows windows1 = new Windows();
        windows1.setAge(5);
        windows1.setName("Windows 10");
        System.out.println("Age: " + windows1.getAge());
        System.out.println("Name: " + windows1.getName());
    }
}

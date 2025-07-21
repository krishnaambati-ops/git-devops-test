class Tech {
    int id;
    String name;
    
    public Tech() {
        System.out.println("Tech class constructor called.");
    }

    public void show() {
        System.out.println("Tech class show method called.");
    }
}

public class Demo7 {
    public static void main(String[] args) {
        new Tech().show();
    }
}

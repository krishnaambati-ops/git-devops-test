class Student {
    private String name;
    private int age;
    private int marks; 

    public Student(String name, int age, int marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    
    public int getMarks() {
        return marks;
    }
}

public class Demo3 {
    public static void main(String[] args) {
        Student student1 = new Student("Alice", 20, 85);
        Student student2 = new Student("Bob", 22, 90);
        
        System.out.println("Student 1: " + student1.getName() + ", Age: " + student1.getAge() + ", Marks: " + student1.getMarks());
        System.out.println("Student 2: " + student2.getName() + ", Age: " + student2.getAge() + ", Marks: " + student2.getMarks());
        
        Student[] students = {student1, student2};
        for (Student student : students) {
            System.out.println("Student Name: " + student.getName() + ", Age: " + student.getAge() + ", Marks: " + student.getMarks());
        }

        String studentName = new String("Charlie");
        System.out.println("New student name: " + studentName);
        studentName = studentName + " Smith";
        System.out.println(studentName.charAt(2));
        System.out.println(studentName.concat(" David"));
        System.out.println("Length of student name: " + studentName.length());
        System.out.println("Index of 'S': " + studentName.indexOf('S'));
        System.out.println("Substring from index 3: " + studentName.substring(3));
        System.out.println("Uppercase: " + studentName.toUpperCase());
        System.out.println("Lowercase: " + studentName.toLowerCase());
        System.out.println("Trimmed name: " + studentName.trim()); 
        System.out.println("Replaced 'Charlie' with 'David': " + studentName.replace("Charlie", "David"));
        System.out.println("Starts with 'Charlie': " + studentName.startsWith("Charlie"));
        System.out.println("Ends with 'Smith': " + studentName.endsWith("Smith"));

        StringBuffer studentBuffer = new StringBuffer("John");
        studentBuffer.append(" Doe");
        System.out.println("StringBuffer: " + studentBuffer);
        studentBuffer.insert(0, "Mr. ");
        System.out.println("After insert: " + studentBuffer);
        studentBuffer.replace(0, 4, "Dr. ");
        System.out.println("After replace: " + studentBuffer);
        studentBuffer.delete(0, 4);
        System.out.println("After delete: " + studentBuffer);
        System.out.println("Reversed: " + studentBuffer.reverse()); 
    }
}

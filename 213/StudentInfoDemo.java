class Student {
    String name = "John";
    int rollNo = 101;

    void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNo);
    }
}

public class StudentInfoDemo {
    public static void main(String[] args) {
        Student s = new Student();
        s.displayInfo();
    }
}
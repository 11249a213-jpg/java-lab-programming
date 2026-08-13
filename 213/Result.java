interface Student {
    void getStudent();
}

interface Marks {
    void getMarks();
}

public class Result implements Student, Marks {
    String name;
    int m1, m2, m3;

    public void getStudent() {
        name = "Ravi";
    }

    public void getMarks() {
        m1 = 80;
        m2 = 75;
        m3 = 90;
    }

    void display() {
        int total = m1 + m2 + m3;
        System.out.println("Name: " + name);
        System.out.println("Total: " + total);
    }

    public static void main(String[] args) {
        Result r = new Result();
        r.getStudent();
        r.getMarks();
        r.display();
    }
}
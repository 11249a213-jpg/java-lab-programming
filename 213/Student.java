class Student {
    int roll = 101;
    String name = "Rahul";
}

class Marks extends Student {
    int m1 = 80, m2 = 90, m3 = 70, m4 = 85, m5 = 95;
}

class Result extends Marks {
    void display() {
        int total = m1 + m2 + m3 + m4 + m5;
        double avg = total / 5.0;

        System.out.println("Roll No: " + roll);
        System.out.println("Name: " + name);
        System.out.println("Total: " + total);
        System.out.println("Average: " + avg);

        if (avg >= 90)
            System.out.println("Grade: A");
        else if (avg >= 75)
            System.out.println("Grade: B");
        else
            System.out.println("Grade: C");
    }
}

public class Main {
    public static void main(String[] args) {
        Result r = new Result();
        r.display();
    }
}
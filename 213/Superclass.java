// Superclass
class Employee {
    int empId;
    String name;
    double basicSalary;

    // Constructor
    Employee(int empId, String name, double basicSalary) {
        this.empId = empId;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    // Display employee details
    void displayDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
    }
}

// Subclass
class PermanentEmployee extends Employee {
    double hra, da;

    // Constructor
    PermanentEmployee(int empId, String name, double basicSalary, double hra, double da) {
        super(empId, name, basicSalary);
        this.hra = hra;
        this.da = da;
    }

    // Calculate Gross Salary
    double calculateGrossSalary() {
        return basicSalary + hra + da;
    }

    // Display all details
    void displayEmployee() {
        displayDetails();
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("Gross Salary: " + calculateGrossSalary());
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        PermanentEmployee emp = new PermanentEmployee(101, "John", 30000, 5000, 3000);

        emp.displayEmployee();
    }
}
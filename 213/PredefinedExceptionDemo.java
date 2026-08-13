import java.util.Scanner;

public class PredefinedExceptionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter your age: ");
            String input = sc.nextLine();

            int age = Integer.parseInt(input);

            System.out.println("Age entered: " + age);

            // Demonstrating ArithmeticException
            int result = 100 / (age - age);
            System.out.println("Result: " + result);

        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter a valid number for age.");
        } catch (ArithmeticException e) {
            System.out.println("Error: Arithmetic operation cannot be performed.");
        }

        System.out.println("Program continues normally.");

        sc.close();
    }
}
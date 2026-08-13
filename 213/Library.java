import java.util.Scanner;

public class Library {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] books = new String[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter book title " + (i + 1) + ": ");
            books[i] = sc.nextLine();
        }

        System.out.println("Books starting with A:");

        for (int i = 0; i < 10; i++) {
            if (books[i].startsWith("A") || books[i].startsWith("a")) {
                System.out.println(books[i]);
            }
        }

        sc.close();
    }
}
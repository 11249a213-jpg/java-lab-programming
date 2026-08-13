import java.util.Scanner;

public class Sales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] sales = new int[12];

        for (int i = 0; i < 12; i++) {
            System.out.print("Enter sales for month " + (i + 1) + ": ");
            sales[i] = sc.nextInt();
        }

        int max = sales[0];
        int min = sales[0];

        for (int i = 1; i < 12; i++) {
            if (sales[i] > max) {
                max = sales[i];
            }

            if (sales[i] < min) {
                min = sales[i];
            }
        }

        System.out.println("Highest Sales: " + max);
        System.out.println("Lowest Sales: " + min);

        sc.close();
    }
}
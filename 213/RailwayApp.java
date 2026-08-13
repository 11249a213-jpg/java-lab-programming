import java.util.*;
public class RailwayApp {
    public static void main(String[] args) {

        String[] trainCodes = {"TN101", "TN202", "TN303", "TN404", "TN505"};

        try {
            int index = 6;  // Invalid index
            System.out.println("Train Code: " + trainCodes[index]);
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid train code index.");
            System.out.println("Please enter an index between 0 and " + (trainCodes.length - 1));
        }

        System.out.println("Railway app continues...");
    }
}
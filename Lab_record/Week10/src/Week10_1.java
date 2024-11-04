import java.util.ArrayList;
import java.util.Scanner;

public class Week10_1 {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Create an ArrayList to store integers
        ArrayList<Integer> list = new ArrayList<>();

        // Prompt the user for the number of elements
        int n = scanner.nextInt();

        // Read elements from the user
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }

        // Check if the list is not empty
        if (!list.isEmpty()) {
            // Get the first and last elements
            int first = list.get(0);
            int last = list.get(list.size() - 1);

            // Print the ArrayList
            System.out.print("ArrayList: ");
            System.out.print(list);
            System.out.println();

            // Print the results in the desired format
            System.out.println("First : " + first + ", Last : " + last);
        } else {
            System.out.println("The ArrayList is empty.");
        }

        // Close the scanner
        scanner.close();
    }
}

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Week10_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of colors
        int n = scanner.nextInt();
        scanner.nextLine();  // Consume the newline character

        ArrayList<String> colorList = new ArrayList<>();

        // Reading colors from the user
        for (int i = 0; i < n; i++) {
            String color = scanner.nextLine();
            colorList.add(color);
        }

        // Printing the list before reversing
        System.out.println("List before reversing :");
        System.out.println(colorList);

        // Reversing the list
        Collections.reverse(colorList);

        // Printing the list after reversing
        System.out.println("List after reversing :");
        System.out.println(colorList);

        // Close the scanner
        scanner.close();
    }
}

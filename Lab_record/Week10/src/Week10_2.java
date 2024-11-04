import java.util.ArrayList;
import java.util.Scanner;

class prog {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the number of elements
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>();

        // Reading elements into the ArrayList
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        // Printing the initial value of ArrayList
        System.out.println("ArrayList: " + list);

        // Replacing the element at index 1 with 100
        // Check to ensure index is within bounds
        if (n > 1) {
            list.set(1, 100);
        }

        // Getting the index of first occurrence of 100
        System.out.println("Index of 100 = " + list.indexOf(100));

        // Getting the index of last occurrence of 100
        System.out.println("LastIndex of 100 = " + list.lastIndexOf(100));

        // Check whether 200 is in the list or not
        System.out.println(list.contains(200)); // Output: false

        // Print ArrayList size
        System.out.println("Size Of ArrayList = " + list.size());

        // Inserting 500 at index 1
        // Check to ensure index is within bounds
        if (n >= 1) {
            list.add(1, 500);
        }

        // Removing an element from position 3
        // Check to ensure index is within bounds
        if (list.size() > 3) {
            list.remove(3);
        }

        // Print the final ArrayList
        System.out.println("ArrayList: " + list);

        // Close the scanner
        sc.close();
    }
}

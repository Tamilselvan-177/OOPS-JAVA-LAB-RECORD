import java.util.HashSet;
import java.util.Scanner;

class week11_2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create the first set and add elements
        int n1 = sc.nextInt();
        sc.nextLine();  // Consume the newline
        HashSet<String> set1 = new HashSet<>();

        for (int i = 0; i < n1; i++) {
            set1.add(sc.nextLine());
        }

        // Create the second set and add elements
        int n2 = sc.nextInt();
        sc.nextLine();  // Consume the newline
        HashSet<String> set2 = new HashSet<>();

        for (int i = 0; i < n2; i++) {
            set2.add(sc.nextLine());
        }

        // Retain only the common elements between the two sets
        set1.retainAll(set2);

        // Output the common elements
        for (String element : set1) {
            System.out.println(element);
        }

        sc.close();
    }
}

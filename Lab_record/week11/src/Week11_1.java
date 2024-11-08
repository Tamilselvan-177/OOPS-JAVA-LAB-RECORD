import java.util.HashSet;
import java.util.Scanner;

class week11_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Create a HashSet object called numbers
        HashSet<Integer> numbers = new HashSet<>();

        // Add values to the set
        for (int i = 0; i < n; i++) {
            numbers.add(sc.nextInt());
        }

        int skey = sc.nextInt();

        // Check if the given number exists in the set
        if (numbers.contains(skey)) {
            System.out.println(skey + " was found in the set.");
        } else {
            System.out.println(skey + " was not found in the set.");
        }

        sc.close();
    }
}

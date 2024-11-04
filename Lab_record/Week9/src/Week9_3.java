import java.util.Scanner;

public class Week9_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the size of the array
        int size = scanner.nextInt();

        // Declare the array
        int[] array = new int[size];

        // Read the elements into the array
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Attempt to perform division and access an out-of-bounds index
        try {
            // This will throw an ArithmeticException if array[1] is zero
            int result = array[0] / array[1];
        } catch (ArithmeticException e) {
            System.out.println(e);
        }

        try {
            // This will throw an ArrayIndexOutOfBoundsException if size <= 3
            int outOfBoundsValue = array[3];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }

        // This will always execute
        System.out.println("I am always executed");

        scanner.close();
    }
}

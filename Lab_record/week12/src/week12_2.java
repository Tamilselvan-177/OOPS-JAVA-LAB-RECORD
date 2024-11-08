import java.util.HashSet;
import java.util.Scanner;

public class week12_2 {

    public static int calculateSingleDigitSum(int sum) {
        // Keep adding digits until the sum is a single digit
        while (sum > 9) {
            int temp = 0;
            while (sum != 0) {
                temp += sum % 10;
                sum /= 10;
            }
            sum = temp;
        }
        return sum;
    }

    public static int findCommonAlphabetSum(char[] input1, char[] input2) {
        // Convert the first input array to a set to get unique characters
        HashSet<Character> set1 = new HashSet<>();
        for (char c : input1) {
            set1.add(c);
        }

        // Sum the ASCII values of characters present in both arrays
        int sum = 0;
        for (char c : input2) {
            if (set1.contains(c)) {
                sum += (int) c;
            }
        }

        // Calculate the single-digit sum
        return calculateSingleDigitSum(sum);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for the first array
        String input1Str = scanner.nextLine();
        char[] input1 = input1Str.replace(" ", "").toCharArray();

        // Input for the second array
        String input2Str = scanner.nextLine();
        char[] input2 = input2Str.replace(" ", "").toCharArray();

        // Calculate and print the result
        int result = findCommonAlphabetSum(input1, input2);
        System.out.println(result);

        scanner.close();
    }
}

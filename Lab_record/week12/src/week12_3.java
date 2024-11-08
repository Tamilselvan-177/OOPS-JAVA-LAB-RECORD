import java.util.Scanner;

public class week12_3 {

    // Method to decode the sequence
    public static String decode(String input) {
        // Split the input by '1' to separate the sequences of 0's
        String[] sequences = input.split("1");

        // StringBuilder to build the decoded word
        StringBuilder decodedWord = new StringBuilder();

        // Iterate over each sequence
        for (String sequence : sequences) {
            // If the sequence is not empty (it could be empty due to split)
            if (!sequence.isEmpty()) {
                int length = sequence.length();

                // The letter corresponding to the sequence length
                // 'Z' corresponds to length 1, 'Y' to length 2, ..., 'A' to length 26
                char letter = (char) ('Z' - (length - 1));

                // Append the letter to the decoded word
                decodedWord.append(letter);
            }
        }

        return decodedWord.toString();
    }

    public static void main(String[] args) {
        // Example input 1
        Scanner scanner = new Scanner(System.in);
        String input1= scanner.nextLine();

        System.out.println(decode(input1)); // Output: ZYX


    }
}

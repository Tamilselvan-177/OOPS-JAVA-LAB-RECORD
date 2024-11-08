import java.util.Scanner;

public class week12_1 {

    public static String reverseWords(String sentence, int caseOption) {
        // Split the sentence into words based on spaces
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            String reversedWord = reverseWord(words[i], caseOption);
            result.append(reversedWord);

            // Add space after each word except the last one
            if (i < words.length - 1) {
                result.append(" ");
            }
        }

        return result.toString();
    }

    private static String reverseWord(String word, int caseOption) {
        StringBuilder reversed = new StringBuilder();

        // Reverse the word
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed.append(word.charAt(i));
        }

        // If caseOption is 1, adjust the case based on the original positions
        if (caseOption == 1) {
            char[] resultChars = reversed.toString().toCharArray();

            for (int i = 0; i < word.length(); i++) {
                if (Character.isLetter(word.charAt(i))) {
                    if (Character.isUpperCase(word.charAt(i))) {
                        resultChars[i] = Character.toUpperCase(resultChars[i]);
                    } else {
                        resultChars[i] = Character.toLowerCase(resultChars[i]);
                    }
                }
            }
            return new String(resultChars);
        }

        // If caseOption is 0, return the reversed word as is
        return reversed.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for sentence input
        String sentence = scanner.nextLine();

        // Prompt user for case option input
        int caseOption = scanner.nextInt();

        // Output the result
        String result = reverseWords(sentence, caseOption);
        System.out.println(result);

        scanner.close();
    }
}

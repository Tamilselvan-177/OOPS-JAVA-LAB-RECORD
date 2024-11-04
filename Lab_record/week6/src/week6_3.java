import java.util.Scanner;

public class week6_3 {

    public static String processInput(String input1, int input2) {
        String[] words = input1.split(" ");
        int firstWordIndex = input2 / 10 - 1;
        int secondWordIndex = input2 % 10 - 1;
        if (firstWordIndex >= words.length || secondWordIndex >= words.length) {
            return "Invalid word index in input2";
        }
        String processedFirstWord = processWord(words[firstWordIndex]);
        String processedSecondWord = processWord(words[secondWordIndex]);
        return processedFirstWord + " " + processedSecondWord;
    }

    private static String processWord(String word) {
        int length = word.length();
        int middleIndex = length / 2;

        String middleToBegin;
        if (length % 2 == 0) {
            middleToBegin = new StringBuilder(word.substring(0, middleIndex)).reverse().toString();
        } else {
            middleToBegin = new StringBuilder(word.substring(0, middleIndex + 1)).reverse().toString();
        }
        String middleToEnd = word.substring(middleIndex);
        return middleToBegin + middleToEnd;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input1 = scanner.nextLine();

        int input2 = scanner.nextInt();

        String result = processInput(input1, input2);
        System.out.println(result);

        scanner.close();
    }
}

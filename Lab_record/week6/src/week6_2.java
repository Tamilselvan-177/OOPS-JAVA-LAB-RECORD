import java.util.Scanner;
public class week6_2 {

    public static String processInput(String input1) {
        String[] words = input1.split(":");

        StringBuilder output = new StringBuilder();

        for (String word : words) {

            char firstChar = word.charAt(0);
            char secondChar = word.charAt(1);

            if (firstChar == secondChar) {
                output.append(Character.toUpperCase(firstChar));
            } else {
                int pos1 = firstChar - 'a' + 1;
                int pos2 = secondChar - 'a' + 1;
                int diff = Math.abs(pos1 - pos2);
                char resultChar = (char) ('a' + (diff - 1));
                output.append(Character.toUpperCase(resultChar));
            }
        }

        return output.toString();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        System.out.println(processInput(a));
    }
}

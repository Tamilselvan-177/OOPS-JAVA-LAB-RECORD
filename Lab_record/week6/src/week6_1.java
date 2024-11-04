import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
public class week6_1 {

    public static String processStrings(String input1, String input2) {
        String concatenatedString = input1 + input2;
        String withoutSpaces = concatenatedString.replace(" ", "");
        char[] chars = withoutSpaces.toCharArray();

        LinkedHashSet<Character> uniqueCharsSet = new LinkedHashSet<>();
        for (char c : chars) {
            uniqueCharsSet.add(c);
        }
        char[] uniqueCharsArray = new char[uniqueCharsSet.size()];
        int i = 0;
        for (char c : uniqueCharsSet) {
            uniqueCharsArray[i++] = c;
        }

        Arrays.sort(uniqueCharsArray);
        StringBuilder result = new StringBuilder(new String(uniqueCharsArray));
        result.reverse();
        return result.length() > 0 ? result.toString() : "null";
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        String b = scan.nextLine();
        System.out.println(processStrings(a,b));
    }
}

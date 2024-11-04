import java.util.Scanner;

public class Week8_1 {
    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Step 1: Input the number of elements in the array

        int num = sc.nextInt();
        sc.nextLine(); // Consume the leftover newline character

        // Step 2: Initialize the array
        String[] stringArray = new String[num];

        // Step 3: Take input strings from the user
        for (int i = 0; i < num; i++) {
            stringArray[i] = sc.next();  // Read each string
        }

        // Step 4: Call the method to find and concatenate valid strings
        String result = concatenateVowelStrings(num, stringArray);

        // Step 5: Output the result
        System.out.println(result);

        sc.close();
    }

    // Method to concatenate strings with vowel as the first and last characters
    public static String concatenateVowelStrings(int num, String[] stringArray) {
        String vowels = "aeiouAEIOU";
        StringBuilder result = new StringBuilder();

        // Loop through each string in the array
        for (String str : stringArray) {
            // Check if the first and last characters are vowels
            if (vowels.indexOf(str.charAt(0)) != -1 && vowels.indexOf(str.charAt(str.length() - 1)) != -1) {
                result.append(str); // Concatenate valid strings
            }
        }

        // Return the concatenated result in lowercase, or "no matches found" if empty
        return result.length() > 0 ? result.toString().toLowerCase() : "no matches found";
    }
}

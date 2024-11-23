import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        System.out.println("Enter a word or phrase to check if it's a palindrome (type 'exit' to quit):");

        while (true) {
            input = scanner.nextLine();

            // Check for exit condition
            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Exiting the program. Goodbye!");
                break;
            }

            if (isPalindrome(input)) {
                System.out.println("\"" + input + "\" is a palindrome.");
            } else {
                System.out.println("\"" + input + "\" is not a palindrome.");
            }
        }

        scanner.close();
    }

    public static boolean isPalindrome(String str) {
        // Normalize the string: remove punctuation, spaces, and convert to lowercase
        String cleanedStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Check if the cleaned string is equal to its reverse
        String reversedStr = new StringBuilder(cleanedStr).reverse().toString();

        return cleanedStr.equals(reversedStr);
    }
}
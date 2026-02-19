import java.util.Scanner;

/**
 * LexicalTwistPuzzle
 * UC3: Validate Single Word Constraint
 * UC4: Check Reverse Relationship
 *
 * This class ensures that each input contains only one word.
 * It determines whether the second word is the reversed version
 * of the first word (case-insensitive).
 *
 * @Developer
 * @version 4.0
 */
public class LexicalTwistPuzzle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first word: ");
        String firstWord = sc.nextLine();

        if (firstWord.trim().contains(" ")) {
            System.out.println(firstWord + " is not a valid word.");
            sc.close();
            return;
        }

        System.out.print("Enter the second word: ");
        String secondWord = sc.nextLine();

        if (secondWord.trim().contains(" ")) {
            System.out.println(secondWord + " is not a valid word.");
            sc.close();
            return;
        }

        System.out.println("Valid words: " + firstWord + " " + secondWord);

        // Reverse check
        String reversed = new StringBuilder(firstWord).reverse().toString();

        if (reversed.equalsIgnoreCase(secondWord)) {
            System.out.println("Second word is the reverse of first word.");
        } else {
            System.out.println("Not a reverse match.");
        }

        sc.close();
    }
}

import java.util.Scanner;

/**
 * LexicalTwistPuzzle
 * UC4: Check Reverse Relationship
 * UC5: Transform Word if Reverse Match
 *
 * Determines whether the second word is the reversed version of the first word
 * (case-insensitive). Applies transformation when reverse match occurs.
 *
 * @Developer
 * @version 5.0
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

        // UC4: Reverse relationship check
        String reversed = new StringBuilder(firstWord).reverse().toString();

        if (reversed.equalsIgnoreCase(secondWord)) {
            System.out.println("Second word is the reverse of first word.");
            System.out.println("Reverse Matched");

            // UC5: Transformation
            String lower = reversed.toLowerCase();
            String transformed = lower.replaceAll("[aeiou]", "@");

            System.out.println("Transformed word: " + transformed);
        } else {
            System.out.println("Not a reverse match.");
        }

        sc.close();
    }
}

import java.util.Scanner;

/**
 * LexicalTwistPuzzle
 * UC5: Transform Word if Reverse Match
 * UC6: Combine Words if Not Reverse
 *
 * Flow:
 * 1. If reverse match → transform word
 * 2. Else → combine words and analyze characters
 *
 * @Developer
 * @version 6.0
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

        // Reverse check (UC4 logic reused)
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

            // UC6: Combine and analyze
            String combine = firstWord.concat(secondWord).toUpperCase();
            int vowels = 0;
            int consonants = 0;

            for (int i = 0; i < combine.length(); i++) {
                char ch = combine.charAt(i);

                if (ch == 'A' || ch == 'E' || ch == 'I'
                        || ch == 'O' || ch == 'U') {
                    vowels++;
                } else if (Character.isLetter(ch)) {
                    consonants++;
                }
            }

            System.out.println("Combined Word: " + combine);
            System.out.println("Vowels: " + vowels);
            System.out.println("Consonants: " + consonants);
        }

        sc.close();
    }
}

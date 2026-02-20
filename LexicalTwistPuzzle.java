import java.util.Scanner;
import java.util.*;

/**
 * LexicalTwistPuzzle UC6: Combine Words if Not Reverse
 * LexicalTwistPuzzle UC7: Output Based on Vowel–Consonant Count
 *
 * This class merges both words and analyses character distribution.
 * It prints characters based on distribution rules.
 *
 * Flow:
 * 1. Combine → firstWord + secondWord
 * 2. Convert to uppercase
 * 3. Count vowels and consonants separately
 *
 * Rules:
 * ✔ If vowels > consonants → Print first 2 unique vowels
 * ✔ If consonants > vowels → Print first 2 unique consonants
 * ✔ If equal → Print message
 *
 * Key Concepts Used:
 * ● String concatenation
 * ● toUpperCase()
 * ● Character classification
 * ● Ordered filtering
 * ● Duplicate removal
 * ● Conditional logic
 *
 * @version 6.0
 * @version 7.0
 */
public class LexicalTwistPuzzle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first word: ");
        String firstWord = sc.nextLine();

        System.out.print("Enter second word: ");
        String secondWord = sc.nextLine();

        // Combine and convert to uppercase
        String combine = (firstWord + secondWord).toUpperCase();

        int vowels = 0;
        int consonants = 0;

        Set<Character> vowelSet = new LinkedHashSet<>();
        Set<Character> consonantSet = new LinkedHashSet<>();

        for (int i = 0; i < combine.length(); i++) {
            char ch = combine.charAt(i);

            if (ch == 'A' || ch == 'E' || ch == 'I'
                    || ch == 'O' || ch == 'U') {
                vowels++;
                vowelSet.add(ch);
            } else if (Character.isLetter(ch)) {
                consonants++;
                consonantSet.add(ch);
            }
        }

        System.out.println("Combined Word: " + combine);
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);

        if (vowels > consonants) {
            int cnt = 0;
            System.out.print("First 2 Unique vowels: ");

            for (char ch : vowelSet) {
                System.out.print(ch + " ");
                cnt++;
                if (cnt == 2) break;
            }

        } else if (consonants > vowels) {
            int cnt = 0;
            System.out.print("First 2 Unique consonants: ");

            for (char ch : consonantSet) {
                System.out.print(ch + " ");
                cnt++;
                if (cnt == 2) break;
            }

        } else {
            System.out.println("Vowels and consonants are equal");
        }

        sc.close();
    }
}
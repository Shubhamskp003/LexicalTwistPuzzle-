import java.util.*;

/**
 * LexicalTwistPuzzle UC7: Output Based on Vowel–Consonant Count
 * LexicalTwistPuzzle UC8: Fully Modular & OOPS-Compliant Puzzle System
 *
 * Flow
 * ✔ If vowels > consonants → Print first 2 unique vowels
 * ✔ If consonants > vowels → Print first 2 unique consonants
 * ✔ If equal → Vowels and consonants are equal
 *
 * Architecture
 * 1. Inputs collected in main()
 * 2. Business logic handled in LexicalAnalyzer
 * 3. Validation handled in WordValidator
 * 4. Result displayed cleanly
 *
 * @version 8.0
 */

// ================= ANALYZER =================
class LexicalAnalyzer {

    public String analyze(String firstWord, String secondWord) {
        if (isReverse(firstWord, secondWord)) {
            return transformed(firstWord);
        } else {
            return analyzeDistribution(firstWord, secondWord);
        }
    }

    private boolean isReverse(String firstWord, String secondWord) {
        String reversed =
                new StringBuilder(firstWord).reverse().toString().toLowerCase();
        return reversed.equalsIgnoreCase(secondWord);
    }

    private String transformed(String word) {
        String transformed =
                new StringBuilder(word).reverse().toString().toLowerCase();
        return transformed.replaceAll("[aeiou]", "@");
    }

    private String analyzeDistribution(String firstWord, String secondWord) {

        String combine = firstWord.concat(secondWord).toUpperCase();
        int vowels = 0;
        int consonants = 0;

        Set<Character> vowel = new LinkedHashSet<>();
        Set<Character> consonant = new LinkedHashSet<>();

        for (int i = 0; i < combine.length(); i++) {
            char ch = combine.charAt(i);

            if (ch == 'A' || ch == 'E' || ch == 'I'
                    || ch == 'O' || ch == 'U') {
                vowels++;
                vowel.add(ch);
            } else if (Character.isLetter(ch)) {
                consonants++;
                consonant.add(ch);
            }
        }

        if (vowels > consonants) {
            System.out.println("First 2 unique Vowels:");
            return getFirstTwo(vowel);
        } else if (consonants > vowels) {
            System.out.println("First 2 unique Consonants:");
            return getFirstTwo(consonant);
        } else {
            return "Vowels and consonants are equal";
        }
    }

    private String getFirstTwo(Set<Character> set) {
        StringBuilder result = new StringBuilder();
        int cnt = 0;

        for (char ch : set) {
            result.append(ch).append(" ");
            cnt++;
            if (cnt == 2) break;
        }

        return result.toString().trim();
    }
}

// ================= VALIDATOR =================
class WordValidator {

    public boolean isValid(String word) {
        return word != null
                && !word.trim().isEmpty()
                && !word.trim().contains(" ");
    }
}

// ================= MAIN =================
public class LexicalTwistPuzzle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        WordValidator validator = new WordValidator();
        LexicalAnalyzer analyzer = new LexicalAnalyzer();

        System.out.print("Enter the first word: ");
        String firstWord = sc.nextLine();

        System.out.print("Enter the second word: ");
        String secondWord = sc.nextLine();

        if (!validator.isValid(firstWord)
                || !validator.isValid(secondWord)) {
            System.out.println("Invalid input. Only single words allowed.");
            sc.close();
            return;
        }

        String result = analyzer.analyze(firstWord, secondWord);
        System.out.println(result);

        sc.close();
    }
}
import java.util.Scanner;

/**
 * LexicalTwistPuzzle UC2: Accept Word Inputs
 * LexicalTwistPuzzle UC3: Validate Single Word Constraint
 *
 * This class Accept two words from the user for puzzle processing..
 * This class Ensure that each input contains only one word.
 *
 * @Developer
 * @version 2.0
 * @version 3.0
 * */


@@ -17,9 +17,21 @@ public static void main(String[] args) {
        System.out.print("Enter the first word: ");
        String firstWord = sc.nextLine();

        if(firstWord.trim().contains(" ")){
        System.out.println(firstWord + " is not valid word.");
        return;
        }

        System.out.print("Enter the second word: ");
        String secondWord = sc.nextLine();

        if(secondWord.trim().contains(" ")){
        System.out.println(secondWord + " is not valid word.");
        return;
        }

        System.out.println("Valid word: " + firstWord + " " + secondWord);

        sc.close();
        }
        }
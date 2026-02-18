import java.util.Scanner;

/**
 * LexicalTwistPuzzle UC1: Display Puzzle Title
 * LexicalTwistPuzzle UC2: Accept Word Inputs
 *
 * This class Display a static message indicating the purpose of the application.
 * This class Accept two words from the user for puzzle processing..
 *
 * @Developer
 * @version 1.0
 * @version 2.0
 * */


public class LexicalTwistPuzzle {
    public static void main(String[] args) {
        System.out.println("Lexical Twist Puzzle");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first word: ");
        String firstWord = sc.nextLine();

        System.out.print("Enter the second word: ");
        String secondWord = sc.nextLine();

        sc.close();
    }
}
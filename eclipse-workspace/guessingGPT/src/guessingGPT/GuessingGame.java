package guessingGPT;

import java.util.Scanner;
//this one was perfectly made by chat gpt.
public class GuessingGame {
    public static void main(String[] args) {
        String wordToGuess = "JAVAJ";
        int attempts = 6;
        StringBuilder guessedWord = new StringBuilder("____"); // Initialize with underscores
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Java Guessing Game!");
        System.out.println("Try to guess the word by entering one letter at a time.");
        System.out.println("You have " + attempts + " attempts.");

        while (attempts > 0 && !wordToGuess.equals(guessedWord.toString())) {
            System.out.println("Word: " + guessedWord.toString());
            System.out.print("Enter a letter: ");
            char guess = scanner.nextLine().toUpperCase().charAt(0);

            boolean found = false;
            for (int i = 0; i < wordToGuess.length(); i++) {
                if (wordToGuess.charAt(i) == guess) {
                    guessedWord.setCharAt(i, guess);
                    found = true;
                }
            }

            if (!found) {
                attempts--;
                System.out.println("Incorrect guess. You have " + attempts + " attempts remaining.");
            }
        }

        if (wordToGuess.equals(guessedWord.toString())) {
            System.out.println("Congratulations! You guessed the word: " + wordToGuess);
        } else {
            System.out.println("Sorry, you're out of attempts. The word was: " + wordToGuess);
        }

        scanner.close();
    }
}


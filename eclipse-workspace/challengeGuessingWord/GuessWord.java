package challengeGuessingWord;

import java.util.Scanner;
import java.util.List; 
import java.util.ArrayList;
import java.util.Arrays;

public class GuessWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner(System.in);
		String word = "SAMPSON";
		int count = 0;
		String guess;
		int i = 0;
		
		List<Character> alphabetList = new ArrayList<>();

        // Populate the list with alphabet letters
        for (char letter = 'A'; letter <= 'Z'; letter++) {
            alphabetList.add(letter);
        }
        
        System.out.println(alphabetList);	
        
		do {
		
		System.out.println("Guess the word or the letters: ");
		guess = userInput.nextLine().toUpperCase();
		i = word.compareTo(guess);
		String target = guess;
		
		if (i==0) {
			System.out.println("You got the word right!");
			break;
		} else {
				if (word.contains(guess)){
					System.out.println("This letter exist in this word, keep going!.");
				} else {
					System.out.println("Sorry, this word does not exist on this word :(");
					
				}
			}
		} while (word != guess);
		
	}

}

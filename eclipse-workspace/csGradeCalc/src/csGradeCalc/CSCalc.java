package csGradeCalc;
import java.util.Scanner;
public class CSCalc {

	//Program By: Leonardo Bezerra Correia da Silva. Go Hatters!
	
	
	public static void main(String[] args) {
		//declaring the scanner for the grades:
		Scanner userInput = new Scanner(System.in);
		
		//variable list:
		int nofgrades;
		int grades = 0;
		float sum = 0.0f;
		float result;
		
		
		//doing the text that the user will see to input:
		System.out.println("Welcome to the CS Grade Calculator!");
		
		do { 
		System.out.println("How many grades would you like to enter (10 max): ");
		nofgrades = userInput.nextInt();
		} while (nofgrades > 10 || nofgrades < 0);
		
		//Validation for user input:
		
		do {
			

			//building the loop that will allow the user to enter the grade and add the sum to the average:
			for (int i = 0; i < nofgrades; i++ ){
				System.out.printf("\nEnter Grade Number %d: ", i+1);
				grades = userInput.nextInt();
		
				if (grades < 0 || grades > 100) {
					System.out.println("One of the grades you entered was invalid. Try again.");
					break;
				}
				
				sum += grades;	
			}
			

			
		} while (grades < 0 || grades > 100);
		
		
		//After building up the loop of notes, the sum have "charged" all grades. Now, time for the average.
		result = (float) sum / nofgrades;
		
		System.out.printf("\nThe average of the %d grades you typed is: %.2f", nofgrades, result);
	}

}

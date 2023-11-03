package guessthenumber;
import java.util.Random;
import java.util.Scanner;

public class GuessdNumber {
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner guess = new Scanner(System.in);
		int maximum = 11;
		int num = 0;
		int count = 0;
		int number = rand.nextInt(maximum);
		
		System.out.println("+=== Can you guess the number? ===+");
		while ( num != number) {
			System.out.println("Input your guess here (from 1 to 10):  ");
			num = guess.nextInt();
		
		
		
		
				if (num > number) {
					System.out.println("Too high! Try again!");
				} else if (num < number) {
					System.out.println("Too Low! Try Again!");
				}
				count++;
			}
		System.out.println("\nCongratulations! You won!");
		System.out.printf("\nIt took you %d attempts.", count);
		
		System.out.println("\n Program by: Leonardo Bezerra Correia da Silva.");
		System.out.println("GO HATTERS!");
	}
}

package scannertesting;
import java.util.Scanner;

public class Scannertest {
	public static void main(String[] args) {
		//Declaring variables:
		String name;
		int age;
		double shoeSize;
		//in order to create a scanner:
		Scanner userInput = new Scanner(System.in);
		//Scanner userInput2 = new Scanner(System.in);
		
		//Regular print Line:
		System.out.println("Welcome to the Online Vans Store!");
		System.out.println("Please enter your name: ");
		name = userInput.nextLine();
		
		
		//age input
		System.out.println("Please enter your age: ");
		age = userInput.nextInt();
		
		
		//shoe size input
		System.out.println("Please enter your shoe size: ");
		shoeSize = userInput.nextDouble();
		
		
		System.out.printf("Thank you, %s. Your age is %d, and your shoe size is %.2f", name, age, shoeSize);
		System.out.println("See ya!");
	}
}

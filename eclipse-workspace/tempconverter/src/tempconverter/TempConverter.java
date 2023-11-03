package tempconverter;

import java.util.Scanner;

public class TempConverter {
	public static void main(String[] args) {
		
		//Declaring variables:
		double celsius;
		double fahrenheit;
		int answer;
		
		//Setting the scanner on
		Scanner inputTemp = new Scanner(System.in);
		
		//Deciding which operation the user wants:
		System.out.println("Which Operation do you want? \n 0 For Celsius to Fahrenheit \n 1 For Fahrenheit to Celsius \n Your Answer:  ");
		answer = inputTemp.nextInt();
		
		//Using the if-else to separate the different parts of the code
		if(answer == 0) {
			System.out.println("Your answer was Celsius to Fahrenheit!");
			
			//Taking the user information
			System.out.println("Enter the temperature in °C: "); 
			
			//Scanning and calculating the information 
			celsius = inputTemp.nextFloat(); 
			fahrenheit = (celsius*1.8)+32;
			
			//Result:
			System.out.printf("%.2f°C is %.2f°F", celsius, fahrenheit);
			
		} else {
			//Doing the same as above, but for the opposite conversion:
			//Taking the user information
			System.out.println("Your answer was Fahrenheit to Celsius!");
			System.out.println("Enter the temperature in °F: "); 
			
			//Scanning and calculating the information 
			fahrenheit = inputTemp.nextFloat(); 
			celsius = (fahrenheit - 32)/1.8;
			
			//Result:
			System.out.printf("%.2f°C is %.2f°F \n", fahrenheit, celsius);
		}
		//bye bye
		System.out.println("Program made by: Leonardo Bezerra Correia da Silva.");
		System.out.println("Student ID: 800790818");
		System.out.println("Go Hatters!");
		System.out.println("See ya!");
	
	}
}

package dbaclassactivity;
import java.util.Scanner;

class dbaclass {
	public static void main(String[] args) {
		
		double dba;
		
		Scanner userDBA = new Scanner(System.in);
		
		System.out.println("Welcome to the DBA Calculator!");
		System.out.println("Insert your DBA here: ");
		dba = userDBA.nextFloat();
		
		if (dba >= 90) {
			System.out.println("Congratulations, you passed!");
		} else {
			System.out.println("Oh, you failed :D Shame on you hehe!");
		}
	}
}

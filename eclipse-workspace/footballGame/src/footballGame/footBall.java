package footballGame;

import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class footBall {
	
	
	//had to make private static variables, so they are stored outside the function
	//this allows the loop on Quarters(); to work :)
	private static String teamA;
	private static String teamB;
	private static int totalA;
	private static int totalB;
	
	public footBall(String teamA, String teamB) {
		//Information about each team.
		System.out.printf("\nThese are the teams: %s, %s \n", teamA, teamB);
		this.teamA = teamA;
		this.teamB = teamB;
		this.totalA = 0;
		this.totalB = 0;
	}
	
	public static void Quarters(int quarters) {
		//quarter score
		int teamAq = 0;
		int teamBq = 0;
		
		//creating the random piece that will make the random stuff
		Random random = new Random();
		int[] possibleScores = {6, 3, 2, 1}; //Only amount of scores available
		
		//randomizing  the scores
		teamAq = possibleScores[random.nextInt(possibleScores.length)];
		teamBq = possibleScores[random.nextInt(possibleScores.length)];
		
		totalA += teamAq;
		totalB += teamBq;
		//display result
		System.out.printf("\n%s Scored %d points this quarter.\n", teamA, totalA);
		System.out.printf("\n%s Scored %d points this quarter.\n", teamB, totalB);
		
		//comparing scores for each quarter:
		if (totalA > totalB) {
			System.out.printf("\n%s is wining by %d points!\n", teamA, totalA-totalB);
		} else if (totalB > totalA) {
			System.out.printf("\n%s is wining by %d points!\n", teamB, totalB-totalA);
		} else {
			System.out.println("\nBoth teams have the same score on this quarter!\n");
		}
		
	}
	
	public static void Results() {
		
		System.out.printf("\nTotal points for %s: %d\n", teamA, totalA);
		System.out.printf("\nTotal points for %s: %d\n", teamB, totalB);

		
		if (totalA > totalB) {
			System.out.printf("\n%s won! with a %d point difference!", teamA, totalA-totalB);
		} else if (totalA < totalB) {
			System.out.printf("\n%s won! with a %d point difference!", teamB, totalB-totalA);
		} else {
			System.out.println("It's a tie! Both teams scored equal!\n");
		}
		
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		//adding possibility to repeat the program:
		
		int quit = 0;
		while(quit  != 1) {
			
			Scanner userInput = new Scanner(System.in);
			//Executable part, this is the main section of the program:
			System.out.println("----------------------------------");
			System.out.println("Welcome to the Football Simuation!");
			
			System.out.println("Type the teams you want to simulate:");
			System.out.println("Team A: ");
			String teamA = userInput.nextLine();
			System.out.println("Team B: ");
			String teamB = userInput.nextLine();
			
			footBall game = new footBall(teamA,teamB);
			
			System.out.println("\nHow many quarters would you like to simulate? ");
			int quarters = userInput.nextInt();
			
			
			//Changing the loop position to positioning it at the end:
			for (int i = 0; i < quarters; i++) {
				System.out.println("----------------------------------");
				System.out.printf("\nQuarter: %d\n", i+1);
				Quarters(quarters);
				TimeUnit.SECONDS.sleep(3);
			}
			System.out.println("----------------------------------");
			Results();
			System.out.println("\n----------------------------------");
			System.out.println("Want to continue simulating?");
			System.out.println("[0] To Continue\n[1] To Leave");
			quit = userInput.nextInt();				
		}
		System.out.println("Bye!");
		}	
}

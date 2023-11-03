package todolist;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


//Program by Leonardo Bezerra Correia da Silva
// 18/10 update - I have included the file writer as we saw on class!

public class Todolist {

	public static void main(String[] args) {
		//Initiating the user input scanner to add or remove tasks.
		Scanner taskChoice = new Scanner(System.in);
		
		//Initiating the task list that will be displayed and worked with:
		ArrayList<String> tasks = new ArrayList<>();
		
		//initiaing variables;
		int choice;
		int i = 0;
		int quit = 1;
		//building the main interface of the program:
		System.out.println("------------------------------------");
		System.out.println("| Welcome to your Java To-Do List! |");
		System.out.println("------------------------------------");
		
		//Conditional Statements and input validation that lead to each different operation on this program.
		while (quit != 0) {
			do {
				//add replace here later!
				System.out.println("\n------------------------------------\n");
				System.out.print("Choose your operation:\n [1] Add a Task\n [2] Remove a Task\n [0] Quit ToDo List\n Your choice:\n ");
				choice = taskChoice.nextInt();
				
				if (choice == 1) {
					System.out.println("\n------------------------------------\n");
					System.out.println("You chose to add a task.");
					
					//Creating a question to enter the loop, so that the user will be able to simultaneosly enter their tasks. 
					System.out.println("How many tasks would you like to add: ");
					int lim = taskChoice.nextInt();
					taskChoice.nextLine();
				
					for (i = 0; i < lim; i++ ) {
						System.out.println("What tasks would you like to add: ");
						String adding = taskChoice.nextLine();
						tasks.add(adding);
						
					}
					
				} else if (choice == 2) {
					//process of removing the task
					System.out.println("\n------------------------------------\n");
					System.out.println("You chose to remove a task.");
					System.out.println("\n------------------------------------\n");
					System.out.println("This is your Task List:");
					for (String str : tasks) {
						System.out.println( "[ ]" + str);
					}
					System.out.println("\n------------------------------------\n");
					System.out.println("How many tasks would you like to remove (press 999 to clear the list): ");
					int lim = taskChoice.nextInt();
					taskChoice.nextLine();
					
					if (lim == 999) {
						System.out.println("Your list is now clean!");
						tasks.clear();
					} else {
						for (i = 0; i < lim; i++ ) {
							System.out.println("What tasks would you like to remove: ");
							String removing = taskChoice.nextLine();
							tasks.remove(removing);
							
						}
					}
				
				
					
				} else if (choice == 0) {
					System.out.println("\n------------------------------------\n");
					System.out.println("\nYou chose to quit. Goodbye!");
					//ending loop, program finished
					break;
				} else {
					System.out.println("\n------------------------------------\n");
					System.out.println("ERROR: Please, enter a valid operation!");
				}
				
			} while (choice != 1 && choice != 2);
			
			//Output, the final task list:
			System.out.println("\n------------------------------------\n");
			System.out.println("This is your Task List. This list you be print on your output file:");
			for (String str : tasks) {
				System.out.println( "[ ]" + str);
			}
			System.out.println("\n------------------------------------\n");
			System.out.println("Do you wish to leave? \n [0] Yes\n [1] No \nYour Answer: ");
			quit = taskChoice.nextInt();
		}
		System.out.println("See, ya! Go Hatters!");
		
		try {
			BufferedWriter list = new BufferedWriter(new FileWriter("C:\\Users\\Leo\\Desktop\\TodoList.txt"));
			list.write("Your List: ");
			for (String item : tasks) {
				list.write("\n[] " + item);
			}
			list.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		}
	
	}

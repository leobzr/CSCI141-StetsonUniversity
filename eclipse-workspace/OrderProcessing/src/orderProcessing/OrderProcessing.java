package orderProcessing;

import java.util.concurrent.TimeUnit;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class OrderProcessing {
	static Scanner input = new Scanner(System.in);
	static Map<String, Integer> inventory = new TreeMap<>();
	static Map<String, String> orders = new TreeMap<>();
	//Directions for this program:
	//This program should simulate an ecommerce application
	//It should allow users to place orders, manage inventory and generate order details
	//By managing inventory, it means add/deleting items, and adding deleting quantities of items
	
	//The basic:
	//1. Create the main section and the methods that will compose this program
	//(probably 2 3 methods for each operation
	//2. Build the structure of the application, this will be similar to the to-do list code
	//3. Bonus, it would be cool to have this running on a GUI instead of the console. GO FOR IT!
			
	public static void main(String[] args) throws InterruptedException {
		//Main will enter the basics of this program.
		//This will be similar to the To-do List program
		
		//The main will probably store the Inventory, which I think would be great with a hashmap
		//considering that I can do the put if absent method to add an item that is/is not already on the inventory.
		
		
		//Declare, initialize and build the loop that will make the application run "forever"
		int choice; //to be easier, I am numerating the operations. It will be better to deal with them on the loop
		//0. Quit 1. Place Order 2.Add Item 3.Remove Item. 4.View Order Details 
		
		int i = 0;
		int quit = 1;
		
		System.out.println("---------------------------------------");
		System.out.println("| Welcome to your Java Order Manager! |");
		System.out.println("---------------------------------------");
		
		while (quit != 0) {
			do {
				System.out.println("Chose your Operation:\n[1]Place an Order\n[2]Add an Item to the Inventory\n[3]Remove an Item from the Inventory\n[4]View/Edit Orders\n[0]Quit Application\n->");
				choice = input.nextInt();
				
				if (choice == 1) {
					//place order
					System.out.println("You chose to place an order: ");
					PlaceOrder();
					
				} else if (choice == 2) {
					// Add Item
					System.out.println("You chose to add an item to the inventory:");
					addItem();
					
				} else if (choice == 3) {
					//Remove Item
					System.out.println("You chose to remove an item to the inventory:");
					removeItem();
					
				} else if (choice == 4) {
					//View Order details
					System.out.println("You chose to view the order details: ");
					orderDetails();
					
				} else if (choice == 0) {
					//Quit program
					System.out.println("You chose to quit the program.");
					quit = 0;
					break;
				} else {
					System.out.println("ERROR: Please enter a valid operation.");
				}
				
			} while (choice != 1 && choice != 2 && choice != 3 && choice != 4); //they will be initialized once I do the function options for the user
		}
		
	}
	
	//I will be initializing all of them without parameters
	//and void, just to know what I am doing :p
	
	//----------------------------------------------------------------------------------------------------------------------------------------------------
	
	//METHOD DONE - OPEN TO ENHANCEMENT
	
	public static void PlaceOrder() throws InterruptedException {
		int done = 1;
		//Method to place orders
		//After each operation, it automatically goes back to the operator selector.
		do {
			System.out.println("How many orders would you like to place? \n-> ");
			int lim = input.nextInt();
			input.nextLine();
				for (int i = 0; i < lim; i++) {
					System.out.println("\nAdd the order name: ");
					String name = input.nextLine();
					System.out.println("\nAdd any details (Press Enter if none): ");
					String detail = input.nextLine();
					orders.put(name, detail);
					if (detail.equals("")) {
						System.out.printf("\nThe order number %d is: %s. There is no additional details.", i+1, name);
					} else {
						System.out.printf("\nThe order number %d is: %s. The details for this order is: %s", i+1, name, detail);
					}
				}
			System.out.println("\nAre you done? \n[0] Yes \n[1] No \n-> ");
			done = input.nextInt();
		} while (done != 0);
		
		System.out.println("This is your order list now: "); //iterate this map, so it appears with more detail.
		
		
		//I need to find a way to take this same list and structure to the orderDetails method.
		for (Map.Entry<String, String> orderlist : orders.entrySet()) {
			String key  = orderlist.getKey();
			String value = orderlist.getValue();
			
			if (value.equals("")) {
				System.out.printf("\nOrder: %s", key);
				System.out.printf("\nThere are not details for this order.\n");
				System.out.println("\n----------------------------------");
			} else {
				System.out.printf("\nOrder: %s", key);
				System.out.printf("\nDetails: %s", value);
			}
		}
		System.out.println("\n--Going back to the operator selector--");
		TimeUnit.SECONDS.sleep(3);
	}
	
	//---------------------------------------------------------------------------------------------------------------------------------------------------
	
	public static void addItem() throws InterruptedException {
		//Method to add items to the inventory
		int done = 1;
		//After each operation, it automatically goes back to the operator selector.
		do {
			System.out.println("How many different items would you like to add? \n-> ");
			int lim = input.nextInt();
			input.nextLine();
				for (int i = 0; i < lim; i++) {
										
					System.out.println("\nAdd the item name: ");
					String name = input.nextLine();
					System.out.println("\nHow many of these are available? \n-> ");
					int quantity = input.nextInt();
					input.nextLine();
					inventory.put(name, quantity);
					
					//unlike the first function, there is no option. Or there is at least one item, or it would not even be added.
					
					System.out.printf("\nThe item %d is: %s. There are %d units of it.", i+1, name, quantity);
				}
			System.out.println("\nAre you done? \n[0] Yes \n[1] No \n-> ");
			done = input.nextInt();
		} while (done != 0);
		
		System.out.println("This is your inventory now: "); //iterate this map, so it appears with more detail.
		
		//I need to find a way to take this same list and structure to the orderDetails method.
		for (Map.Entry<String, Integer> iteratInventory : inventory.entrySet()) {
			String key  = iteratInventory.getKey();
			int value = iteratInventory.getValue();
	
			System.out.printf("\nITEM: %s", key);
			System.out.printf("\nQUANTITY: %d", value);
			System.out.println("\n---------------------");
		}
		System.out.println("\n--Going back to the operator selector--");
		TimeUnit.SECONDS.sleep(3);
		
	}
	
	//---------------------------------------------------------------------------------------------------------------------------------------------------
	
	public static void removeItem() throws InterruptedException {
		//Method to add items to the inventory
		
		//I need to think about how to change the values of the items that are not completely deleted. Probably using nested ifs to "reduce" the value
		//of the quantities that will be remaining on the inventory.
				int done = 1;
				//After each operation, it automatically goes back to the operator selector.
				do {
					//Showing the inventory first, to give them a view of what is in it
					System.out.println("This is your current inventory: ");
					for (Map.Entry<String, Integer> iteratInventory : inventory.entrySet()) {
						String key  = iteratInventory.getKey();
						int value = iteratInventory.getValue();
				
						System.out.printf("\nITEM: %s", key);
						System.out.printf("\nQUANTITY: %d", value);
						System.out.println("\n---------------------");
					}
					
					System.out.println("How many different items would you like to remove? \n-> ");
					int lim = input.nextInt();
					input.nextLine();
						for (int i = 0; i < lim; i++) {
														
							System.out.println("\nType the item name: ");
							String name = input.nextLine();
							System.out.println("\nHow many of it you want to remove? \n-> ");
							int quantity = input.nextInt();
							input.nextLine();
							inventory.remove(name, quantity); //it is not just like that - Think about this later
							
							//unlike the first function, there is no option. Or there is at least one item, or it would not even be added.
							
							System.out.printf("\nThe item %s was removed. There are %d units of it left.", i+1, name, quantity);
						}
					System.out.println("\nAre you done? \n[0] Yes \n[1] No \n-> ");
					done = input.nextInt();
				} while (done != 0);
				
				System.out.println("This is your inventory now: "); //iterate this map, so it appears with more detail.
				
				//I need to find a way to take this same list and structure to the orderDetails method.
				for (Map.Entry<String, Integer> iteratInventory : inventory.entrySet()) {
					String key  = iteratInventory.getKey();
					int value = iteratInventory.getValue();
			
					System.out.printf("\nITEM: %s", key);
					System.out.printf("\nQUANTITY: %d", value);
					System.out.println("\n---------------------");
				}
				System.out.println("\n--Going back to the operator selector--");
				TimeUnit.SECONDS.sleep(3);
	}
	
	//---------------------------------------------------------------------------------------------------------------------------------------------------
	
	public static void orderDetails() throws InterruptedException{
		//This is a method to just show what orders are pending and their details
		//I will also add an option to remove an order here, I forgot about that :p
		//This method will check the orders placed on the placeorder method and return any details of it
		TimeUnit.SECONDS.sleep(3);
		System.out.println("---Displaying Orders and Details---");
		//do the same that I did on the remove method
	}

}

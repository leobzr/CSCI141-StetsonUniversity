package orderProcessing;

import java.util.LinkedList;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;

//This is the same code but with no comments, if you prefer that way ;)

public class OPnocomments {
	static Scanner input = new Scanner(System.in);
	static Map<String, Integer> inventory = new TreeMap<>();
	static Map<String, String> orders = new TreeMap<>();
	
	public static void main(String[] args) throws InterruptedException {
		int choice; 
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

	public static void PlaceOrder() throws InterruptedException {
		int done = 1;
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
		
		System.out.println("This is your order list now: ");
		
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
	
	public static void addItem() throws InterruptedException {
		int done = 1;
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
									
					System.out.printf("\nThe item %d is: %s. There are %d units of it.", i+1, name, quantity);
				}
			System.out.println("\nAre you done? \n[0] Yes \n[1] No \n-> ");
			done = input.nextInt();
		} while (done != 0);
		System.out.println("This is your inventory now: "); 		
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
		
	public static void removeItem() throws InterruptedException {
				int done = 1;
				do {
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
				            int remove = input.nextInt();
				            input.nextLine();
				            
				            if (inventory.containsKey(name)) {
				                int currentQuantity = inventory.get(name);
				                
				                if (remove <= currentQuantity) {
				                    inventory.put(name, currentQuantity - remove);

				                    System.out.printf("\nThe item %s was removed. There are %d units of it left.", name, currentQuantity - remove);
				                } else {
				                    System.out.printf("\nNot enough quantity of %s to remove. Current quantity: %d", name, currentQuantity);
				                }
				            } else {
				                System.out.printf("\nThe item %s is not in the inventory.", name);
				            }
						}
					System.out.println("\nAre you done? \n[0] Yes \n[1] No \n-> ");
					done = input.nextInt();
				} while (done != 0);
				
				System.out.println("This is your inventory now: "); 				
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
		
	public static void orderDetails() throws InterruptedException{
		Queue<String> orderq = new LinkedList<>();
		Queue<String> orderq2 = new LinkedList<>(); 
		Map<String, Integer> numOrder = new TreeMap<>();
		TimeUnit.SECONDS.sleep(3);
		System.out.println("---Displaying Orders and Details---");
		int count = 0;
		System.out.println("The current Order Queue is: ");
		for (Map.Entry<String, String> orderlist : orders.entrySet()) {
			String key  = orderlist.getKey();
			String value = orderlist.getValue();
			
			if (value.equals("")) {
				orderq.add(key + " | Details: This order has no details.");
				orderq2.add(key + " | Details: This order has no details.");
			} else {
				orderq.add(key + " | Details: " + value);
				orderq2.add(key + " | Details: " + value);
			}	
			String inOrder = orderq2.remove();
			count++;
			numOrder.put(key, count);
			System.out.println(count +"- " + inOrder);
		}

	    System.out.println("Would you like to remove an order? \n[0]Yes.\n[1]No. ");
	    int choice = input.nextInt();
	    if (choice == 0) {
	        int done = 1;
	        do {
	            System.out.println("How many different orders would you like to remove? (999 to clear) \n-> ");
	            int lim = input.nextInt();
	            input.nextLine();
	            if (lim == 999) {
	                numOrder.clear();
	                System.out.println("The order list was cleared.");
	            } else {
	                System.out.println("Your Ordered List is: ");
	                for (Map.Entry<String, Integer> entry : numOrder.entrySet()) {
	                    System.out.printf("[%d] %s%n", entry.getValue(), entry.getKey());
	                }

	                for (int i = 0; i < lim; i++) {
	                    System.out.println("\nType the order number: ");
	                    int remove = input.nextInt();
	                    input.nextLine();

	                    if (numOrder.containsValue(remove)) {
	                        String removedOrder = getOrderKeyByValue(numOrder, remove);
	                        System.out.println("Order " + remove + " (" + removedOrder + ") was removed.");
	                        numOrder.remove(removedOrder);
	                    } else {
	                        System.out.printf("\nThe order number %d is not in the order list.", remove);
	                    }
	                }
	            }

	            System.out.println("\nAre you done? \n[0] Yes \n[1] No \n-> ");
	            done = input.nextInt();
	        } while (done != 0);

	        System.out.println("This is your Order List now: ");
	        for (Map.Entry<String, Integer> iterateOL : numOrder.entrySet()) {
	            String key = iterateOL.getKey();
	            int value = iterateOL.getValue();
	            System.out.printf("\n%d. %s", value-1, key);
	            System.out.println("\n-");
	        }
	        System.out.println("\n--Going back to the operator selector--");
	        TimeUnit.SECONDS.sleep(3);
	    }
	}
		private static <K, V> K getOrderKeyByValue(Map<K, V> map, V value) {
		    for (Map.Entry<K, V> entry : map.entrySet()) {
		        if (Objects.equals(value, entry.getValue())) {
		            return entry.getKey();
		        }
		    }
		    return null;
		}
}

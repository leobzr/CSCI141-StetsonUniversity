package HashMaps.Java;
import java.util.ArrayList;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class HashMapsExercise {
	
	//Word Frequency Counter

	public static void main(String[] args) {
		//Initializing the tools:
		Scanner userInput = new Scanner(System.in);
		//Map<String, Integer> wordmap = new HashMap<>();
		//Using tree map because of the case sensitive and natural sorting
		
		
		//TASKS:
		//1. Read a block of text from a user input
		//Bonus: Giving the user the choice to give a file path or to just type something to the console!
		System.out.println("Analyzing word frequency using hashmaps!");
		
		System.out.println("[0]Type a sentence\n[1]Give a File Path\nWhat would you like to do:");
		int choice = userInput.nextInt();
		String jump = userInput.nextLine(); // I never know why, but in cases like loops of senteces i have to include this jump.
		//this happened on the guess the word game
		if (choice==0) {
			
			TreeMap<String, Integer> inmap = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
			System.out.println("Type a sentence here: ");
			String sentence = userInput.nextLine();
				
			
			
			//2. Split the text into words (use split function)
			//For this, I am going to create a list first, that will them separate each word and put them into the hashmap later!
			String[] words = sentence.split("[ ,!]+"); //ignore comma, exclamation and spaces
			for (String word : words) {
				//Making it case insensitive by making it all uppercase:
				word.toLowerCase();
				
				//this will get the current count for the word, or 0 if it is not yet in the map
				int count = inmap.getOrDefault(word, 0);
				
				//Increment the count for the word and put it back into the map
				//3. Use a HashMap to map each word to its frequency count
				inmap.put(word, count+1);
				//that is the right way to increase the value or key, if you are working with numbers!
				
				
				//all this big list right here, have all common stop words, and the loop at the end take each stop word into account
				//if it is in the sentence the user types, it is going to be removed from the treemap.
				
				String[] StopWords = {"a", "about", "above", "after", "again", "against", "all", "am", "an", "and",
			            "any", "are", "as", "at", "be", "because", "been", "before", "being", "below",
			            "between", "both", "but", "by", "could", "did", "do", "does", "doing", "don't",
			            "down", "during", "each", "few", "for", "from", "further", "had", "has", "have",
			            "having", "he", "her", "here", "hers", "herself", "him", "himself", "his", "how",
			            "i", "if", "in", "into", "is", "it", "its", "itself", "just", "me", "more", "most",
			            "my", "myself", "no", "nor", "not", "now", "of", "off", "on", "once", "only", "or",
			            "other", "our", "ours", "ourselves", "out", "over", "own", "s", "same", "she", "should",
			            "so", "some", "such", "t", "than", "that", "the", "their", "theirs", "them", "themselves",
			            "then", "there", "these", "they", "this", "those", "through", "to", "too", "under", "until",
			            "up", "very", "was", "we", "were", "what", "when", "where", "which", "while", "who", "whom",
			            "why", "with", "would", "you", "your", "yours", "yourself", "yourselves"};
				
				for (String stopword : StopWords) {
					if (inmap.containsKey(stopword)) {
						inmap.remove(stopword);
					}
				}
				
				
			}
			
			//ordering the hashmap by values:
			List<Entry<String, Integer>> entryList = new ArrayList<>(inmap.entrySet());
			
			//Sorting the list by values
			Collections.sort(entryList, (entry1, entry2) -> entry1.getValue().compareTo(entry2.getValue()));
			
			//Now let's print the word counts:
			//4. Iterate through the words, updating the frequency count in the hashmap for each occurence
			for (Entry<String, Integer> entry : entryList) {
				//5. Print out each word along with its frequency.
				System.out.println(entry.getKey()+ ": " + entry.getValue());
			}

		} else if (choice == 1) {
		
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter the path to the file: ");
		        String filePath = scanner.nextLine();
		        scanner.close();

		        HashMap<String, Integer> wordMap = new HashMap<>();

		        try {
		        	BufferedReader reader = Files.newBufferedReader(Paths.get(filePath), StandardCharsets.UTF_8);
		            String line;
		            while ((line = reader.readLine()) != null) {
		            	String[] words = line.split("[^\\p{L}\\p{Nd}]+");
		            	line = line.replaceAll("[^\\p{Print}]", "");
		                for (String word : words) {
		                    if (!word.isEmpty()) {
		                        word = word.toLowerCase();
		                        wordMap.put(word, wordMap.getOrDefault(word, 0) + 1);
		                    }
		                }
		            }
		            reader.close();
		        } catch (FileNotFoundException e) {
		            System.out.println("The file was not found: " + e.getMessage());
		        } catch (IOException e) {
		            System.out.println("An error occurred while reading the file: " + e.getMessage());
		        }

		        // Optional: Sort and display the results
		        // ...

		        // Print the word counts
		        for (Map.Entry<String, Integer> entry : wordMap.entrySet()) {
		            System.out.println(entry.getKey() + ": " + entry.getValue());
		        }
		    } else {
				System.out.println("Error: Type a right number for proceeding.");
		    }

		}	
}

		
	
	
		//Bonus Challenges:

			//Filter out common punctuation from words. DONE
			//Implement sorting of the words by frequency. DONE
			//Allow the program to take input from a file specified by the user.
			//Add functionality to ignore common stopwords (like "the", "is", "in", etc.). DONE
			//Make the word counter case-insensitive. DONE
		
		//The list is a little big, so it will be added at the end.
		//Addint the common stopwords list:

		
		
		
		
	



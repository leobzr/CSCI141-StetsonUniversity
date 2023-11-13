package BuffsExercises.java;
import java.io.*;
import java.util.*;

public class exerciseBuffs { //this program copies the text from a file and paste on another with "caps" on

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String source, destination;
		
		System.out.println("Provide the Source path: ");
		source = input.nextLine();
		System.out.println("Provide the Destiny path path: ");
		destination = input.nextLine();
		
		input.close();
		
		try (
			BufferedReader reader = new BufferedReader(new FileReader(source));
			BufferedWriter writer = new BufferedWriter(new FileWriter(destination));
		
		) {
			String line;
			//this while indicates: while it is not null, that is, while there is something to read.
			while ((line = reader.readLine()) != null) {
				//covert line to uppercase:
				String Upper = line.toUpperCase();
				
				//Write to destination file
				writer.write(Upper);
				writer.newLine();//Adding a new line after each line
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}

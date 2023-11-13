package BuffsExercises.java;
import java.io.*;

public class BuffsExercises {

	 public static void main(String[] args) {
	        File inputFile = new File("input.txt");
	        File outputFile = new File("output.txt");

	        try (
	            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
	            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))
	        ) {
	            String line;
	            while ((line = reader.readLine()) != null) {
	                writer.write(line);
	                writer.newLine(); // Adds a new line, platform-independent
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
}

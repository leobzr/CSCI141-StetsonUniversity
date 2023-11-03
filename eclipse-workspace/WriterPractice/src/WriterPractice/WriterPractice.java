package WriterPractice;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WriterPractice {

    public static void main(String[] args) {
        String[] names = {"Bob", "Steve", "Leo", "Johnson"};

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\Leo\\Desktop\\StetsonFootball.csv"));

            writer.write("Players");

            for (String name : names) {
                writer.write("\n" + name);
            }

            writer.close(); // Close the writer to save the file.

        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Leo\\Desktop\\StetsonFootball.csv"));

            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line); // Print the content of the file.
            }

            reader.close(); // Close the reader.

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

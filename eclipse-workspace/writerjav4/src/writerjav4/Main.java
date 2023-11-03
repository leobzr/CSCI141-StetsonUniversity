package writerjav4;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
	//This is going to write to a text file.
	public static void main(String[] args) {
		
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
			writer.write("Hello World");
			writer.write("\nGO HATTERS");
			
				writer.close();
				
		} catch (IOException e) {
			e.printStackTrace();
		}

	} 

}

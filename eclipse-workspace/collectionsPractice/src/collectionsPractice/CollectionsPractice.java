package collectionsPractice;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class CollectionsPractice {

	public static void main(String[] args) {
		// Java does not understand an array list right of the bat
		// You have to import it
		
		//This of syntax will be rarely used, instead, we will going to use the ones below
		List<String> positions = new ArrayList<>();
		
		//adding elements to the array list:
		positions.add("CB");
		positions.add("ST");
		positions.add("GB");
		positions.add("CU");
		positions.add("BB");
		positions.add("FT");
		positions.add("WB");
		positions.add("NU");
		positions.add("HB");
		positions.add("VT");
		positions.add("AB");
		positions.add("Waterboy");
		
		//manipulating the elements on the Array List:
		positions.add(1, "HH");
		
		positions.remove("Waterboy");
		
		//System.out.println(positions);
		//this is the most used syntax to build array lists:
		
		ArrayList<String> rooms = new ArrayList();
		
		rooms.add("Dungeons");
		rooms.add("Upside Down");
		rooms.add("Suburbs");
		rooms.add("Sewers");
		rooms.add("Old Town");
		rooms.add("New Town");
		rooms.add("Library");
		rooms.add("Police Department");
		rooms.add("Hills");
		rooms.add("Closed Florest");
		
		rooms.add("Marketplace");
		rooms.add("Boiler room");
		
		rooms.add(3, "Elizabeth Hall");
		rooms.remove(2);
		rooms.remove("Old Town");
		//rooms.clear();
	
		System.out.println(rooms);
		
		
		//Linked List examples:
		List<String> animals = new LinkedList<>();
		animals.add("Dog");
		animals.add("Cat");
		animals.add("bird");
		
		List<String> animals2 = new LinkedList<>();
		animals2.addAll(animals);
		
		System.out.println(animals2);
		
		
	}

}

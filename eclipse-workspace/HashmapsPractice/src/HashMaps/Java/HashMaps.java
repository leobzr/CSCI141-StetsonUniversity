package HashMaps.Java;

import java.lang.Iterable;
import java.util.HashMap;
import java.util.Map;

public class HashMaps {

	public static void main(String[] args) {
		
		//creation of a new hashmap
		Map<Integer, String> students = new HashMap<>();
		//This basically gives me a map
		
		//adding students - this is very familiar in how to add things to an array
		students.put(1234, "Leonardo");
		students.put(2345, "Theo");
		students.put(3456, "Lorena");
		
		//Changing a name on the index:
		students.replace(3456, "taisinha");
		
		//put if absent:
		students.putIfAbsent(3445, "Carlos");
		
		//printing all items in the map
		System.out.println(students);
		
		System.out.println(students.get(1234));
		
		MapsPractice();
		Dictionary();
	}
	
	public static void MapsPractice() {
		Map<Integer, String> songs = new HashMap<>();
		
		//adding songs to the song map:
		songs.put(234, "The Summer Jam");
		songs.put(223, "22 Faces");
		songs.put(256, "amEN!");
		songs.put(345, "Divide");
		songs.put(278, "Living Arrows");
		songs.putIfAbsent(567, "Psychosphere");
		
		System.out.println(songs);
	}
	
	public static void Dictionary() {
		Map<String, String> dictionary = new HashMap<>();
		dictionary.put("Apple", "Fruit");
		dictionary.put("Bear", "Animal");
		dictionary.put("Deer", "Animal");
		dictionary.put("Strawberry", "Fruit");
		dictionary.put("Cup", "Object");
		dictionary.put("Monitor", "Object");
		dictionary.put("Pretty", "Adjective");

		System.out.println(dictionary);
		
	}

}

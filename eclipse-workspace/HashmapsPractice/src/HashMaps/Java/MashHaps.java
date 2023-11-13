package HashMaps.Java;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MashHaps {
	//NEVER FORGET PSVM
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("Apple", 10);//This one, adds a key "apple" with value 10
		
		Map<Integer, String> map2 = new HashMap<>();
		map2.put(10, "Apple"); // And this one creates a key 10 with the value "Apple"
		
		map.get("Apple"); //retrieves the value associated with apple: 10
		map2.get(10); //Retrieves the value associated with 10: apple
		
		map.remove("Apple"); //You can use to remove apple and its associated value.
		map2.replace(10, "Orange"); // Replacing function. Now the value from key 10 is orange!
		
		boolean hasKey = map.containsKey("Appple"); //Checks if Apple is a key in map
		boolean hasValue = map2.containsKey("Orange"); //Checks if 10 is a value on map2
		
		int size = map.size();//returns the size of the map
		
		map.putIfAbsent("Apple", 20); //In this case, it will not add. There is already
		map.putIfAbsent("Banana", 5); //This will add a new pair
		
		//Iterations Foreach:
		for (String key: map.keySet()) { //Get the key apple
			//access keys. Usually print each of them.
		}
		
		for (Integer value: map.values()) { //get the value, in this case, 10
			//acess values. Usually print them.
		}
		
		for (Entry<String, Integer> entry : map.entrySet()) { //access the Key-Value Pairs
			//Access KV pairs.
		}
	}
}

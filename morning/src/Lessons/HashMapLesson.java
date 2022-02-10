package Lessons;

import java.util.HashMap;

public class HashMapLesson {
	public static void main(String[] args) {
		// A Map is an object that contains key value pairs
		// It maps each key to a value and doesn't contain duplicate keys
		
		// Syntax: HashMap<key, Value>
		
		// Create a HashMap - need to import
		// If you want to be explicit
		// HashMap<String, String> map1 = new HashMap<String, String>();
		HashMap<String, String> map1 = new HashMap<>(10);
		
		// Adding Key value pairs to our map
		map1.put("Teo", "villain");
		map1.put("Orella", "superhero");
		
		//Print our map
		System.out.println(map1);
		
		// Update our map
		map1.put("Teo", "supervillain");
		
		// Display updates
		System.out.println(map1);
		
		// remove Teo
		map1.remove("Teo");
		
		System.out.println(map1);
		
		// clear the entire hashmap
		map1.clear();
		System.out.println(map1);
	}
	
}

package Lessons;

import java.util.ArrayList;

public class ArrayListLesson {

	public static void main(String[] args) {
		// ArrayList are resizable which is different from built-in array where you can't resize the array
		
		// Creating ArrayList
		// we need to import from java.util
		ArrayList<String> cars = new ArrayList<String>();
		
		// Add item
		cars.add("Toyota");
		cars.add("Honda");
		cars.add("Ford");
		
		// Adding items by index
		cars.add(1, "Lexus");
		
		// Printing our ArrayList
		System.out.println(cars);
		
		// Add two arrays together
		ArrayList<String> cars2 = new ArrayList<>();
		
		cars2.add("BMW");
		cars2.add("Tesla");
		
		ArrayList<String> cars3 = new ArrayList<>();
		cars3.add("Nissan");
		
		cars3.addAll(cars);
		cars3.addAll(cars2);
		
		System.out.println(cars3);
		
		System.out.println(cars2);
		
		//Add arrayLists together
		cars.addAll(cars2);
		
		System.out.println(cars.size());
		
		//Clearing array
		cars3.clear();
		
		System.out.println("Cars3 " + cars3);
		
		// concatenate arrays
		cars.addAll(cars2);
		
		// Cloning array - shallow copy
		ArrayList<String> cars4 = (ArrayList<String>) cars.clone();
		System.out.println(cars4);
	}

}

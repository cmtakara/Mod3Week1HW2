package Lessons;

import java.util.ArrayList;
import java.util.Random;
import java.util.*;

public class HashArrayHW {

	public static void main(String[] args) {
		
		// Creating the ArrayList
		ArrayList<String> subjects = new ArrayList<String>();
		
		subjects.add("Second Grade Math");
		subjects.add("Third Grade Math");
		subjects.add("Pre-Algebra");
		subjects.add("Geometry");
		subjects.add("Algebra I");
		subjects.add("Algebra II");
		
		System.out.println(subjects);

		
		// Write a Java program to copy one array list into another
		// make a new empty array and add all of the same components
		ArrayList<String> newSubjects = new ArrayList<String>();
		newSubjects.addAll(subjects);
		
		System.out.println(newSubjects);
		
		// Write a Java program to extract a portion of an array list
		String str = subjects.get(0);
		System.out.println(str);
		
		// portion is 3rd to 5th items
		ArrayList<String> someSubjects = new ArrayList<String>();
		someSubjects.add(subjects.get(2));
		someSubjects.add(subjects.get(3));
		someSubjects.add(subjects.get(4));
		
		System.out.println(someSubjects);
		
		// use subList
		List<String> someMoreSubjects = new ArrayList<String>();
		
		someMoreSubjects = subjects.subList(2, 5);
		
		System.out.println(someMoreSubjects);

		
		// random number of items and random starting point
		Random rd = new Random();
		// between 1 and length, inclusive
		int numItems = (Math.abs((rd.nextInt()) % subjects.size()) + 1);
		System.out.println(numItems);
		// between 0 and length-numItems
		int maxVal = subjects.size()-numItems;
		int startIndex;
		if (maxVal == 0) {
			startIndex = 0;
		} else {
			startIndex = (Math.abs((rd.nextInt()) % maxVal));
		}
		System.out.println(startIndex);
		List<String> randomMoreSubjects = new ArrayList<String>();
		for (int i = startIndex; i < (startIndex+numItems); i++) {
			randomMoreSubjects.add(subjects.get(i));
		}
		System.out.println("this array is the random subset of subjects");
		System.out.println(randomMoreSubjects);
		
		// swap two items in an arrayList
		// swap first and second items
		// save first element
		str = subjects.get(0);
		// put second element in first position
		subjects.set(0, subjects.get(1));
		// put saved first element in second position
		subjects.set(1, str);
		System.out.println(subjects);
		
		
		// test an array list is empty or not
		List<String> emptyList = new ArrayList<String>();

		if (emptyList.size() != 0) {
			System.out.println("not empty");
		} else {
			System.out.println("empty");
		}
		
		// swap two items in an arrayList
		// swap second item and a specified element
		// specify
		int swap = (Math.abs((rd.nextInt()) % subjects.size()));
		while (swap == 1) {
			swap = (Math.abs((rd.nextInt()) % subjects.size()));
		}
		System.out.println("swap is " + swap);
		// save second element
		str = subjects.get(1);
		// put second element in first position
		subjects.set(1, subjects.get(swap));
		// put saved first element in second position
		subjects.set(swap, str);
		System.out.println(subjects);
		
		// trim the capacity of an array list to the current size
		subjects.trimToSize();
		System.out.println(subjects);
		
		// empty hashset AND print out size if not empty
		HashSet<Integer> testSet = new HashSet();
		testSet.add(1);
		testSet.add(2);
		testSet.add(3);
		testSet.add(4);
		testSet.add(5);
		testSet.add(6);
				
		if (testSet.size() == 0) {
			System.out.println("empty hash set");
		} else {
			System.out.println("non-empty hash set, size is " + testSet.size());
		}
		
		// iterate through all of the elements in a hash set
		// convert the hash set to an array
		Iterator<Integer> iter = testSet.iterator(); 
		ArrayList<Integer> hashToArray = new ArrayList<Integer>();
		
		while(iter.hasNext()) {
			Integer tempInt = iter.next();
			System.out.println(tempInt);
			hashToArray.add(tempInt);
			
			// Don't do this because it moves to the next one each time you call iter.next()		
//			System.out.println(iter.next());
//			hashToArray.add(iter.next());
			
		}
		System.out.println(hashToArray);
		
		//compare two sets and retain elements that are the same on both sides
		HashSet<Integer> compareSet = new HashSet();
		compareSet.add(1);
		compareSet.add(3);
		compareSet.add(5);
		compareSet.add(7);
		compareSet.add(9);
		compareSet.add(11);

		HashSet<Integer> savedSet = new HashSet();

		
		iter = testSet.iterator(); 
		Iterator<Integer> iter2 = compareSet.iterator(); 
		
		while (iter.hasNext()) {
			Integer tempInt = iter.next();
			while(iter2.hasNext()) {
				if (tempInt == iter2.next()) {
					System.out.println(tempInt);
					savedSet.add(tempInt);
					break;
				}
//				System.out.println(tempInt);
			}
			iter2 = compareSet.iterator();
		}
		System.out.println(savedSet);



	}

}

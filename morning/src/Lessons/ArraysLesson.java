package Lessons;

public class ArraysLesson {

	public static void main(String[] args) {
		// In Java, all arrays are dynamically allocated.
		// They are objects which gives us access to do things with it such as finding its length
		// To create an array, we use [] after the data type
		// Arrays can be used for static fields, local variables, and in method parameters
		// Size of the array can be specified with int or short but not long
		
		
		// One - Dimensional Arrays
		
		// Declaration
		// two components: type & name
		
		// one way to declare is:
		//		int intArray[];
		
		// the preferred way is 
//		int[] intArray;
		
		// Instantiation
		// Size is fixed and cannot be resized after allocation
//		intArray = new int[20];
		
		// One-liner all together
		int[] intArray = new int [20];
		
		// Latest versions of Java doesn't require new int[]
		int[] intArray3 = {1, 2, 3, 4, 5};
		
		// ADDING values to our intArray bu index
		intArray[0] = 1;
		intArray[1] = 2;
		
		//default is 0
//		System.out.println(intArray[19]);
		
		// Array literals - when we know the size of the array
		int[] intArray2 = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		// PRINT all elements using a for loop
		for (int i = 0; i < intArray2.length; i++) {
//		for (int i = 0; i < 10; i++) {
//			System.out.println(intArray2[i]);
			System.out.println("Index of " + intArray2[i] + " is " + i);
		}
		
		// Can print using toString method
		// System.out.println(Arrays.toString(intArray2))
		

		// Access using for each
		// type var: array
		// Don't use for each if you want to modify the array
		// For each is typically used to iterate over Collections of ArrayList classes
		for(int num: intArray3) {
			System.out.println("For each: " + num);
		}
		
		// MULTIDIMENSIONAL ARRAYS
		int[][] intArray4 = new int[10][20]; //2D array
		
		int[][] intArray5 = {{2, 7, 9}, {2, 3, 4}, {7, 6, 5}};
		
		// Printing 2D array
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print(intArray5[i][j] + " ");
				
			}
			System.out.println();
		}
	}

}

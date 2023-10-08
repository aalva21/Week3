package promineotech;

import java.util.Arrays;

public class WeekThree { // beginning of class scope
	
	public static void main(String[] args) {
		
		// Arrays are immutable 
		// Create an Array of fruit String
		String[] fruit = new String[5];
		
//		// Assign the first fruit in index 0
//		fruit[0] = "Apple";
//		
//		// Second index = [1]
//		fruit[1] = "Bananas";
//		fruit[2] = "Pear";
//		fruit[3] = "Kiwi";
//		fruit[4] = "Pineapple";
		
		System.out.println("Print fruit array: " + Arrays.toString(fruit) + "\n");
		
		// Fruit Array code above SIMPLIFIED 
		String[] fruitSimplified = {"Apple", "Bananas", "Pear", "Kiwi", "Pineapple"}; // This line simplifies the Array info from above
		
		// Print out fruit array
		System.out.println(Arrays.toString(fruitSimplified)); // Prints full array
		
		System.out.println("First element in fruitSimplified array: " + fruitSimplified[0]); // Prints index 0 - position in array 
		
		// How to find the last element of an array
		// fruit[fruit.length() - 1);
		System.out.println("This is the length of the fruitSimplfied array: " + fruitSimplified.length);
		System.out.println("Last element in fruitSimplified array: " + fruitSimplified[fruitSimplified.length - 1] + "\n"); 
		
		// Fruit Loops - create a loop that iterates over array -
		// and prints first character of each element in array
		
//		for(int i = 0; i < fruit.length; i++) { // for loop
//			System.out.println(fruit[i]);
//			System.out.println(fruit[i].charAt(0));
//		}
//		
//		for(String fruitName : fruit) { // Enhanced for loop
//			System.out.println(fruitName);
//		}
//		
//		int j = 0;
//		while (j < fruit.length) {
//			System.out.println("While loop: " + Arrays.toString(fruit));
//			j++;
//		}
//		
		System.out.println("\nOutside of for loop!");
		
		//test method with return type String
		System.out.println(printArrayElements(fruitSimplified));
		
		// test method with void return type
		printEachLetterInArray(fruitSimplified);
		
	} // End of main method scope

	public static String printArrayElements(String[] array) {
		
		String names = "";
		
		for(String name : array) {
			System.out.println(name);
			names += name + " ";
		}
		
		return names;
	} // end of printArrayElements method
	
	public static void printEachLetterInArray(String[]array) {
		
		for(int i = 0; i < array.length;i++) {
			System.out.println("\n" + array[i]);
			System.out.println(array[i].charAt(i));
		}
		
		String string = "Alex";
		System.out.println(string.length());
	}
	
	public static int power(int base, int exponent) {
		int result = 1;
		
		for(int index = 1; index <= exponent; index++) {
			result = result * base;
		}
		return result;
		
	}
	
} // End of class scope





















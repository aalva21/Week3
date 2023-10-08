package Tester;

import java.io.*;
import java.util.*;

public class TesterClass {

	//public static void main(String[] args) {
	/*	String firstName = "Diego";
		char middleInitial = 'A';
		String lastName = "Medina";
		int age = 19;
		String height = "6'8";
		int weight = 230;
		String college = "Arizona State University";
		int jerseyNumber = 29;
		String brandNIL = "NIKE\nJust do it!";
		
		
		System.out.println("NBA Draft: Class of 2030");
		System.out.println("Player: " + firstName + " " + middleInitial + "." + " " + lastName);
		System.out.println("Age: " + age);
		System.out.println("Height: " + height + " FT.");
		System.out.println("Weight: " + weight + " lbs");
		System.out.println("College: " + college);
		System.out.println("Jersey #: " + jerseyNumber);
		System.out.println("Signed to " + brandNIL);
		
		System.out.println("-----PART 2");
		System.out.println("Azul is a stinky girl");
		*/
		static double orderTotal(double product1, double product2, double product3, double taxRate) {
		    
		    // WRITE YOUR CODE HERE
	        double subtotal = product1 + product2 + product3;
	        double total = subtotal + (subtotal * taxRate);
	        return total;

			
	/***** DO NOT CHANGE THE CODE BELOW THIS LINE *****/
		}

		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			double product1, product2, product3, taxRate;
			product1 = in.nextDouble();
			product2 = in.nextDouble();
			product3 = in.nextDouble();
			taxRate = in.nextDouble();
			System.out.println("Your order total is: $" + String.format("%,.2f", orderTotal(product1, product2, product3, taxRate)));
		}

	}



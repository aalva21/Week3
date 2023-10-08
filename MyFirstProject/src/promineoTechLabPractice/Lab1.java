package promineoTechLabPractice;

public class Lab1 {

	public static void main(String[] args) {
		
		// 1. Create a variable to hold the quantity of available plane seats left on a flight		
		int availablePlaneSeats = 12;
				
		// 2. Create a variable to hold the cost of groceries at checkout
		double totalGroceryCost = 107.35;
				
		// 3. Create a variable to hold a person's middle initial
		char middleInitial = 'A';
		
		// 4. Create a variable to hold true if it's hot outside and false if it's cold outside
		boolean isHotOutside = true;
				
		// 5. Create a variable to hold a customer's first name
		String custFirstName = "Alejandro";
				
		// 6. Create a variable to hold a street address
		String streetAddress = "123 Elm Sreet";		

		// 7. Print all variables to the console
		System.out.println("-----PART 1-----");
		System.out.println("There are " + availablePlaneSeats + " plane seats available.");
		System.out.println("The total cost for groceries is " + totalGroceryCost + ".");
		System.out.println("The customer's middle initial is " + middleInitial + ".");
		System.out.println("Phoenix is always hot: " + isHotOutside);
		System.out.println("The customer's firt name is " + custFirstName + ".");
		System.out.println("The customer's address is " + streetAddress + ".");
		System.out.println("\n-----PART 2-----");

		// 8. A customer booked 2 plane seats, remove 2 seats from the available seats variable
		availablePlaneSeats -= 2;	

		// 9. Impulse candy bar purchase, add 2.15 to the grocery total	costOfGroceries = costOfGroceries + 2.15;
		totalGroceryCost += 2.15;

		// 10.  The birth certificate was printed incorrectly, change the middle initial to something else
		middleInitial = 'Z';		
		System.out.println("The correct middle initial is " + middleInitial + ".");

		// 11.  The season has changed, update the hot outside variable to be opposite of what it was
		isHotOutside = false;
		System.out.println("Winter time is hot: " + isHotOutside);

		// 12.  Create a new variable called full name using the customer's first name, the middle initial, and a last name of your choice
		String fullName = "Alejandro A Alvarez";
		System.out.println("My full name is " + fullName);

		// 13.  Print a line to the console that introduces the customer and says they live at the address variable
		System.out.println("The customer's name is " + fullName + " and his address is " + streetAddress + ".");
		
		System.out.println("-----LAB TEST-----");
		
		int num1 = 3;
		int num2 = 2;
		System.out.println(num1 % num2);


	}

}

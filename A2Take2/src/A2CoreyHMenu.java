import java.util.ArrayList;
import java.util.Scanner;

public class A2CoreyHMenu {
		ArrayList<A2CoreyHGift> list; // attribute to store a list of Gift objects
		
		// constructor
		public A2CoreyHMenu() {

			list = new ArrayList<A2CoreyHGift>(); // creates new instance of an empty list
		}

		// method to display the menu
		public void displayMenu() {
			System.out.println("\n MENU");
			System.out.println("1: Order a Gift Basket "); 
			System.out.println("2: Change Gift Basket ");                      		
			System.out.println("5: Display Gift ");      
			System.out.println("9: Exit program");		
		}
		
		// method to handle user's selection
		public void processChoice(int b) {
			
			switch (b) {

			case 1 : orderGift(); 		
				break;
			case 2 : changeGift(); 		
				break;
			case 5 : displayGift(); 	
				break;
			case 9: System.out.println("\nThank you for using the program. Goodbye!");
				break;
			default: System.out.println("Invalid choice");
			}
		}
		
		// method to display all book information in the list
		private void displayGift() {
			if (list.size() == 0)
				System.out.println("\nThere are no gifts to display");
			else {
				System.out.println(); 												// empty line before book data
				for (int i=0; i < list.size(); i++) { 								// loop for all books in the list
					A2CoreyHGift b = list.get(i); 											// get book instance from the list 
					System.out.println(b.toString()); 								// print book data to console
				}
			}
		}

		private void changeGift() {

			Scanner stdin = new Scanner(System.in);

			// prompt user for data to find the book to remove
			System.out.print("What is the ISBN of the book you want to remove? ");
			int isbn = stdin.nextInt();
			
			// look for the book that matches above
			int size = list.size(); // number of books in the list
			System.out.println(); // empty line before book data
			for (int i=0; i < size; i++) { // loop for all books in the list
				A2CoreyHGift b = list.get(i); // get book instance from the list for each index value
				if (b.isbn == isbn) {
						list.remove(b); // remove the book
						System.out.println("\nRemoved the following book: " + b.toString()); // print book data to console
						return; // done so can return from method
				}
			
			}
			// if did not return from for-loop that mean sit did not find the book
			System.out.println("\nThere is no book with this ISBN");
		}
		
		private void orderGift() {
				Scanner stdin = new Scanner(System.in);
				// prompt user for all gift data to be set on creation
				System.out.println("What kind of gift basket do you want to order?");
				System.out.println("1: Fruit Basket");
				System.out.println("2: Sweets Basket");
				int typeBasket = stdin.nextInt();
				if (typeBasket == 1) {
					System.out.println("What size of gift basket do you want (S)mall, (M)edium, or (L)arge?:");
				}
				String size = stdin.next();
				if (size == "S".toUpperCase()) {
					price = 19.99;
					numFruit = 6;
				}
				
				if (size == "M".toUpperCase()) {
					price = 29.99;
					numFruit = 9;
				}
				
				if (size == "L".toUpperCase()) {
					price = 39.99;
					numFruit = 15;
				}
				
				System.out.println("Do you want citrus fruits included? true/false :");
				boolean citrusFruit = stdin.next();
				if (citrusFruit == "true".toLowerCase()) {
					price += 5.99;
				}
				
				if (typBasket == 2) {
					System.out.println("What size of gift basket do you want (S)mall, (M)edium, or (L)arge?:");
				}
				
				
				for(int i = 0; i < list.size(); i++) {
					if (list.get(i).isbn == isbn) {
						System.out.print("This ISBN is already used! ");
						return;
					}
				}
				System.out.print("What is the price of this book? ");
				double price = stdin.nextDouble();
				System.out.print("What is the book's title? ");
				String title = stdin.next();

				// create Gift instance
				A2CoreyHGift b = new A2CoreyHGift(isbn, price, title);

				// tell user what was created
				System.out.println("\nThe following book was created: " + b.toString());

				// add book instance to list
				list.add(b);
				
		}
		
		public static void main(String[] args) {

				A2CoreyHMenu control = new A2CoreyHMenu(); // new instance of class
				
				Scanner stdin = new Scanner(System.in);
				int selection = 0;

				do {

						control.displayMenu();
						
						System.out.print("\nEnter your selection : ");
						selection = stdin.nextInt();

						control.processChoice(selection);
				
				} 
				
				while (selection != 9);

				
		}
}
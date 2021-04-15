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

			case 1 : orderA2CoreyHGift(); 		
				break;
			case 2 : changeA2CoreyHGift(); 		
				break;
			case 5 : displayA2CoreyHGift(); 	
				break;
			case 9: System.out.println("\nThank you for using the program. Goodbye!");
				break;
			default: System.out.println("Invalid choice");
			}
		}
		
		// method to display all book information in the list
		private void displayA2CoreyHGift() {
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

		private void changeA2CoreyHGift() {

			Scanner stdin = new Scanner(System.in);

			// prompt user for data to find the book to remove
			System.out.print("What is the ISBN of the book you want to remove? ");
			int isbn = stdin.nextInt();
			
			// look for the book that matches above
			int size = list.size(); // number of books in the list
			System.out.println(); // empty line before book data
			for (int i=0; i < size; i++) { // loop for all books in the list
				A2CoreyHGift b = list.get(i); // get book instance from the list for each index value
				if (b.A2CoreyHGift == A2CoreyHGift) {
						list.remove(b); // remove the book
						System.out.println("\nRemoved the following book: " + b.toString()); // print book data to console
						return; // done so can return from method
				}
			
			}
			// if did not return from for-loop that mean sit did not find the book
			System.out.println("\nThere is no book with this ISBN");
		}
		
		private void orderA2CoreyHGift() {
				Scanner stdin = new Scanner(System.in);
				// prompt user for all gift data to be set on creation
				System.out.println("What kind of gift basket do you want to order?");
				System.out.println("1: Fruit Basket");
				System.out.println("2: Sweets Basket");
				int i = stdin.nextInt();
				switch (i) {

			      case 1 : orderA2CoreyHFruit();         
			        break;
			      case 2 : orderA2CoreyHSweets();         
			        break;
			          default: System.out.println("Invalid choice");
			    }
			}
				
		private void orderA2CoreyHFruit() {
				// create Gift instance
				A2CoreyHGift b = new A2CoreyHGift();
				System.out.println("Do you want citrus fruits included? true/false :");
				boolean citrusFruit = (stdin.next().toLowerCase()=="true");
				if (typeBasket == 1) {
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
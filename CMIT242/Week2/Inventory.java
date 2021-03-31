import java.util.ArrayList;
import java.util.Scanner;
public class Inventory {
		//Book = Candle
		//Inventory = HandleCandles
		//matchISBN = isLit
		//title = color
		//isbn = height
		ArrayList<Book> list; // attribute to store a list of Book objects
		
		// constructor
		public Inventory() {

			list = new ArrayList<Book>(); // creates new instance of an empty list
		}

		// method to display the menu
		public void displayMenu() {

			System.out.println("\n MENU");
			System.out.println("1: Add book ");
			System.out.println("2: Remove book ");
			System.out.println("3: Return book ");                     			//Still messing with these
			System.out.println("4: Borrow book ");								//Still messing with these
			System.out.println("5: Display books ");
			System.out.println("9: Exit program");
		}
		
		// method to handle user's selection
		public void processChoice(int b) {
			
			switch (b) {

			case 1 : addBook();
				break;
			case 2 : removeBook();
				break;
			case 3 : recoverBook(true);												//Still messing with these
				break;
			case 4 : recoverBook(false);											//Still messing with these
				break;
			case 5 : displayBooks();
				break;
			case 9: System.out.println("\nThank you for using the program. Goodbye!");
				break;
			default: System.out.println("Invalid choice");
			}
		}
		
		// method to display all book information in the list
		private void displayBooks() {
			if (list.size() == 0)
				System.out.println("\nThere are no books to display");
			else {
				System.out.println(); 												// empty line before book data
				for (int i=0; i < list.size(); i++) { 								// loop for all books in the list
					Book b = list.get(i); 											// get book instance from the list for each index value
					System.out.println(b.toString()); 								// print book data to console
				}
			}
		}
		
		// when light=true, lit the book and if light=false, extinguish book
		// TODO: could also first check if already lit or extinguished and give message

		private void recoverBook(boolean number) {
			Scanner stdin = new Scanner(System.in);
			// prompt user for data to find the book to remove
			System.out.print("What is the ISBN of the book you want to borrow/return? ");
			int isbn = stdin.nextInt();
			System.out.print("What is title of the book you want to borrow/return? ");
			String title = stdin.next();

			// look for the book that matches above
			int size = list.size(); // number of books in the list
			System.out.println(); // empty line before book data
			for (int i=0; i < size; i++) { // loop for all books in the list
				Book b = list.get(i); // get book instance from the list for each index value
				if (b.isbn == isbn && b.title.equalsIgnoreCase(title)) {
						if (number)
								b.matchISBN = true; // light book
						else
								b.matchISBN = false; // extinguish book
						list.set(i, b); // update in list
						System.out.println("\nAdded/Removed book: " + b.toString()); // print book data to console
						return; // done
				}
				
			}

			// if here than did not find the book
			System.out.println("\nThere is no book with this ISBN and title");
		}

		// method to remove the first book that matches user's criteria
		private void removeBook() {

			Scanner stdin = new Scanner(System.in);

			// prompt user for data to find the book to remove
			System.out.print("What is the ISBN of the book you want to remove? ");
			int isbn = stdin.nextInt();
			System.out.print("What is title of the book you want to remove? ");
			String title = stdin.next();

			// look for the book that matches above
			int size = list.size(); // number of books in the list
			System.out.println(); // empty line before book data
			for (int i=0; i < size; i++) { // loop for all books in the list
				Book b = list.get(i); // get book instance from the list for each index value
				if (b.isbn == isbn && b.title.equalsIgnoreCase(title)) {
						list.remove(i); // remove the book
						System.out.println("\nRemoved the following book: " + b.toString()); // print book data to console
						return; // done so can return from method
				}
			
			}
			// if did not return from for-loop that mean sit did not find the book
			System.out.println("\nThere is no book with this isbn and title");
			
		}

		private void addBook() {
				Scanner stdin = new Scanner(System.in);

				// prompt user for all book data to be set on creation
				System.out.print("What is the book's isbn? ");
				int isbn = stdin.nextInt();
				System.out.print("What is the price of this book? ");
				double price = stdin.nextDouble();
				System.out.print("What is the book's title? ");
				String title = stdin.next();

				// book must start as unlit so not prompting

				// create Book instance
				Book b = new Book(isbn, price, title);

				// tell user what was created
				System.out.println("\nThe following book was created: " + b.toString());

				// add book instance to list
				list.add(b);
				
		}
		
		public static void main(String[] args) {

				Inventory control = new Inventory(); // new instance of driver class
				
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
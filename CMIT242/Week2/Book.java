		//Book = Candle
		//Inventory = HandleCandles
		//matchISBN = isLit
		//title = color
		//isbn = height
		//price = diameter
public class Book {
        // attributes
        public int isbn;
        public double price;
        public String title;
        public boolean matchISBN;
        // constructor
        public Book(int isbn, double price, String title) {
            if (isbn <= 0 || title == null) {
                    System.out.println("You must enter and ISBN and Title.");

                    return; // this should be an exception to be covered later in the course
            }
            this.isbn = isbn;
            this.price = price;
            this.title = title;
            // Book ID must not match
            matchISBN = false;
        }
        
        // method to add book
        public void addBook() { 			//not sure if addBook is a good idea
            if (matchISBN) // validation
                     System.out.println("We already have this book");
            else
                     matchISBN = true;
            }
        	
        // method to remove book
        public void removeBook() {

            if (!matchISBN) // validation
                     System.out.println("This book has already been removed");
            else
                     matchISBN = false;
        }
        	
        // method to change ISBN 
        public void updateISBN(int isbn) {//will never do this but for the time being...

        		// validate
        		if (isbn > this.isbn || isbn <= 0)
        				System.out.println("New candle height must be less than current height but greater than 0");
        		else
        				this.isbn = isbn;
        }
        	
        	
        public String toString() {
    		return "Book [title=" + title + ", isbn=" + isbn + ", price =" + price + ", matchISBN=" + matchISBN + "]";
        }
}
        	
        	//none of this works below here
        	
        	
        	
        	
        	
        	
  
        
        
        

        
public class RunRental {

public static void main(String[] args) {
	// create instances of the ebook and display 
	EBook ebook = new EBook(123, "Forever Young", 2018, 20);
	System.out.print(ebook.toString());
	System.out.printf("   Rental fee=$%.2f\n", ebook.calculateRentalFee());
	
	// create instances of the music cd and display 
	MusicCD cd = new MusicCD(124, "Beyond Today", 2020, 114); 
	System.out.print(cd.toString());
	System.out.printf("   Rental fee=$%.2f\n",cd.calculateRentalFee());
	
	// create instances of the movie dvd and display 
	MovieDVD dvd= new MovieDVD(125, "After Tomorrow", 2020, 120); 
	System.out.print(dvd.toString());System.out.printf("   Rental fee=$%.2f\n",dvd.calculateRentalFee());
	
	ebook.setNumChapters(25);
	System.out.print("\nChanging EBook chapters to 25:      ");
	System.out.println(ebook.toString());
	System.out.printf("    New Rental fee=$%.2f\n", ebook.calculateRentalFee());
	cd.setLength(120);
	System.out.print("\nChanging MusicCD length to 120:     ");
	System.out.println(cd.toString());
	System.out.printf("  New Rental fee=$%.2f\n", cd.calculateRentalFee());
	}
}
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class A4CoreyHRunRental {
	
	
	
	public void displayMenu() {
		System.out.println("\n Welcome to Media Rental System");
		System.out.println("1: Load Media objects... ");
		System.out.println("2: Find media object... ");
		System.out.println("3: Rent Media object... ");
		System.out.println("9: Quit");
	}
	
	public void processChoice(int c) {
		switch (c) {
		
		case 1 : A4CoreyHMedia.loadMedia();//loadMedia is found in Media.java 
			break;					// How do I make this take something like C:\path\to\the\file.txt
		case 2 : A4CoreyHMedia.findMedia();
			break;
		case 3 : A4CoreyHMedia.rentMedia();
			break;
		case 9: 
			System.out.println("\nThank you for using the program. Goodbye!");
			break;
		default: System.out.println("Invalid choice");
		}
	}

	static int selection = 0;
	
	public static void main(String[] args) {

		// create a default manager
		A4CoreyHManager mgt = new A4CoreyHManager();
		A4CoreyHRunRental run = new A4CoreyHRunRental();
		Scanner stdin = new Scanner(System.in);
		
		
		do {
			run.displayMenu();
			System.out.print("\nEnter your selection : ");
			selection = stdin.nextInt();
			run.processChoice(selection);
			} 
		while (selection != 9);
			stdin.close();
		
		// create instances of the ebook and display
		A4CoreyHEBook ebook = new A4CoreyHEBook(123, "Forever Young", 2018, 20, true);
		System.out.print(ebook.toString());
		System.out.printf("   Rental fee=$%.2f\n", ebook.calculateRentalFee());
		
		// create instances of the music cd and display
		A4CoreyHMusicCD cd = new A4CoreyHMusicCD(124, "Beyond Today", 2020, 114, true);
		System.out.print(cd.toString());
		System.out.printf("   Rental fee=$%.2f\n",cd.calculateRentalFee());

		// create instances of the movie dvd and display
		A4CoreyHMovieDVD dvd = new A4CoreyHMovieDVD(125, "After Tomorrow", 2020, 120, true);
		System.out.print(dvd.toString());
		System.out.printf("   Rental fee=$%.2f\n",dvd.calculateRentalFee());
		
		mgt.addMedia(ebook);
		mgt.addMedia(cd);
		mgt.addMedia(dvd);
		
		// display media data to the console
        System.out.println("Media objects add to the manager after startup:");
        mgt.displayAllMedia();
		
		ebook.setNumChapters(25);
		System.out.print("\nChanging EBook chapters to 25:      ");
		System.out.println(ebook.toString());
		System.out.printf("    New Rental fee=$%.2f\n", ebook.calculateRentalFee());
		
		cd.setLength(120);
		System.out.print("\nChanging MusicCD length to 120:     ");
		System.out.println(cd.toString());
		System.out.printf("  New Rental fee=$%.2f\n", cd.calculateRentalFee());
		
		try {
            // create media files in directory "C:/tmp-umuc"
            mgt.createMediaFiles("C:\\Users\\corey\\github\\Im-Learnding\\CMIT242\\Week3");
        	} 
		catch (IOException e) {
            e.printStackTrace();  // just print trace if there are issues
        	}
           
        try {
            // create new manager object loading the files
        	A4CoreyHManager mgt2 = new A4CoreyHManager("C:\\Users\\corey\\github\\Im-Learnding\\CMIT242\\Week3");
           
            // // display pets data to the console (in xml tag format)
            System.out.println("\nMedia objects loaded by manager2 at startup:");
            mgt2.displayAllMedia();
           
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
		


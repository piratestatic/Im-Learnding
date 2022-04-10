/** abstract class to represent a generic media*/
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.nio.file.Path.*;
import java.nio.file.Paths;

public abstract class A4CoreyHMedia {
      // attributes
      private int id;
      private String title;
      private int year;  // validate that 4 digits
      private static boolean available;
      static Scanner stdin = new Scanner(src);;
      

      // constructor
      public A4CoreyHMedia(int id, String title, int year, boolean available) {
    	  
    	  	
            this.id = id;
            this.title = title;
            this.year = year;
            this.available = available;
            
            }

            // get methods
      		//Add code to constructor to create get and set methods as appropriate. 
			public boolean isAvailable() {
				return available;
			}
			
            public int getId() {
            	if (!available)
            		System.out.println("\n The media object" + getId() + "is currently not available"); 
                  return id;
            }

            public String getTitle() {          	
            	if (!available)
            		System.out.println("\n The media object" + getTitle() + "is currently not available"); 
            	return title;
            }

            public int getYear() {
                  return year;
            }

            // set methods
            //public void setTitle(String title) {
            //      this.title = title;
            //}

            public void setYear(int year) {
                  this.year = year;
            }

            public void mediaAvailable() {
            	if(available)
            		System.out.println("\nmedia object is available");
            	else
            		available = true;
            }
            
            public void notAvailable() {
            	if(!available)
            		System.out.println("\nMedia Object is not available");
            	else
            		available = true;
            }
            
            public static void rentMedia() {
            	if (!available)
            		System.out.println ("\nCan't rent Media Object - currently unavailable");
            	else
            		System.out.println(toString());
            			
            }
             public static void loadMedia() { //will return a file path in the form of a string
            	 System.out.println ("\nEnter path (directory) where to load from:  ");   		 
            	 stdin = new Scanner((stdin.nextLine()));
            		 
            	// }
            	 
            	 //catch (FileNotFoundException e) {
            		// System.out.println("File Not Found");
            		// return;
            		 	 
            	// }
             
             }
             
             public static void findMedia() {
            	 System.out.println ("\nNothing Happens Right now");
             }
            // calculate rental fee; for generic media it is flat fee $3.50
            public double calculateRentalFee() {
                  return 3.50;
            }
            
				
      }

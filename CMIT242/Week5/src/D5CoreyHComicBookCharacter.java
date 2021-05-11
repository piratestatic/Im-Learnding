import java.util.Scanner;

public class D5CoreyHComicBookCharacter {

      public static void main(String[] args) {
    	  
    	  Scanner scanstr = new Scanner(System.in);
    	  Scanner scanint = new Scanner(System.in);
    	  
    	  boolean invalidValue = true;  // Controls while loop for input
    	  String name = null;
    	  int age= 0;
    	  Pet pet= null;
  		
    	  // loop until get valid name and age
    	  while(invalidValue) { 
  			
    		  // prompt for name 
    		  System.out.print("\nEnter pet name: ");
    		  name = scanstr.nextLine();
  			
    		  // prompt for age  
    		  System.out.print("Enter pet age: ");
    		  age = scanint.nextInt();
  			
    		  try{ 
    			  pet = new Pet(name, age); // create instance of Pet
    			  invalidValue = false;  // constructor did not throw exception so can exit loop
  				
    		  } catch(IllegalPetNameArgumentException e)  {
  					System.out.println("\nTRY AGAIN! Invalid pet name: " + e.getMessage());
  				
    		  } catch(IllegalPetAgeArgumentException e2) {
    			  	System.out.println("\nTRY AGAIN! Invalid pet age: " + e2.getMessage());
    		  }
    	  }
    	  // code doing something with Pet instance
    	  System.out.println("\nSuccessfully create Pet with name=" + pet.getName() + " age=" + pet.getAge());
    	  }
  }
    	  
    	  
    	  
    	  
    	  D5CoreyHSpiderMan notPeterParker = new D5CoreyHSpiderMan();
    	  
    	  D5CoreyHBatMan batMan = new D5CoreyHBatMan();
    	  System.out.print("Batman to the rescue:  ");
    	  batMan.catchPhrase();
    	  
    	  D5CoreyHSuperMan superMan = new D5CoreyHSuperMan();
    	  System.out.print("Superman to the rescue:  ");
    	  superMan.catchPhrase();
    	  
    	  D5CoreyHSpiderMan spiderMan = new D5CoreyHSpiderMan();
    	  System.out.print("Spiderman to the rescue:  ");
    	  spiderMan.catchPhrase();
    	  
    	  notPeterParker.numWebCartridges(2.5f);
    	  System.out.println("Web Cartridges = " + notPeterParker.getTotal());
    	  
    	  notPeterParker.numWebCartridges(2);
    	  System.out.println("Web Cartridges = " + notPeterParker.getTotal());
	}
}
    	  
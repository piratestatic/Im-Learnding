import java.util.Scanner;

public class SalinasJustin_DiscWeek6 {
  
    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	SalinasJustin_DiscWeek6 supclass = null;
    	//SuperClass supclass = new SuperClass();
    	int userSelection;
        
        // Output
        System.out.println("Name: Justin Salinas" + "\tCMIS 242/7385" + "\tDate: 04/23/2021");
        System.out.println(" ");
        System.out.println("Enter 1 for Player 1 or 2 for Player 2: ");
    	userSelection = scan.nextInt();
    	
    	if (userSelection == 1) 
    		supclass = new D6CoreyHPlayer1();
    		
    		
    	else if (userSelection == 2) 
    		supclass = new D6CoreyHPlayer2();
    		
    	
        supclass.freeThrow();
        supclass.threePoint();
    	
        //System.out.println("Both players had 6 points each.");
        
    }
    
    	
    	  // Methods are binded dynamically
        public void freeThrow() {
            System.out.println("Player 1 MISSED 6 Free Throws!");
        }
        public void threePoint() {
            System.out.println("Player 2 MISSED 2 Three Pointers");
        }
}

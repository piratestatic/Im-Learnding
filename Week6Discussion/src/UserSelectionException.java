import java.util.Scanner;

public class UserSelectionException {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		UserSelectionException dynamicBind = null;
		int userSelection;
			
		System.out.println("Please make a selection ");
		System.out.println("Select 1 for Batman: ");
		System.out.println("Select 2 for Spider-Man: ");
		userSelection = scan.nextInt();

		if (userSelection == 1) 
			dynamicBind = new D7CoreyHBatMan();
				
		else if (userSelection == 2)
		dynamicBind = new D7CoreyHSpiderMan();
		
		dynamicBind.catchPhrase(); //where the dynamic binding happens
		
		if (dynamicBind instanceof D7CoreyHSpiderMan) {
			D7CoreyHSpiderMan d = (D7CoreyHSpiderMan)dynamicBind;
			d.greatPower();
		}
		
		else if (dynamicBind instanceof D7CoreyHBatMan) {
			D7CoreyHBatMan d = (D7CoreyHBatMan)dynamicBind;
			d.darkKnight();
		}
	}
	

	public void catchPhrase() { //if a file doesn't have catchPhrase() it will print this below

        System.out.println("I'll save you!");         
	}
}
	
	


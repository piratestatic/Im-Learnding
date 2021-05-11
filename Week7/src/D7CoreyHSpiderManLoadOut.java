import java.util.Scanner;

public class D7CoreyHSpiderManLoadOut {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		boolean invalidValue = true;
		int numWebCartridges = 0;
		D7CoreyHSpiderMan spiderMan = null; //will cause null pointer exception if user selects 0 
		
		//"while" keeps user in a loop until they answer 1-10. "if" drops them out and gives a null pointer exception
		while (invalidValue) {
			System.out.println("\nEnter how many web cartridges SpiderMan is carrying: ");
			numWebCartridges = scan.nextInt();
			
			try {
				
				spiderMan = new D7CoreyHSpiderMan(numWebCartridges);
				invalidValue = false;
				
			} catch (D7CoreyHIllegalSpiderManArgumentException e) {
				System.out.println("\nI know web cartridge aren't cheap however, " + e.getMessage());
			}
			
		}
		
	
		System.out.println("\nOkay SpiderMan is ready to fight crime with " 
				+ spiderMan.getNumWebCartridges() + " web cartridges!");
		}
}

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
			case 2 : if (list.contains(orderA2CoreyHFruit()))
						{
						changeA2CoreyHFruit();
						}
						else 
						{
						orderA2CoreyHSweets();
						}				
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
				System.out.println(); 												
				for (int i=0; i < list.size(); i++) { 								
					A2CoreyHGift b = list.get(i); 											 
					System.out.println(b.toString()); 								
				}
			}
		}

		private void changeA2CoreyHFruit() {
			Scanner stdin = new Scanner(System.in);
			System.out.println("Current gift size is: " + orderA2CoreyHFruit().getGiftSize() + " What size do you want? S, M, or L:");
			String newSize = stdin.next().toLowerCase();
			orderA2CoreyHFruit().setGiftSize(newSize);
			System.out.println("Current basket citrus=" + orderA2CoreyHFruit().getCitrusFruit() + "Do you want citrus fruits included? true/false:");
			boolean citrusFruit = (stringPars(stdin.next().toLowerCase()));
			orderA2CoreyHFruit().setCitrusFruit(citrusFruit);
		}
		
		private void changeA2CoreyHSweets() {
			Scanner stdin = new Scanner(System.in);
			System.out.println("Current gift size is: " + orderA2CoreyHSweets().getGiftSize() + " What size do you want? S, M, or L:");
			String newSize = stdin.next().toLowerCase();
			orderA2CoreyHSweets().setGiftSize(newSize);
			System.out.println("Current basket citrus=" + orderA2CoreyHSweets().getHasNuts() + "Do you want citrus fruits included? true/false:");
			boolean hasNuts = (stringPars(stdin.next().toLowerCase()));
			orderA2CoreyHSweets().setHasNuts(hasNuts);
		}
		
		private void orderA2CoreyHGift() {
				Scanner stdin = new Scanner(System.in);
				// prompt user for all gift data to be set on creation
				System.out.println("What kind of gift basket do you want to order?");
				System.out.println("1: Fruit Basket");
				System.out.println("2: Sweets Basket");
				int i = stdin.nextInt();
				switch (i) {

			      case 1 : list.add(orderA2CoreyHFruit());         
			        break;
			      case 2 : list.add(orderA2CoreyHSweets());         
			        break;
			          default: System.out.println("Invalid choice");
			    }
			}
		
		private boolean stringPars(String hasItem) {
				if (hasItem == "true");
				{
				return true;
				}
		}
		
	
			
			
		private A2CoreyHFruitBasket orderA2CoreyHFruit() {
			// create Gift instance
			Scanner stdin = new Scanner(System.in);
			System.out.println("Do you want citrus fruits included? true/false :");
			boolean citrusFruit = (stringPars(stdin.next().toLowerCase()));
			System.out.println("What size of gift basket do you want (S)mall, (M)edium, or (L)arge?:");
			String giftSize = stdin.next().toLowerCase();
			int basketID = (A2CoreyHGift.basketID());
			A2CoreyHFruitBasket b = new A2CoreyHFruitBasket(basketID, giftSize, citrusFruit);
			System.out.println(b.toString());
			return b;
			}
				
		private  A2CoreyHSweetsBasket orderA2CoreyHSweets() {
			// create Gift instance
			Scanner stdin = new Scanner(System.in);
			System.out.println("Do you want this to include nuts? true/false :");
			boolean hasNuts = (stringPars(stdin.next().toLowerCase()));
			System.out.println("What size of gift basket do you want (S)mall, (M)edium, or (L)arge?:");
			String giftSize = stdin.next().toLowerCase();
			int basketID = (A2CoreyHGift.basketID());
			A2CoreyHSweetsBasket b = new A2CoreyHSweetsBasket(basketID, giftSize, hasNuts);
			System.out.println(b.toString());
			return b;
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
//pet???
public class D7CoreyHSpiderMan { 
	
	private int userSelection;
	
	public D7CoreyHSpiderMan(int userSelection) {
		
		if (userSelection == null) 
			throw new UserSelectionException(userSelection);
		
		if (userSelection <= 0 || userSelection >=3)
			throw new UserSelectionException("Please Enter 1 or 2");
		
		this.userSelection = userSelection;
		
	}
	
	public int getUserSelection() {
		return userSelection;	
	}
			
	public void catchPhrase() { //an example of overriding
		System.out.println("My Spider-Sense is tingling.");
	}
	
	public void greatPower() { //additional function
		System.out.println("With Great Power, Comes Great Responsibility!");
	}
}

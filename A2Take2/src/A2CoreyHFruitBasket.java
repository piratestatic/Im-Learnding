import java.util.*;

public class A2CoreyHFruitBasket extends A2CoreyHGift { 
	//local attributes
	private int numFruit;         	//S = 6, M = 9, L = 15 
	private boolean citrusFruit;  	//True = additional $5.99
	public double price;
	
	// constructor
	public A2CoreyHFruitBasket(int basketID, String giftSize, boolean citrusFruit) {
		super(basketID, giftSize);
		
		switch(giftSize) {
		
		case "s" : 
			numFruit = 6;
			price = 19.99;
		case "m" :
			numFruit = 9;
			price = 29.99;
		case "l" :
			numFruit = 15;
			price = 39.99;
		}
						
		if (citrusFruit) {
			price += 5.99;
		}
	
	
	//get method
	public int getNumFruit() {
		return numFruit;
		}
	
	public boolean getCitrusFruit() {
		return citrusFruit;
		}
	
	
	//set method
	public void setNumFruit(int numFruit) {
		this.numFruit = numFruit;
		}
	
	public void setCitrusFruit(boolean citrusFruit) {
		this.citrusFruit = citrusFruit;
		}
	// override parent's
/*	@Override
	public double calculateGiftPrice() {
				
			double smallPrice = 19.99; // basic fee
			double mediumPrice = smallPrice += 10.00;
			double largePrice = smallPrice += 20.00;
			//int currYear = Calendar.getInstance().get(Calendar.YEAR);
			
			if(giftSize == "s" && !citrusFruit) {
				return smallPrice; //19.99;
			} else if(size == "s" && citrusFruit) {
				return smallPrice += 5.99 ;  // add 5.99 to 19.99
			} else if(size == "m" && !citrusFruit) {
				return mediumPrice;  
			} else if(size == "m" && citrusFruit) {
				return mediumPrice += 5.99;  // add 5.99 to 29.99
			} else if(size == "l" && !citrusFruit) {
				return largePrice;  
			} else if(size == "l" && citrusFruit) {
				return largePrice += 5.99;  // add 5.99 to 29.99
			}
			
				return price
			}
*/			
	//@Override
	//public String toString() {
		//return "Fruit Basket [ numFruits= " + numFruits() + ", citrusFruit= " + citrusFruit() + ", basketID= " + basketID() + ", price= " 
				//+ price + "]";
		//}

	//private String numFruits() {
		// TODO Auto-generated method stub
		//return null;
	}
//}
	
	





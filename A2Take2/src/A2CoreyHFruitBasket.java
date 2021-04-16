import java.util.*;

public class A2CoreyHFruitBasket extends A2CoreyHGift { 
	//local attributes
	private int numFruit;         	//S = 6, M = 9, L = 15 
	private boolean citrusFruit;  	//True = additional $5.99
	
	// constructor
	public A2CoreyHFruitBasket(int basketID, String giftSize, boolean citrusFruit, double price) {
		super(basketID, giftSize, price);
		
		
		if (getGiftSize() == "s") {
			numFruit = 6;
		} else if (getGiftSize() == "m" ) {
			numFruit = 9;
		} else if (getGiftSize() == "l" ) {
			numFruit = 15;
		}
		
		
		if (citrusFruit)
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
	@Override
	public double calculateGiftPrice() {
				
			double smallPrice = 19.99; // basic fee
			double mediumPrice = smallPrice += 10.00;
			double largePrice = smallPrice += 20.00;
			//int currYear = Calendar.getInstance().get(Calendar.YEAR);
			
			if(size == small && !citrusFruit) {
				return smallPrice; //19.99;
			} else if(size == small && citrusFruit) {
				return smallPrice += 5.99 ;  // add 5.99 to 19.99
			} else if(size == medium && !citrusFruit) {
				return mediumPrice;  
			} else if(size == medium && citrusFruit) {
				return mediumPrice += 5.99;  // add 5.99 to 29.99
			} else if(size == large && !citrusFruit) {
				return largePrice;  
			} else if(size == large && citrusFruit) {
				return largePrice += 5.99;  // add 5.99 to 29.99
			}
			
				return price
			}
			
	@Override
	public String toString() {
		return "Fruit Basket [ numFruits= " + numFruits() + ", citrusFruit= " + citrusFruit() + ", basketID= " + basketID() + ", price= " 
				+ price + "]";
		}

	private String numFruits() {
		// TODO Auto-generated method stub
		return null;
	}
	}
	
	
}



/*

	// override parent's
	@Override
	public double calculateRentalFee() {
		double fee = numChapters * 0.10;  // basic fee
		int currYear = Calendar.getInstance().get(Calendar.YEAR);
		
		if(this.getYear() == currYear)
			fee += 1;  // add $1.00 fee
		
		return fee;
	}
	
	
*/
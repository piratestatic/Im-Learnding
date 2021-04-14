import java.util.*;

public class A2CoreyHFruitBasket extends A2CoreyHGift { 
	//local attributes
	private int numFruit;         	//S = 6, M = 9, L = 15 
	private boolean citrusFruit;  	//True = additional $5.99
	
	// constructor
	public A2CoreyHFruitBasket(String basket, int numFruit, boolean citrusFruit, String size ) {
		super(basket, size);
		numFruits = fruits;
		citrusFruit = citrus;		
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
				
			//double price = numFruit * 0.10;  // basic fee
			//int currYear = Calendar.getInstance().get(Calendar.YEAR);
			
			if(this.citrusFruit == True)
				smallPrice += 5.99 ;  // add $1.00 fee
			if(this.citrusFruit == True)
				medPrice += 5.99 ;
			if(this.citrusFruit == True)
				lrgPrice += 5.99 ;
			return price;
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
	
	@Override
	public String toString() {
		return "EBook [ id=" + getId() + ", title=" + getTitle() + ", year=" + getYear() + ", chapters=" 
				+ numChapters+ "]";
		}
	}
*/
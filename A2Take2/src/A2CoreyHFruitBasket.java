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
			break;
		case "m" :
			numFruit = 9;
			price = 29.99;
			break;
		case "l" :
			numFruit = 15;
			price = 39.99;
			break;
		}
						
		if (citrusFruit) {
			price += 5.99;
		}
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
	
	@Override
	public String toString() {
		return ("Fruit Basket [ numFruits= " + numFruit + ", citrusFruit= " + citrusFruit + ", basketID= " + basketID() + ", price= " + price + "]");
		}
}
	
	





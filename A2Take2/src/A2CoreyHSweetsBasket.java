public class A2CoreyHSweetsBasket extends A2CoreyHGift { 
	//local attributes
	private boolean hasNuts;  	
	public double price;
	
	// constructor
	public A2CoreyHSweetsBasket(int basketID, String giftSize, boolean hasNuts) {
		super(basketID, giftSize);
		
		switch(giftSize) {
		
		case "s" : 
			price = 19.99;
			break;
		case "m" :
			price = 29.99;
			break;
		case "l" :
			price = 39.99;
			break;
		}
						
	}
	//get method
	public boolean getHasNuts() {
		return hasNuts;
		}
	
	public void setHasNuts(boolean hasNuts) {
		this.hasNuts = hasNuts;
		}
		
			
	@Override
	public String toString() {
		return "Sweets Basket [ hasNuts= " + hasNuts + ", basketID= " + basketID() + ", price= " + price + "]";
		}
	}
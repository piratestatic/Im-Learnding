public class A2CoreyHSweetsBasket extends A2CoreyHGift { 
	//local attributes
	private int numFruit;         	//S = 6, M = 9, L = 15 
	private boolean hasNuts;  	//True = additional $5.99
	
	// constructor
	public A2CoreyHSweetsBasket(int basketID, String size, boolean hasNuts) {
		super(basketID, size, price);
		
		
		if (this.size == "s") {
			price = 6;
		} else if (this.size == "m" ) {
			price == 29.99;
		} else {
			price == 39.99;
		}
	
	//get method
	public boolean getCitrusFruit() {
		return hasNuts;
		}
	
	public void setCitrusFruit(boolean hasNuts) {
		this.hasNuts = hasNuts;
		}
	
/*			
	// override parent's
	@Override
	public double calculateGiftPrice() {
*/							
		
			
	@Override
	public String toString() {
		return "Sweets Basket [ numFruits= " + numFruits() + ", hasNuts= " + hasNuts() + ", basketID= " + basketID() + ", price= " 
				+ price + "]";
		}
	}
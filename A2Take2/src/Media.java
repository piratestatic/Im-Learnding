
public abstract class A2CoreyHGift {
	
	private String basket;				//this is the id...some how???
	private String size;      		//S = 19.99, M = 29.99, L = 39.99
	
	//constructor
	public A2CoreyHGift(String basket,  String size) {
		this.basket = basket;
		this.size = size;
		
	}
	//get methods
	public String getBasket() {
		return basket;
		}
	
	public String getSize() { //Not sure what I am doing with this???
		return size;
		}
	
	//set method
	public void setBasket(String basket) {
		this.basket = basket;
		}
	
	
	public String setSize(String size) {
		this.size = size;
		}
	
	//calculate basket fee
	public double calculateGiftPrice() {
		return 19.99;
			
		}
	}
		

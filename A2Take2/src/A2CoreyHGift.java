import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;

public class A2CoreyHGift {
	
	private int basketID;				//this is the id...some how???
	private String giftSize;      		
	private double price; 				//S = 19.99, M = 29.99, L = 39.99
	
	//constructor
	public A2CoreyHGift(int basketID,  String giftSize) {
		this.basketID = basketID;
		this.giftSize = giftSize;
		//this.price = price;
		
	}
	//get methods
	public int getBasketID() {
		return basketID;
		}
	public String getGiftSize() { 
		return giftSize;
		}
	//public double getPrice() { 
		//return price;
		//}
	
	//set method
	public void setBasketID(int basketID) {
		this.basketID = basketID;
		}
	public void setGiftSize(String giftSize) {
		this.giftSize = giftSize;
		}
	//public void setPrice(double price) {
		//this.price = price;
		//}
	
	
	    public static int basketID() {      
	        UUID idOne = UUID.randomUUID();
	        String str=""+idOne;        
	        int uid=str.hashCode();
	        String filterStr=""+uid;
	        str=filterStr.replaceAll("-", "");
	        return Integer.parseInt(str);
	    }

	    // XXX: replace with java.util.UUID

	    public static void main(String[] args) {
	        for (int i = 0; i < 5; i++) {
	            System.out.println(basketID());
	            //generateUniqueId();
	        }
	    }

	}
	
	
	
	
	
	//calculate basket fee
	//public double calculateGiftPrice() {//smallest basket is 19.99
	//	return 19.99;
			
	//	}
	//}



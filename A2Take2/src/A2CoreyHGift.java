import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;

public class A2CoreyHGift {
	
	public int basketID;				
	public String giftSize;      				
	
	//constructor
	public A2CoreyHGift(int basketID,  String giftSize) {
		this.basketID = basketID;
		this.giftSize = giftSize;
		
	}
	//get methods
	public int getBasketID() {
		return basketID;
		}
	public String getGiftSize() { 
		return giftSize;
		}
	
	
	//set method
	public void setBasketID(int basketID) {
		this.basketID = basketID;
		}
	public void setGiftSize(String giftSize) {
		this.giftSize = giftSize;
		}

	    public static int basketID() {      
	        UUID idOne = UUID.randomUUID();
	        String str=""+idOne;        
	        int uid=str.hashCode();
	        String filterStr=""+uid;
	        str=filterStr.replaceAll("-", "");
	        return Integer.parseInt(str);
	    }

	}

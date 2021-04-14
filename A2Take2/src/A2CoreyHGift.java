import java.util.ArrayList;
import java.util.Scanner;


public abstract class A2CoreyHGift {
	
	private String basketID;				//this is the id...some how???
	private String size;      		//S = 19.99, M = 29.99, L = 39.99
	private double price; 
	
	//constructor
	public A2CoreyHGift(String basketID,  String size, double price) {
		this.basketID = basketID;
		this.size = size;
		this.price = price;
		
	}
	//get methods
	public String getBasketID() {
		return basketID;
		}
	
	public String getSize() { 
		return size;
		}
	public double getPrice() { 
		return price;
		}
	
	//set method
	public void setBasketID(String basketID) {
		this.basketID = basketID;
		}
	public void setSize(String size) {
		this.size = size;
		}
	public void setPrice(double price) {
		this.price = price;
		}
	
	
	//calculate basket fee
	//public double calculateGiftPrice() {//smallest basket is 19.99
	//	return 19.99;
			
	//	}
	}



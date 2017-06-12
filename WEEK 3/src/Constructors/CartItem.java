package Constructors;

public class CartItem {
	
	String name;
	double pricePerItem; //BigDecimal for big numbers;
	int quantity;
	
	public CartItem(String itemName, double itemPrice, int itemQuantity) {
		name = itemName;
		pricePerItem = itemPrice;
		quantity = itemQuantity;
		
	}
	
	double totalPrice() {
		
	return pricePerItem * quantity;
	
	}
	
	
/*
 * toString() gives is a String representation
 * 
 */
	public String toString() {
	
		return quantity +""+name +" @ " +pricePerItem; 
		
}
}

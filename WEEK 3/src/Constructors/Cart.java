package Constructors;

import java.util.ArrayList;
import java.util.List;

public class Cart {
	
	List<CartItem> items = new ArrayList<CartItem>();
	
	public void addItem(CartItem item) {
           items.add(item);

	}
	
	public String toString() {
		
		return "Cart with items: " + items;
	}
	
	public double totalPrice() {
		double total = 0;
		for(CartItem currentItem: items) {
		   total = total + currentItem.totalPrice();
	}
		return total;
}
	
}	
package Constructors;

public class ShoppingCartApp {

	public static void main(String[] args) {
		Cart cart = new Cart();
		
		CartItem mangoes = new CartItem(" mango", 1.25 , 4 );
		System.out.println(mangoes);
		System.out.println(" Total price of mangoes are " +mangoes.totalPrice());
		
	    cart.addItem(mangoes);
		
		CartItem avocados = new CartItem(" avocado", 1.79 , 3 );
		
		cart.addItem(avocados);
	    System.out.println(cart);
	    System.out.println(" Total price of the items are " +cart.totalPrice());
	}

	
	
}

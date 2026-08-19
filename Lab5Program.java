package lab5;

import java.util.LinkedList;
import java.util.Queue;

public class Lab5Program {
	
	public static void main(String[] args) {
		
		ShoppingBasket basket1 = new ShoppingBasket();
		ShoppingBasket basket2 = new ShoppingBasket();
		ShoppingBasket basket3 = new ShoppingBasket();
		
		ShoppingBasketItem item1 = new ShoppingBasketItem("Bread", 1, 2.25);
		ShoppingBasketItem item2 = new ShoppingBasketItem("Milk", 2, 1.95);
		ShoppingBasketItem item3 = new ShoppingBasketItem("Eggs", 1, 4.00);
		
		basket1.add(item1);
		basket2.add(item2);
		basket3.add(item3);
		
		baskets.add(basket1);
		baskets.add(basket2);
		baskets.add(basket3);
		
		processBaskets();
		
	}
	
	// Create a queue of ShoppingBaskets called baskets
	static Queue<ShoppingBasket> baskets = new LinkedList<>();
	
	static void processBaskets() {
		while (!baskets.isEmpty()) {
			ShoppingBasket basket = baskets.poll();
			basket.displayItems();
			
			
		}
	}

}

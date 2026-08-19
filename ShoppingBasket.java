package lab5;

import java.util.ArrayList;

public class ShoppingBasket {
	
	ArrayList<ShoppingBasketItem> items = new ArrayList<>();


	void add(ShoppingBasketItem item) {
		items.add(item);
	}
	
	void displayItems() {
		for (ShoppingBasketItem item : items) {
			System.out.println(item.getDetails());
		}
	}
	

}

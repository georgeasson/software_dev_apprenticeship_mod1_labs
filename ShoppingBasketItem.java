package lab5;

public class ShoppingBasketItem {
	
	String productName;
	int quantity;
	double price;
	
	public ShoppingBasketItem(String name, int quant, double price) {
		this.productName = name;
		this.quantity = quant;
		this.price = price;
	}
	
	public String getDetails() {
		return "Product name: " + productName + ", quantity: " + quantity + ", price: " + price;
	}

}

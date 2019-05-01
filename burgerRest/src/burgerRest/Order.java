package burgerRest;

import java.util.ArrayList;

public class Order {

	// Attributes..
	private ArrayList<Item> items;
	
	/**
	 * Default.
	 * 
	 */
	public Order() {
	
		this(new ArrayList<Item>());
	
	}
	
	/**
	 * Constructor.
	 * 
	 * @param items
	 * @param totalPrice
	 */
	public Order(ArrayList<Item> items) {
	
		this.items = items;
	
	}

	public ArrayList<Item> getItems() {
		return items;
	}

	public void setItems(ArrayList<Item> items) {
		this.items = items;
	}

	public double getTotalPrice() {
		double price = 0;
		for(Item item: items) {
			price += item.getPrice() * item.getQuantity();
		}
		return price;
	}

}

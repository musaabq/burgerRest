package burgerRest;

public class Item {

	// Attributes
	private String name;
	private String description;
	private int quantity;
	private double price;
	
	/**
	 * Constructor.
	 * 
	 * @param name
	 * @param quantity
	 * @param price
	 */
	public Item(String name, String descrip, int quantity, double price) {
		this.name = name;
		this.description = descrip;
		this.quantity = quantity;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public String toString() {
		
		return name+", Qty: "+quantity;
		
	}
	
}

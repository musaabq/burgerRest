package burgerRest;

import java.util.Scanner;

public class BurgerRestaurant {

	// Attributes..
	private Scanner scan;
	private Order currentOrder;
	private Order favOrder;
	
	/**
	 * Constructor to initialize the 
	 * values and start the menu to execute.
	 */
	public BurgerRestaurant() {
		
		scan = new Scanner(System.in);
		
		startExecution();
		
		scan.close();
		
	}
	
	/**
	 * Starting the execution of the program..
	 */
	private void startExecution() {
		
		int option = 0;
		
		do { // run until broke.
			
			System.out.print("*** Select ***\n\n"
					+ "1: Do Order\n"
					+ "2: Select Favourite Order\n"
					+ "3: Exit\n"
					+ "Select Option: ");
			option = scan.nextInt();
			
			if(option == 1) {
				doOrder();
			}else if(option == 2) {
				favouriteOrder();
			}else if(option == 3) {
				break;
			}else {
				System.out.println("\nSelect appropriate option from 1-3.\n");
			}
			
		} while(true);
		
		System.out.println("\nThank You for using our system.");
		
	}
	
	/**
	 * Doing order..
	 */
	private void doOrder() {
		
		int option;
		currentOrder = new Order();
		do {
			
			Item[] allItems = new Item[] {new CheeseBurger(0), 
					new ChickenBurger(0), new BeefBurger(0), 
					new FrenchFries(0), new CocaColaDrink(0)};
			int quantity;
			System.out.print("\nSelect From Menu.\n"
					+ "1: Cheese Burger\n"
					+ "2: Chicken Burger\n"
					+ "3: Beef Burger\n"
					+ "4: French Fries\n"
					+ "5: Coca Cola Drink\n"
					+ "6: Order Completed\n"
					+ "Select Option: ");
			option = scan.nextInt();
			
			if(option > 0 && option < 6) {
				
				Item item = allItems[option - 1];
				System.out.print("\t"+item.getName()+"\n"
						+ "\tDescription: "+item.getDescription()+".\n"
						+ "Select Quantity: ");
				quantity = scan.nextInt();
				
				if(quantity > 0) {
					
					item.setQuantity(quantity);
					currentOrder.getItems().add(item);
					System.out.println("Item added into the order.");
					
				}else {
					System.out.println("\nQuantity should be positive.\n");
				}
			}else if(option == 6) {
				
				// Order Completed..
				System.out.println("Review");
				for(Item item: currentOrder.getItems()) {
					
					System.out.println("\t"+item.toString());
					
				}
				System.out.print("Total Price: "+currentOrder.getTotalPrice()+"\n\n"
						+ "1: Confirm Order\n"
						+ "2: Confirm & Add to Favourite\n"
						+ "3: Cancel\n"
						+ "Select Option: ");
				option = scan.nextInt();
				if(option == 1) {
					System.out.println("Order Confirmed Thank You.");
				}else if(option == 2) {
					
					this.favOrder = new Order(currentOrder.getItems());
					System.out.println("Order Confirmed Thank You.");
				}else {
					System.out.println("Order Cancelled.");
				}
				break;
				
			}else {
				System.out.println("Select Appropriate option.");
			}
			
		} while(true);
		
	}
	
	/**
	 * Doing again favourite order.
	 */
	private void favouriteOrder() {
		
		if(favOrder == null) {
			System.out.println("No any favourite Order is added.");
		}else {
			
			System.out.println("\nReview");
			for(Item item: favOrder.getItems()) {
				
				System.out.println("\t"+item.toString());
				
			}
			System.out.println("Total Price: "+favOrder.getTotalPrice()+"\n"
					+ "1: Confirm Order\n"
					+ "2: Cancel\n"
					+ "Select Option: ");
			int option = scan.nextInt();
			if(option == 1) {
				System.out.println("Order Confirmed Thank You.");
			}else {
				System.out.println("Order Cancelled.");
			}
			
		}
		
	}
	
	/**
	 * Main method to start the program.
	 */
	public static void main(String[] args) {
		
		new BurgerRestaurant();
		
	}

}

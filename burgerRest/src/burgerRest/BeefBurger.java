package burgerRest;

public class BeefBurger extends Item{

	/**
	 * Constructor to set the values.
	 * 
	 * @param quantity
	 */
	public BeefBurger(int quantity) {
	
		super("Beef Burger $10", "topped with slivered onions, "
			+ " pickles and two slices of cheese on a sesame seed bun", quantity, 10);
	
	}

}
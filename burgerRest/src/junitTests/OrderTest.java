package junitTests;

import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import burgerRest.*;

class OrderTest {

	/// Main Test Cases..
	private Order order = new Order();
	
	// Default Constructor..
	@Test
	void test1() {
	
		assertEquals(order.getItems(), new ArrayList<Item>());
		assertEquals(order.getTotalPrice(), 0);
	
	}
	
	// Parameter's Constructor..
	@Test
	void test2() {
	
		ArrayList<Item> items = new ArrayList<>();
		items.add(new ChickenBurger(2));
		items.add(new BeefBurger(3));
		items.add(new FrenchFries(5));
		items.add(new CocaColaDrink(10));
		
		Order newOrder = new Order(items);
		assertEquals(newOrder.getItems(), items);
	
	}
	
	@Test
	void test3() {
	
		ArrayList<Item> items = new ArrayList<>();
		items.add(new ChickenBurger(2));
		items.add(new BeefBurger(3));
		items.add(new FrenchFries(5));
		items.add(new CocaColaDrink(10));
		
		order.setItems(items);
		assertEquals(order.getItems(), items);
	
	}
	
	@Test
	void test4() {
	
		ArrayList<Item> items = new ArrayList<>();
		items.add(new ChickenBurger(2));
		items.add(new BeefBurger(3));
		items.add(new FrenchFries(5));
		items.add(new CocaColaDrink(10));
		
		Order newOrder = new Order(items);
		// Final price..
		assertEquals(newOrder.getTotalPrice(), 66);
		
	}
	
	@Test
	void test5() {
	
		ArrayList<Item> items = new ArrayList<>();
		items.add(new ChickenBurger(8));
		
		Order newOrder = new Order(items);
		// Final price..
		assertEquals(newOrder.getTotalPrice(), 64);
		
	}

}

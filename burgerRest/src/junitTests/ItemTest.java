package junitTests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import burgerRest.Item;

class ItemTest {

	// Item Tests..
	// Checking constructor..
	@Test
	void test1() {
	
		Item item = new Item("Chicken", "DESP", 1, 2.0);
		assertEquals(item.getName(), "Chicken");
	
		item.setName("NEW NAME");
		assertEquals(item.getName(), "NEW NAME");
		assertNotEquals(item.getName(), "Chicken");
		
	}
	
	@Test
	void test2() {
	
		Item item = new Item("Chicken", "DESP", 1, 2.0);
		assertEquals(item.getDescription(), "DESP");
	
		item.setDescription("NEW DESP");
		assertEquals(item.getDescription(), "NEW DESP");
		assertNotEquals(item.getDescription(), "DESP");
		
	}
	
	@Test
	void test3() {
	
		Item item = new Item("Chicken", "DESP", 1, 2.0);
		assertEquals(item.getQuantity(), 1);
	
		item.setQuantity(7);
		assertEquals(item.getQuantity(), 7);
		assertNotEquals(item.getQuantity(), 1);
		
	}
	
	@Test
	void test4() {
	
		Item item = new Item("Chicken", "DESP", 1, 2.0);
		assertEquals(item.getPrice(), 2.0);
	
		item.setPrice(4.0);
		assertEquals(item.getPrice(), 4.0);
		assertNotEquals(item.getPrice(), 2.0);
		
	}

}

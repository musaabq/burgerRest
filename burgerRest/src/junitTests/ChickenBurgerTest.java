package junitTests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import burgerRest.ChickenBurger;

class ChickenBurgerTest {

	private ChickenBurger item = new ChickenBurger(4);
	
	@Test
	void test1() {
		
		assertEquals(item.getName(), "Chicken Burger $8");
		
	}
	
	@Test
	void test2() {
		
		assertEquals(item.getDescription(), "lettuce, tomato, topped with cheese, onions.");
		
	}
	
	@Test
	void test3() {
		
		assertEquals(item.getPrice(), 8);
		
	}
	
	@Test
	void test4() {
		
		assertEquals(item.getQuantity(), 4);
		
	}
	
	@Test
	void test5() {
		
		item.setQuantity(7);
		assertEquals(item.getQuantity(), 7);
		assertNotEquals(item.getQuantity(), 4);
		
	}

}

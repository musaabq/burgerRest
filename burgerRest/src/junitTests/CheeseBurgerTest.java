package junitTests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import burgerRest.CheeseBurger;

class CheeseBurgerTest {

	private CheeseBurger item = new CheeseBurger(3);
	
	@Test
	void test1() {
		
		assertEquals(item.getName(), "Cheese Burger $5");
		
	}
	
	@Test
	void test2() {
		
		assertEquals(item.getDescription(), "Burger with double cheese");
		
	}
	
	@Test
	void test3() {
		
		assertEquals(item.getPrice(), 5);
		
	}
	
	@Test
	void test4() {
		
		assertEquals(item.getQuantity(), 3);
		
	}
	
	@Test
	void test5() {
		
		item.setQuantity(7);
		assertEquals(item.getQuantity(), 7);
		assertNotEquals(item.getQuantity(), 3);
		
	}

}

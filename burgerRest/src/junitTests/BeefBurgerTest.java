package junitTests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import burgerRest.BeefBurger;

class BeefBurgerTest {

	private BeefBurger item = new BeefBurger(5);
	
	@Test
	void test1() {
		
		assertEquals(item.getName(), "Beef Burger $10");
		
	}
	
	@Test
	void test2() {
		
		assertEquals(item.getDescription(), "topped with slivered onions, "
				+ " pickles and two slices of cheese on a sesame seed bun");
		
	}
	
	@Test
	void test3() {
		
		assertEquals(item.getPrice(), 10);
		
	}
	
	@Test
	void test4() {
		
		assertEquals(item.getQuantity(), 5);
		
	}
	
	@Test
	void test5() {
		
		item.setQuantity(7);
		assertEquals(item.getQuantity(), 7);
		assertNotEquals(item.getQuantity(), 5);
		
	}

}

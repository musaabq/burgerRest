package junitTests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import burgerRest.FrenchFries;

class FrenchFriesTest {

	private FrenchFries item = new FrenchFries(3);
	
	@Test
	void test1() {
		
		assertEquals(item.getName(), "FrenchFries $2");
		
	}
	
	@Test
	void test2() {
		
		assertEquals(item.getDescription(), "Straight french fries with ketchup");
		
	}
	
	@Test
	void test3() {
		
		assertEquals(item.getPrice(), 2);
		
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

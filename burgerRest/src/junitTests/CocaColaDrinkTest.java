package junitTests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import burgerRest.CocaColaDrink;

class CocaColaDrinkTest {

	private CocaColaDrink item = new CocaColaDrink(9);
	
	@Test
	void test1() {
		
		assertEquals(item.getName(), "Coca Cola Drink $1");
		
	}
	
	@Test
	void test2() {
		
		assertEquals(item.getDescription(), "1 litre bottle of coca cola drink");
		
	}
	
	@Test
	void test3() {
		
		assertEquals(item.getPrice(), 1);
		
	}
	
	@Test
	void test4() {
		
		assertEquals(item.getQuantity(), 9);
		
	}
	
	@Test
	void test5() {
		
		item.setQuantity(7);
		assertEquals(item.getQuantity(), 7);
		assertNotEquals(item.getQuantity(), 9);
		
	}

}

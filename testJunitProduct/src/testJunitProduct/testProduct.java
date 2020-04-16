package testJunitProduct;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testProduct {

	Product prod1 = new Product("Computer", 2, 60);
	
	@Test
	void testGetterWeight() {
		
		double expectedResult = 2;
		double realResult = prod1.getWeight();
		
		assertEquals(expectedResult, realResult);
		
	}
	
	@Test
	void testSetterWeight() {
		
		prod1.setWeight(4.5);
		
		double expectedResult = 4.5;
		double realResult = prod1.getWeight();
		
		assertEquals(expectedResult, realResult);
		
	}
	
	@Test
	void testGetterName() {
		
		String expectedResult = "Computer";
		String realResutl = prod1.getName();
		
		assertEquals(expectedResult, realResutl);
	
	}
	
	@Test
	void testSetterName() {
		
		prod1.setName("Notebook");
		
		String expectedResult = "Notebook";
		String realResult = prod1.getName();
		
		assertEquals(expectedResult, realResult);
	}
	
	
}

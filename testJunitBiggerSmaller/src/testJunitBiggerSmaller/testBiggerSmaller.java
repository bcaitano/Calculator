package testJunitBiggerSmaller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testBiggerSmaller {

	int num1 = -20, num2 = -5, num3 = 15;
	
	@Test
	void testBigger() {
		
		int expectedResult = 15;
		int realResult = BiggerSmaller.bigger(num1, num2, num3);
		
		assertEquals(expectedResult, realResult);
		
	}
	
	@Test
	void testSmaller() {
		
		int expectedResult = -20;
		int realResult = BiggerSmaller.smaller(num1, num2, num3);
		
		assertEquals(expectedResult, realResult);
		
	}

}

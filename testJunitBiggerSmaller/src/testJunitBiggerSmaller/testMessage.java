package testJunitBiggerSmaller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testMessage {

	@Test
	void testBigger() {
		
		int expectedResult = 15;
		int realResult = BiggerSmaller.bigger(60, 65, 48);
		
		assertEquals(expectedResult, realResult);
		
	}
}

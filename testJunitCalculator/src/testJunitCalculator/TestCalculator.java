package testJunitCalculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TestCalculator {
	
	Calculator calc = new Calculator();
	
	@Test
	public void testSomar() {
		
		double num1 = 5;
		double num2 = 2;
		
		int expectedResult = 7; 
		double realResult = Calculator.somar(num1, num2);
		
		assertEquals(expectedResult, realResult);
	}
	
	
	@Test
	public void testDiminuir() {
		
		int num1 = -9, num2 = 5;
		
		int expectedResult = 14;
		double realResult = calc.diminuir(num2, num1);
		
		assertEquals(expectedResult, realResult);
	}
	
	@Test
	public void testMultiplicar() {
		
		int num1 = 5, num2 = 2;
		
		double expectedResult = 10;
		double realResult = calc.multiplicar(num1, num2);
		
		assertEquals(expectedResult, realResult);
		
	}
	
	@Test
	public void testDividir() {
		
		double num1, num2;
		
		double expectedResult = 0.5;
		double realResult = Calculator.dividir(num2 = 2, num1 = 4);
		
		assertEquals(expectedResult, realResult);
		
	}
	
}

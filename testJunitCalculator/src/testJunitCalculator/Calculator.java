package testJunitCalculator;

public class Calculator {
	
	//attributes
	private static double result;
	
	
	public static double somar(double num1, double num2) {
		return num1 + num2;
	}
	
	public double diminuir(double num1, double num2) {
		if(num1 > num2) {
			result = num1 - num2;
		}else {
			result = num2 - num1;
		}
		return result;
	}
	
	public double multiplicar(int num1, int num2) {
		result = num1 * num2;
		return result;
	}
	
	public static double dividir(double num1, double num2) {
		result = num1 / num2;
		return result;
	}
}

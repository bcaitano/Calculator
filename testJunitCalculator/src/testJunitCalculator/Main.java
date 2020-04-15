package testJunitCalculator;

public class Main {

	public static void main(String[] args) {
		
		
		double num1 = 5, num2 = 2;

		int num3 = 5, num4 = 2;
		
		Calculator calc = new Calculator();
		
		
		System.out.println("A soma dos números é: " + Calculator.somar(num1, num2));
		System.out.println("A subtração dos números é: " + calc.diminuir(num2, num1));
		System.out.println("A multiplicação dos números é: " + calc.multiplicar(num3, num4));
		System.out.println("A divisão dos números é: " + Calculator.dividir(num2, num1));
	}

}

package testJunitCalculator;

public class Main {

	public static void main(String[] args) {
		
		
		double num1 = 5, num2 = 2;

		int num3 = 5, num4 = 2;
		
		Calculator calc = new Calculator();
		
		
		System.out.println("A soma dos n�meros �: " + Calculator.somar(num1, num2));
		System.out.println("A subtra��o dos n�meros �: " + calc.diminuir(num2, num1));
		System.out.println("A multiplica��o dos n�meros �: " + calc.multiplicar(num3, num4));
		System.out.println("A divis�o dos n�meros �: " + Calculator.dividir(num2, num1));
	}

}

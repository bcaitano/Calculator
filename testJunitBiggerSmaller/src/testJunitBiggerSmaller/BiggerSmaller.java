package testJunitBiggerSmaller;

public class BiggerSmaller {
	
	//Attributes
	private int num1, num2, num3;
	
	//Methods
	public static int bigger (int num1, int num2, int num3) {
		
		int biggerResult = 0;
		
		if( num1 > num2 ) {
			
			if( num1 > num3 ) {
				biggerResult = num1;
			}
			
		}else if( num2 > num3) {
			
			biggerResult = num2;
		
		}else {
			
			biggerResult = num3;
		
		}
		
		System.out.println("O maior número é: " + biggerResult);
		
		return biggerResult;
	}
	
	
	public static int smaller(int num1, int num2, int num3) {
		
		int smallerResult = 0;
		
		if( num1 < num2 ) {
			
			if( num1 < num3 ) {
				smallerResult = num1;
			}
			
		}else if( num2 < num3) {
			
			smallerResult = num2;
		
		}else {
			
			smallerResult = num3;
		
		}
		
		System.out.println("O menor número é: " + smallerResult);
		
		return smallerResult;
	}
	
}

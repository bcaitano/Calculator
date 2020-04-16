package testJunitProduct;

public class Main {

	public static void main(String[] args) {
		
		Product prod1 = new Product("Computer", 2.0, 60);
		
		System.out.println(prod1.getHeight() + prod1.getName() + prod1.getWeight());
		
	}

}

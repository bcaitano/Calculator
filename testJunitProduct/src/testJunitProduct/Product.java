package testJunitProduct;

public class Product {
	
	//Attributes
	private double weight;
	private double height;
	private String name;
	
	//Constructor
	public Product(String name, double weight, double height) {
		this.name = name;
		this.weight = weight;
		this.height = height; 
	}
	
	//Getters and Setters
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
}

package ClassTest;



class Product{
	private int productId;
	private String name;
	private double price;
	
	
	public Product(int productId, String name, double price) {
		super();
		this.productId = productId;
		this.name = name;
		this.price = price;
	}


	public int getProductId() {
		return productId;
	}


	public void setProductId(int productId) {
		this.productId = productId;
	}
	
	public void displaydetails() {
		System.out.println("the productID:"+this.productId);
		System.out.println("the name: "+this.name);
		System.out.println("price is: "+this.price);
	}
	
}

class Electronic extends Product{
	private String brand;
	private String model;
	
	public Electronic(int productId, String name, double price, String brand, String model) {
		super(productId, name, price);
		this.brand = brand;
		this.model = model;
	}	
	
	public void display() {
		super.displaydetails();
		System.out.println("The brand: "+brand);
		System.out.println("The model: "+model);
	}
}

class Clothing extends Product{
	private String size;
	private String color;
	
	public Clothing(int productId, String name, double price, String size, String color) {
		super(productId, name, price);
		this.size = size;
		this.color = color;
	}
	
	public void display() {
		super.displaydetails();
		System.out.println("the size: "+size);
		System.out.println("the color: "+color);
	}
	
}
public class ShoppingCart {

	public static void main(String[] args) {
		
		Clothing  c1=new Clothing(1000, "frock", 200, "medium", "blue");
		Electronic e1=new Electronic(2001, "ssss", 500, "mmmm", "ooo");
		
		System.out.println("clothing details:");
		c1.display();
		System.out.println("\nElectronic details:");
		e1.display();
	}

}

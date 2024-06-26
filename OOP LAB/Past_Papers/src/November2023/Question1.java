package November2023;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Order{
	private int orderID;
	private String customer_name;
	private String order_date;
	Queue<Product> myList=new LinkedList<>();
	
	public Order() {
		
	}
	
	public Order(int orderID, String customer_name, String order_date) {
		
		this.orderID = orderID;
		this.customer_name = customer_name;
		this.order_date = order_date;
		
	}
	
	public void AddProduct(Product p) {
		myList.add(p);
	}
	
	public void ProcessOrder() {
		System.out.println("orderId:"+orderID);
		System.out.println("Customer name:"+customer_name);
		System.out.println("order date:"+order_date);
		for(Product product:myList) {
			product.Display();
		}
	}
}

class Product{
	private int ProductID;
	private String name;
	private double price;
	private int stock;
	
	public Product() {

	}

	public Product(int productID, String name, double price, int stock) {
		this.ProductID = productID;
		this.name = name;
		this.price = price;
		this.stock = stock;
	}
	
	public void Read() {
		Scanner myScanner=new Scanner(System.in);
		
		System.out.println("Enter ProductID:");
		this.ProductID=myScanner.nextInt();
		System.out.println("Enter the product name:");
		this.name=myScanner.next();
		System.out.println("Enter the price of the product:");
		this.price=myScanner.nextDouble();
		System.out.println("Enter the stock quantity");
		this.stock=myScanner.nextInt();
		}
	public void Display() {
		System.out.println("ProductId:"+ProductID+"\nName"+name+"\nprice:"+price+"\nStock quantity"+stock);
	}

	public int getProductID() {
		return ProductID;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public int getStock() {
		return stock;
	}
	
	
}

public class Question1 {

	public static void main(String[] args) {
		Order o1=new Order(101,"kamal","2024.05.06");
		Order o2=new Order(102,"Amal","2024.06.06");
		Product p1=new Product();
		p1.Read();
		Product p2=new Product();
		p2.Read();
		
		o1.AddProduct(p1);
		o1.AddProduct(p2);
		
		o1.ProcessOrder();
		o2.ProcessOrder();

	}

}

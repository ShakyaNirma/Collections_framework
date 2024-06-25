package Polymorphism;

public class Circle extends Shape {
	//this will run when the obj of circle is created
	//hence it is overriding the parent method
	@Override //this is called annotation

	public void area() {
		System.out.println("area is pi*r*r");
		
	}
}

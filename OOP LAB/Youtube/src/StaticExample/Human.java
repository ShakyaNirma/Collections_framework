package StaticExample;

public class Human {
	int age;
	String name;
	int salary;
	boolean married;
	static long population;

	static void message() {
		System.out.println("hello world");
		//System.out.println(this.name); not possible
		//bcz we are not with objects
		//in static can not use this keyword
		
	}
	public Human(int age, String name, int salary, boolean married) {
		super();
		this.age = age;
		this.name = name;
		this.salary = salary;
		this.married = married;
		//this.population +=1;can not use need to use class name//
		Human.population +=1;
		//this.message(); also not use bcz this is also static method
		Human.message();
	}
	/*static are not depend on objects
	 *main class is the best example for static
	 *bcz it need to run first
	 *static variables and methods are belongs to the class not the object */
	
	
}

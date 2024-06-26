package abstarct;

public abstract class Parent {
	int age;//can be have properties and it also can call in child classes too
	
	final int VALUE;//final variables are okay to have
	//but final abstract class is not okay
	//eg: final public abstract class parent
	
	public Parent(int age) {
		this.age=age;
		VALUE=11111;
	}
	
	//abstract Parent() cannot create abstract constructors
	
	abstract void career (String name);
	abstract void partner (String name,int age);
	
	//cannot create abstract static methods 
	
	static void hello() {
		System.out.println("Hey");
	}
}

package abstarct;

public class son extends Parent {
	public son(int age) {
		super(age);
		
		
	}
	
	@Override
	void career(String name) {
		System.out.println("I am going to be a "+ name);
	}
	
	@Override
	void partner(String name,int age) {
		System.out.println("i love"+ name +" she is " + age);
}
}

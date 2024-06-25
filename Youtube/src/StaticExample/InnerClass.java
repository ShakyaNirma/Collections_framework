package StaticExample;

public class InnerClass {//outside class can not be static
	class Test{//only inner class can be static
		String name;
		
		public Test(String name) {
			this.name=name;
		}
		
	}
	public static void main (String [] args) {
		Test a=new Test("shakya");
		Test b=new Test("Amal");
		//this show error class is not static
		//if we remove inner class then it is okay
		//so solution is test class create as a static
		//when create as static then the test class is not depend on object of inner class
		
		
		//in here test class s dependent on inner class so that is why we cannot use
		//when test class get out from the inner class it is okay
		
		/*class Test{
		String name;
		
		public Test(String name) {
			this.name=name;
		}
		public class InnerClass {
		}
		public static void main (String [] args) {
		Test a=new Test("shakya");
		Test b=new Test("Amal");
		
		*
		*
		*
		*
		*public class InnerClass {
		public static class Test{
			String name;
		
			public Test(String name) {
			this.name=name;
			}
		
		}
	public static void main (String [] args) {
		Test a=new Test("shakya");
		Test b=new Test("Amal");
		System.out.println("a.name");
		System.out.println(b.name);
		in here we are get the output as shakya and amal so how can this be
		when we considering static we want know where it is as static
		this test class is inside a class but it is static hence
		it is not depend on objects of  inner class 
		this is bcz now the test class and the main class can instances of each other
		statics are execute at compile time and it is at class level*/
	}

}

package StaticExample;

//this is to show initialization of static variables
public class Static2 {
	static int a=4;
	static int b;
	
	//will only run once ,when the first obj is create such that when the class
	//is loaded for the first time
	static {
		System.out.println("I am in static block");
		b=a*5;
	}
	
	public static void main(String [] args) {
		Static2 obj=new Static2();
		System.out.println(Static2.a+"  "+Static2.b);
		
		Static2.b+=3;
		
		System.out.println(Static2.a+"  "+Static2.b);
		
		Static2 obj2=new Static2();
		System.out.println(Static2.a+" "+Static2.b);
		
	}
}

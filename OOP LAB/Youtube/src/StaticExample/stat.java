package StaticExample;



public class stat {

	public static void main(String[] args) {
		//greeting(); show a error see what
		 stat obj=new stat();
		 obj.greeting();
		}

	 public void greeting() {
			System.out.println("helloooo");
		}
	 public void fun1() {
		 greeting();//this is okay
	}
	 public static void fun2() {
		 //greeting();this also same show a error
	 }
	 public static void greeting2() {
		 System.out.println("hello");
	 }
	 public static void fun3() {
		 greeting2();//this is okay bcz both are static
	 }
	 /*public static void fun4() {
		 stat obj=new stat();
		 obj.greeting();*/
	 }



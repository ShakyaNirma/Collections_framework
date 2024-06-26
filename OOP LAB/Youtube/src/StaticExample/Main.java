package StaticExample;

import oop_1.Greeting;

public class Main {

	public static void main(String[] args) {
		//if we not declare following objects also we can use static
		Human shakya=new Human(25,"shakya nirmani",100000,false);
		Human amal=new Human(30,"amal menuka",2000000,false);
		Human nimal=new Human(30,"nimal menuka",2000000,false);
		
		
		/*System.out.println(shakya.population);
		System.out.println(amal.population);
		System.out.println(nimal.population);do not use this bcz if static we need to call
		by using the class name*/
		
		
		System.out.println(Human.population);
		System.out.println(Human.population);
		System.out.println(Human.population);
		
		
		
		//assume all the above code is not here
		//then ,
		
		
		/*static Void fun() {//this is not dependent on object
			Greeting();//can not use this bcz it requires an instance
			but the function you are using it in it in does not depend on instances

		}
		
		something which is not static,belongs to an object
		Void greeting() {
			System.out.println("hello");
		}
		
		static Void fun()
		Main.Greeting(); this is also not work
		
		Void greeting() {
		  fun();
			System.out.println("hello");  this is possible
		
		static Void fun(){
		  Main obj=new Main();
		  obj.Greeting(); this is work, cannot access non static
		  stuff without referencing their instance in a static
		  context. simply if not static we need a object thats it

		
		Void fun2(){
		 greeting()
		}   in here both are non static so they can keep like this
		 */

}

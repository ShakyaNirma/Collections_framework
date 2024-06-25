package set;

import java.util.LinkedHashSet;
import  java.util.Set;

public class pex1 {

	public static void main(String[] args) {
	Set<person> set=new LinkedHashSet<>();
		set.add(new person(10));
		set.add(new person(20));
		set.add(new person(30));
		set.add(new person(40));
		set.add(new person(50));
		set.add(new person(10));
		set.add(new person(20));
		set.add(new person(30));
		set.add(new person(50));
		
		
		for(person value:set) {
			System.out.println("your age is:"+value);
			//in here duplicates are printed 
			//print in inserted order
			//to remove duplicates we need to implement other 2 methods in person class
			//they are equals and hashcode
			//both remove the duplicates need both together as well
		}
	}

}

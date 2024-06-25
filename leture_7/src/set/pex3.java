package set;

import java.util.TreeSet;
import  java.util.SortedSet;

public class pex3{

	public static void main(String[] args) {
	SortedSet<person> set=new TreeSet<>();
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
		}
		//this shows error
		//to make this ascending order there is a interface
		//comparable
	}
}
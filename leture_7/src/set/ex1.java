package set;

import java.util.LinkedHashSet;
import  java.util.Set;

public class ex1 {

	public static void main(String[] args) {
	Set<Integer> set=new LinkedHashSet<Integer>();
		set.add(10);
		set.add(70);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(10);
		set.add(10);
		set.add(20);
		set.add(56);
		
		
		for(Integer value:set) {
			System.out.println(value);
			//in here duplicates are not printed 
			//print in inserted order
		}
	}

}

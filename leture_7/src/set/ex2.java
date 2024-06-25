package set;

import java.util.HashSet;
import  java.util.Set;

public class ex2 {

	public static void main(String[] args) {
	Set<Integer> set=new HashSet<Integer>();
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
		}
		//not maintain inserted order
		//not print duplicates also
	}

}
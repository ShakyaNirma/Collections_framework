package set;

import java.util.TreeSet;
import  java.util.SortedSet;

public class ex3 {

	public static void main(String[] args) {
	SortedSet<Integer> set=new TreeSet<Integer>();//here we use sortedset
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
		//maintain ascending order
		//not print duplicates also
	}

}
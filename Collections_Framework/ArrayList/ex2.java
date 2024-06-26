package ArrayList;

import java.util.List;
import java.util.ArrayList;

public class ex2 {
public static void main(String []args) {
	List<Integer> list=new ArrayList<Integer>();//here reference is list and object in arraylist
	list.add(10);
	list.add(20);
	list.add(30);
	list.add(40);
	list.add(50);
	
	int total=0;
	for(Integer value:list) {
		total+=value;
		System.out.println("value is: "+value);
	}
	System.out.println("total is:"+total);
}
}

                                                package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;


public class Ex1 {

	public static void main(String[] args) {
		ArrayList marks=new ArrayList ();
		marks.add(80);
		marks.add(70);
		marks.add(60);
		marks.add(50);
		marks.add(40);
		//for(int i=0;i<marks.size();i++)
		//{
		//	System.out.println(marks.get(i));
		//}
		
		int total=0;
		//following is enhanced for loop
		for (Object value:marks) {
			total+=(Integer)value;
			System.out.println(value);
		}
		double avg=total/marks.size();
	    System.out.println(avg);
	    
	//if add string type here for marks then we cannot find the average
	    //so when create a arraylist we need to give data type
	    //then we canot add string values to marks arraylist
	    
/* ArrayList<Integer>  marks=new ArrayList<Integer> (); 
 * for (Integer value:marks) */
		
		Iterator <Integer> iterator=marks.iterator();
		while(iterator.hasNext() ) {
			System.out.println("value is "+iterator.next());
		}
		 Object[] array = marks.toArray();
	        for (Object element : array) {
	            System.out.println(element);
	        }
	}

	}

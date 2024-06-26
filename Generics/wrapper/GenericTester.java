package wrapper;

import java.util.ArrayList;
import java.util.List;
//insted of Box can use MyMap
class Box<T,S>{//if we convert this in to map here use <K,V>
	private T t;//K k
	private S s;//V v
	
	public void add(T t,S s) {//push(K k,V v)
		this.t=t;//k=k
		this.s=s;//v=v
	}
	
	public T getFirst() {// K getKey(){
		return t;//k
	}
	
	public S getSecond() { //V getValue(){
		return s;
	}
}
public class GenericTester {

	public static void main(String[] args) {
						//instead of box use MyMap
		Box<Integer,String> box=new Box<Integer,String>();
		box.add(1111,"box1");
		System.out.printf("Integer value: %d\n", box.getFirst() );
		System.out.printf("String value :%s\n", box.getSecond());
		
		Box<String,String> box1=new Box<String,String>();
		box1.add("Height","Width");
		System.out.printf("string value: %s\n", box1.getFirst() );
		System.out.printf("String value :%s\n", box1.getSecond());
		
		Box<Integer,List<String> >boxList=new Box<Integer,List<String>>();
		List<String>messages=new ArrayList<String>();
		
		messages.add("Length");
		messages.add("width");
		messages.add("Height");
	
		
		boxList.add(20,messages);
		System.out.printf("integer value: %d\n", boxList.getFirst() );
		System.out.printf("String value :%s\n", boxList.getSecond());
		
	}

}

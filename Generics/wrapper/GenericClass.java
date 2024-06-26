package wrapper;

class MyGen<T> {
	T t;
	
	void add(T t) {
		this.t=t;
	}
	public T getValue() {
		return this.t;
	}
}

public class GenericClass {

	public static void main(String[] args) {
		MyGen <String> myGenString = new MyGen<String>();
		myGenString.add("aaaaaa");
		myGenString.add("bbbbbbb");
		myGenString.add("ccccccc");
		myGenString.add("ddddddd");
		System.out.println(myGenString.getValue()); 
		
		MyGen<Integer> myGenInt = new MyGen<Integer>();
		myGenInt.add(10);
		myGenInt.add(20);
		myGenInt.add(30);
		System.out.println(myGenInt.getValue());
		
			
		}
}

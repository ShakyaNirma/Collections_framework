package oop_2;

public class A {
	protected int num;
	String nameString;
	int []arr;
	
	public A(int num, String nameString) {
		super();
		this.num = num;
		this.nameString = nameString;
		this.arr =new int[num];
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	
	
	
}

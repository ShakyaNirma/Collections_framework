package Self_Study;

import java.util.Scanner;

public class staticPractise {
	private String name;
	private int age;
	private static int batchId;
	

	public staticPractise(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	
	public String getName() {
		return name;
	}


	public int getAge() {
		return age;
	}


	public static int getBatchId() {
		return batchId;
	}
	public static void setBatchId(int batchId) {
		staticPractise.batchId = batchId;
	}
	
	
}

class Main{
	public static void main() {
	staticPractise s1=new staticPractise("Amal", 12);
	s1.setBatchId(3);
	
	System.out.println("Student name:"+s1.getName()+"\nAge is:"+s1.getAge()+"Batch id is:"+staticPractise.getBatchId());
	
	}
}

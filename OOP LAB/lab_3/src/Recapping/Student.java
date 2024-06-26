package Recapping;



class StudentDetails{
	int age;
	String nameString;
	
	public int getAge() {
		return age;
	}

	public String getNameString() {
		return nameString;
	}

	public StudentDetails(int age, String nameString) {
		super();
		this.age = age;
		this.nameString = nameString;
	}
	
}
public class Student {
public static void main() {
	StudentDetails s1=new StudentDetails(6, "Kamal");
	System.out.println("name is:"+s1.getNameString()+"age is:"+s1.getAge());
}
	
}
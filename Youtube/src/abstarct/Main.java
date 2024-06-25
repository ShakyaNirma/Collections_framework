package abstarct;

public class Main {
	public static void main(String []args) {
	son s1=new son(30);
	s1.career("doctor");
	
	Daughter d1=new Daughter(25);
	d1.career("coder");
	
	
	//Parent mom =new Parent(48); can not create objects of abstract class
	//when creating object when calling career it will show a error
	//bcz it has not content
	
	Parent.hello();
	
	//can use as a reference variables
	//eg: Parent d1=new Daughter(20);
}
}

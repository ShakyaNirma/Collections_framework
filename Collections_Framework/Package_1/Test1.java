package Package_1;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1= new Student();
		s1.setName("manel");
		s1.setDitno(111);
		s1.setAddress("kandy");
		
		Student s2= new Student();
		s2.setName("sunil");
		s2.setDitno(222);
		s2.setAddress("colombo");
		
		System.out.println("name:"+	s1.getName()+"\n"+"id is:"+s1.getDitno()+"\n"+"adress:"+s1.getAddress()+"\n");
		System.out.println("name:"+	s2.getName()+"\n"+"id is:"+s2.getDitno()+"\n"+"adress:"+s2.getAddress());
		
	}	
}

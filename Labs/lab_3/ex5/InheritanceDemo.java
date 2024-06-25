package ex5;

public class InheritanceDemo {

	public static void main(String[] args) {
		Person p1=new Person("Nimal","Rathnapura");
		p1.showDetails();
		
		StudentInherit s1=new StudentInherit("Sunimal","Anuradhapura","111");
		s1.showDetails();
		
		PartTimeStudent prts=new PartTimeStudent("kamak","kandy","2222",5);
		prts.showDetails();
	}

}

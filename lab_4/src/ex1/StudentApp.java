package ex1;

public class StudentApp {
	public static void main(String [] args) {
		Student[]students=new Student[5];
		
		students[0]=new Student("anne","cs","071999882");
		students[1]=new Student("peter","ds","0778965482");
		students[2]=new Student("Alice","it","071999882");
		students[3]=new Student("lila","ne","071999882");
		students[4]=new Student("john","cyber","071999882");
		
		for(Student student:students) {
			student.print();
			System.out.println();
		}
	}

}

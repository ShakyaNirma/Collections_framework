package ClassTest;

public class EmpApp {

	public static void main(String[] args) {
		PartTimeEmployee emp1=new PartTimeEmployee("Alice", 200000.00, 7);
		PartTimeEmployee emp2=new PartTimeEmployee("Leesa", 300000.00, 9);
	
		System.out.println("Employee 1 details:");
		emp1.displayEmpInfo();
		System.out.println("\nEmployee 2 details: ");
		emp2.displayEmpInfo();
	
	}

}

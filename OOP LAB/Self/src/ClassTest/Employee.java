package ClassTest;

public class Employee {
	protected String name;
	protected double salary;
	
	public Employee(String name,double salary){
		this.name=name;
		this.salary=salary;
	}
	
	

	public void desplayInfo (){
		System.out.println("Employee's name is:"+name+"\nSalary is:"+salary);
	}

}

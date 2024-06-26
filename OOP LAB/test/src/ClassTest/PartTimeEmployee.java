package ClassTest;



public class PartTimeEmployee extends Employee{
	private int OTHrs;
	
	public PartTimeEmployee(String name,double salary,int OTHrs) {
		super(name, salary);
		this.OTHrs=OTHrs;
	}
		
	public void displayEmpInfo() {
		super.desplayInfo();
		System.out.println("OT hours are:"+OTHrs);
	
	}

}

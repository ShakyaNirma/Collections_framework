package ex5;

public class PartTimeStudent extends StudentInherit {
int workingHours;
	public PartTimeStudent(String newname, String newadd, String newstudentid,int hours) {
		super(newname,newadd,newstudentid);
		this.workingHours=hours;
		
	}
	
public void showDetails() {
	super.showDetails();
	System.out.println("part time hours are:"+workingHours);
}

}

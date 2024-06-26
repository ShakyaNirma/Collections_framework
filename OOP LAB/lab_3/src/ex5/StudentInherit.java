package ex5;

public class StudentInherit extends Person{
	String studentid;
public StudentInherit(String newname, String newadd, String newstudentid) {
		super(newname, newadd);
		this.studentid=newstudentid;
	}

public void showDetails() {
	super.showDetails();
	System.out.println("my id is: "+studentid);
}

/*public StudentInherit(int id) {
	this.studentid=id;
}*/


}

package ex1;

public class Student {
 String name;
 int ditno;
 String address;
/*public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getDitno() {
	return ditno;
}
public void setDitno(int ditno) {
	this.ditno = ditno;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}*/
 
 public Student(String sname,int sditno,String sadd) {
	 this.name=sname;
	 this.ditno=sditno;
	 this.address=sadd;
 }

public void display() {
	System.out.println("I am a student.");
	System.out.println("Name:"+this.name);
	System.out.println("DITNO:"+this.ditno);
	System.out.println("Address:"+this.address);
}


}

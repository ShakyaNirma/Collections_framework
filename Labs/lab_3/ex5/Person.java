package ex5;

public class Person {
 String name;
 String address;
 
 public Person(String pname, String padd) {
	 this.name=pname;
	 this.address=padd;
 }
 public void showDetails() {
	 System.out.println("Name:"+this.name);
	 System.out.println("Address:"+this.address);
 }
 //this can be print in one line also
}


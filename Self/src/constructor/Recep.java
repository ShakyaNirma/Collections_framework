package constructor;

public class Recep {
int id;
String name;
String telephone;
String feedback;
double amount;
public Recep() {
	System.out.println("Default constructor for recep class");
}
public Recep(int id, String name, String telephone, String feedback, double amount) {
	super();
	this.id = id;
	this.name = name;
	this.telephone = telephone;
	this.feedback = feedback;
	this.amount = amount;
	System.out.println("name is:"+this.name);
	System.out.println("Feedback is: "+this.feedback);
}



}

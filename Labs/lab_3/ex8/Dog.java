package ex8;

public class Dog extends pet{
	public int noOfMasters;
	
	Dog(String n, String o, int a, int m){
	super(n,o,a);
	this.noOfMasters=m;
	}
	
	Dog(String n, String o){
		super(n,o);
		this.noOfMasters=1;
	}
	
	public void showDetails() {
		super.showDetails();
		System.out.println(". Iam a dog. I have "+ this.noOfMasters+" masters at home.");
		}
}

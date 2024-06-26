 package Inheritence;

public class Main {
	public static void main (String [] args) {
		/*Box box1= new Box(4,6,5);
		Box box2= new Box(box1);//this is okay run the constructor old parameter with
		System.out.println(box1.l+" "+box1.h+" "+box1.w);*/
	
		
		BoxWeight box3=new BoxWeight();
		System.out.println(box3.h+" "+box3.weight);
		BoxWeight box4=new BoxWeight(2,3,4,5);
		
		
		
		
		Box box5=new BoxWeight(1,2,3,4);
		System.out.println(box5.w);
		
		
		
		//there are many variables in parent and child classes
		//you are given access to variables that are in the ref type i.e. Boxweight
		//hence,you should have access to weight variable
		//this also means that the ones you are trying to access should be initialize
		//but in here, when the obj itself is of type parent class,how will you call the constructor of child class
		//parent class have no idea about the weight that is the idea but child class has
		
		/*BoxWeight box6=new Box(1,2,3,4,) {
			System.out.println(box6);*/
		//above classes have not idea about below classes
		
		BoxPrice box=new BoxPrice();
		
		}
		
	}
	


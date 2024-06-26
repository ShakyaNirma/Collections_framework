package ex8;

public class Main {
	public static void main(String[] args){ 
		
		pet p = new pet("Lissie","Smith",3); 
		p.showDetails(); 
		cat c = new cat("Kyan", "Silva", 4, 4); 
		c.showDetails(); 
		
		p.showDetails();
		c.showDetails();
		
		Dog d1=new Dog("fify","amal",6,4);
		d1.showDetails();
		
		System.out.println("*********************");
		pet p3=c;
		p3.showDetails();
		} 

	
	
	}//end of the demo class



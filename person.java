package Self_Study;                                                                                   
                                                                                                      
public class person {                                                                                 
	int age=20;                                                                                       
	String name="Anne";                                                                               
	                                                                                                  
	public void dispalyPerson() {                                                                     
		System.out.println("this is a person");                                                       
		System.out.println("name is:"+this.name+"\nage is :"+super.age);                              
		                                                                                              
	}                                                                                                 
public class Employee extends person{                                                                 
		 int empid=0001;                                                                              
		 String designation="Manager";                                                                
		                                                                                              
		 public void displayEmployee() {                                                              
			 System.out.println("employee id id:"+this.empid+"\ndesignation is:"+this.designation);   
		 }                                                                                            
	 }                                                                                                
public class InheritenceNew{                                                                          
	 public static void main(String []args) {                                                         
		 person p=new person();                                                                       
		 p.dispalyPerson();                                                                           
		                                                                                              
		                                                                                              
	 }                                                                                                
	 }                                                                                                
}                                                                                                     
                                                                                                      
                                                                                                      
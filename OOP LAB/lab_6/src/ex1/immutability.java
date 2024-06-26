package ex1;

public class immutability {
 public static void main(String []args) {
	String str="Hello";
	System.out.println("Using string Literal "+str);
	
	char arr1[]= {'H','e','l','l','o'}; 
	str= new String(arr1);
	System.out.println("Using an array of char "+str);
	
	String string="Hello";
	str=new String ("Using another String object "+str);
	System.out.println(str);
	
	str.concat("World");
	System.out.println(str);//not change same output as previous
	
	str.replace('H', 'h');
	System.out.println(str);//not change same output as previous
// because String are immutable that means cannot change
	
	//Fix that issue
	str=str.concat(" World");
	System.out.println(str);
	
	str=str.replace('H', 'h');
	System.out.println(str);
}
}

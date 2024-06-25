package ex2;

public class StringBuilderQuestion {
	

	public static void main(String [] args) {

		//create string builder object
		StringBuilderQuestion sb = new StringBuilderQuestion("Hello");
		System.out.println(sb);
		
	    bq.sb.append(" World");
		System.out.println(sb);//expected output: Hello World
		//value of sb= Hello World
	
		sb.delet(0,6);
		System.out.println(sb);
		//value of sb=World
		
		sb.insert(0,"Hi");
		System.out.println(sb);
		//value of sb=HiWorld
		
		sb.replace(0,2,"Hello");
		System.out.println(sb);
	}

}

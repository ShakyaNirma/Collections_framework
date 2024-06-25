package ClassTest;

import java.util.Scanner;
class MathOperations{
	private int number;
	private int range;
	private static int i=1;
	private static int factorial=1;
	
	public void drawMultiplicationTable(int number,int range) {
		this.number=number;
		this.range=range;
		System.out.println("Draw multiplication table for given number and range");
		while(i<=range) {
			System.out.println(number+"*"+i+"="+number*i);
			i++;
		}
		System.out.println("\n");
	}
	
	public int factorial(int num){
		if (num<0) {
			System.out.println("Enter a posistive number!");
		}
		else {
			for(i=1;i<=num;++i) {
				factorial=factorial*i;
				
	 		}
			return factorial;
		}
		return -1;
	}
	
	
}
public class MathApp {

	public static void main(String[] args) {
		Scanner myScanner =new Scanner(System.in);
		System.out.println("Enter number: ");
		int number=myScanner.nextInt();
		System.out.println("Enter the range: ");
		int range=myScanner.nextInt();
		
		MathOperations math1=new MathOperations();
		math1.drawMultiplicationTable(number,range);
		
		System.out.println("Enter a number to find factorial:");
		int num=myScanner.nextInt();
		int result=math1.factorial(num);
		if (result!=-1) {
			System.out.println("Factorial of "+num+"is:"+result);
		}

	}

}

import java.util.Scanner;
public class Lab2ex3{
	public static void main(String [] args){
	Scanner myScan= new Scanner(System.in);
	double volume;
	System.out.println("enter length: ");
		int length=myScan.nextInt();
	System.out.println("enter width: ");
		int width=myScan.nextInt();
	System.out.println("enter height: ");
		int height=myScan.nextInt();
	volume=length*width*height;	
	System.out.println("volume of cube is:"+volume );
}
}
		
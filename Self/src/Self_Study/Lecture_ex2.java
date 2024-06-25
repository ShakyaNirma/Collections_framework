package Self_Study;
import java.util.Scanner;
public class Lecture_ex2 {

	public static void main(String[] args) {
	try(Scanner scan= new Scanner(System.in)){;
	double length;
	double width;
	
	System.out.println("enter length");
	length=scan.nextInt();
	System.out.println("enter width");
	width=scan.nextInt();
	System.out.println("perimeter is:"+(2*length+2*width));

	}
	}
}

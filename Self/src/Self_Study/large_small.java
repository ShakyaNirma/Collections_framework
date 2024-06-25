package Self_Study;
import java.util.Scanner;
public class large_small {

	public static void main(String[] args) {
		try(Scanner scan=new Scanner(System.in)){
		int no1,no2,no3;
		
		System.out.println("enter no 1:");
		no1=scan.nextInt();
		System.out.println("enter no 2:");
		no2=scan.nextInt();
		System.out.println("enter no 3:");
		no3=scan.nextInt();
		
		int max==no1;
		if(max>no2) {
			if(max>no3) {
				System.out.println("max number is:"+max);
			}
			else {
				System.out.println("max number is:"+no3);
			}
		if(no2>no3) {
			System.out.println("max number is:"+no2);
		}
		}
		

	}
	}

}

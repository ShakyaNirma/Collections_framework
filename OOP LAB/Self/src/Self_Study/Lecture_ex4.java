package Self_Study;
import java.util.Scanner;
public class Lecture_ex4 {

	public static void main(String[] args) {
		try(Scanner scan=new Scanner(System.in)){
		int count = 0,ocount=0;
		@SuppressWarnings("unused")
		int no;
			
			for(int i=0;i<10;i++)
			{
				System.out.println("enter number");
				no=scan.nextInt();
				if(no==0) {
					System.out.println("enter a value more than zero");
				}
				else {
				if(i%2==0)
				{
					 count=count+1;
				}
				else {
				    ocount=ocount+1;
				}
			}
			}
			
			System.out.println("number of even numbers are: "+count);
			System.out.println("number of even numbers are: "+ocount);
		}

	}

}

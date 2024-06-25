import java.util.Scanner;
public class Multi{
 public static void main(String[] args) {
	Scanner myScanner=new Scanner(System.in);
            System.out.println("enter a number: ");
		int num = myScanner.nextInt();
	   for(int i=1;i<11;i++){
		System.out.println(num+"*"+i+"="+(num*i));
    }
}
}

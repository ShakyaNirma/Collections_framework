import java.util.Scanner;
public class Product{
 public static void main(String[] args) {
	int num1;
	int num2;
	int product;
	Scanner myScanner=new Scanner(System.in);
            System.out.println("enter number1: ");
		num1 = myScanner.nextInt();
	    System.out.println("enter number2: ");
		num2 = myScanner.nextInt();
	product=num1*num2;
		System.out.println("product of 2 numbers: "+product);
    }
}

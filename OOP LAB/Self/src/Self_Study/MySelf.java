package Self_Study;
import java.util.Scanner;

@SuppressWarnings("unused")
public class MySelf {

	public static void main(String[] args) {
		String name;
		int age;
		String address;
		try (Scanner myscan = new Scanner(System.in)) {
			System.out.println("Enter your name:");
			name=myscan.next();
			System.out.println("Enter your age:");
			age=myscan.nextInt();
			System.out.println("Enter your address:");
			address=myscan.next();
		}
		System.out.println("your name:"+name);
		System.out.println("your age:"+age);
		System.out.println("your address:"+address);
	
	}

}

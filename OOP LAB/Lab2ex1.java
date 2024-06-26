import java.util.Scanner;
public class Lab2ex1{
 public static void main(String[] args) {
	Scanner myScanner=new Scanner(System.in);
	int miles=26;
	int yards=385;
	double kilometers;
	kilometers=(1.609*miles+(yards/1760)*1.06);
            System.out.println("number of kilometers are: "+kilometers);
	}
}
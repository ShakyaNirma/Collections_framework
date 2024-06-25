package wrapper;
import java.util.Arrays;
import java.util.List;
public class WildCards {

	public static double sum(List<? extends Number > numberList) {
		double sum=0.0;
		for(Number n : numberList) {
			sum+= n.doubleValue();
		}
		return sum;
	}
	public static void main(String[] args) {
		List <Integer>integerList= Arrays.osList(1,2,3);
		System.out.println("sum = "+sum(integerList));
		
		List <Double> doubleList= new Arrays.List(1.2,2.3,3.4);
		System.out.println("sum = "+sum(doubleList));
	} 

}

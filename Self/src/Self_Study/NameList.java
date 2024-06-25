package Self_Study;
import java.util.ArrayList;
public class NameList {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList <>();
		list.add("Amara");
		list.add("thmara");
		list.add("Nimara");
		list.add("Kamal");
		list.add("Amal");
		list.add("Nimal");
		
		for (String value: list) {
			System.out.println(value);
		}
	}

}

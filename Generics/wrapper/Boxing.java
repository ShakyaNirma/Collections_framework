package wrapper;

public class Boxing {
	public static void main(String [] args) {
		oldway();
		newWay();
	}
	
public static void oldway() {
	Integer wrapper =new Integer(10);
	System.out.println("Early "+wrapper);
	
	//unboxing
	int primitive=wrapper.intValue();
	primitive++;
	//boxing
	wrapper = Integer.valueOf(primitive);
	System.out.println("after "+wrapper);
}

public static void newWay() {
	Integer wrapper=new Integer(10);
	System.out.println("early is "+wrapper);
	wrapper++;
	System.out.println("after is "+wrapper);
}

}

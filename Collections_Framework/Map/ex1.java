package Map;
import java.util.HashMap;
import java.util.Map;

public class ex1 {
	public static void main(String[] args) {
	
	Map<Integer,String > hashmap =new HashMap <Integer, String>();//in here if use linkedhash then the entered order
	hashmap.put(10,"abc");
	hashmap.put(20,null);
	hashmap.put(30,null);
	hashmap.put(40,"def");
	hashmap.put(50,"ghi");
	hashmap.put(60,"jkl");
	hashmap.put(70,"lmn");
	
	for(Integer key: hashmap.keySet()){
	System.out.println(key +","+hashmap.get(key));
	}
	}
}

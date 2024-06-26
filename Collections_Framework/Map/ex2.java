package Map;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;


public class ex2 {
	public static void main(String[] args) {
		displayTreeMap();	
		}
public static SortedMap<Integer,String> displayTreeMap() {
	SortedMap<Integer,String > treemap =new TreeMap<>();
	treemap.put(10,"abc");
	treemap.put(20,null);
	treemap.put(30,null);
	treemap.put(40,"def");
	treemap.put(50,"ghi");
	treemap.put(60,"jkl");
	treemap.put(70,"lmn");
	
	for(Map.Entry<Integer,String > mapEntry: treemap.entrySet()){
	System.out.println(mapEntry.getKey() +","+mapEntry.getValue());
	}
	return treemap;
	//in here entry have 2 values as key and value
}
}

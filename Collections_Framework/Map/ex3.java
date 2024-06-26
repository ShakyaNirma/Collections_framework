package Map;
import java.util.Map;
import java.util.Hashtable;

public class ex3 {

	public static void main(String[] args) {
		displayHashTable();
	}
	public static void displayHashTable() {
		Map<String, String> hashTable=new Hashtable<String,String>();
		hashTable.put("key1","value1" );
		hashTable.put("key2","value2" );
		hashTable.put("key3","value3" );
		hashTable.put("key4","value3" );
		hashTable.put("key5","" );
		//hashTable.put("null","null" ); cannot have null
		
		
		for(Map.Entry<String,String>mapEntry :hashTable.entrySet()){
			System.out.println(mapEntry.getKey()+","+mapEntry.getValue());
		}
	}

}


package wrapper;

public class GenericMethod {
	
	public static <T> void printArray(T [] array){
		if (array.length != 0) {
			for(T t: array) {
			System.out.println(t+"");
		}
			System.out.println();
	}
	}

	public static void main(String[] args) {
		
		Integer [] intArray = {10,20,30,40,50};
		printArray(intArray);
		
		Double [] doubleArr= {1.12,2.34,4.56,7.98};
		printArray(doubleArr);
		
		Character [] chArray = {'A','B','c','D','e'};
		printArray(chArray);
		

	}

}

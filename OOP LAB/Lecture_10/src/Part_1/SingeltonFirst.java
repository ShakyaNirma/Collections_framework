 package Part_1;


class Singlenton{
	private static Singlenton instance=null;
	private Singlenton() {
		System.out.println("You create a singlenton object");
	}
	public static Singlenton getInstance() {
		if(instance==null) {
			instance=new Singlenton();
		}
		return instance;
	}
}


public class SingeltonFirst implements Runnable{

	public static void main(String[] args) {
		for(int i=0;i<10;i++) {
		Singlenton.getInstance();
	}

	}
	

}

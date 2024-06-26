package Part_1;

//thread safe singleton
class Singlenton1{
	private static Singlenton1 instance=null;
	private Singlenton1() {
		System.out.println("You create a singlenton object");
	}
	public static Singlenton1 getInstance() {//can use word synchronized after the public but not always suitable in many threads are in
		if(instance==null) {
			synchronized (Singlenton1.class) {//here use the same class name above
				if (instance==null) {
			instance=new Singlenton1();
				}
			}
		}
		return instance;

}
}


public class Singleton2 implements Runnable{

	public static void main(String[] args) {
		Thread thread=new Thread(new Singleton2());
		thread.start();
	
		for(int i=0;i<10;i++) {
		Singlenton1.getInstance();
		}

	}
	public void run() {
		for(int i=0;i<10;i++) {
			Singlenton1.getInstance();
			}
	
	}
}

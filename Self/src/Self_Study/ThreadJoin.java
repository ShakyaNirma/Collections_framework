package Self_Study;

public class ThreadJoin extends Thread {
	public void run() {
		Thread t= Thread.currentThread();
		System.out.println("Started executing new "+t.getName());
		
		for(int i=0;i<10;i++) {
			System.out.println("New " + t.getName());
		}
		System.out.println("finished executing "+ t.getName());
	}

	public static void main(String[] args)throws Exception {
		ThreadJoin t=new ThreadJoin();
		t.start();		
		System.out.println("Started executing main thrtead ");
		
		t.join();//in yield this will be change as yield
		
		for(int i=0;i<10;i++) {
			System.out.println(currentThread().getName()+i);
		}
		System.out.println("finished executing "+Thread.currentThread().getName());
	}

}

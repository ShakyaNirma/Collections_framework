package lecture_9;

public class ThreadYield extends Thread{
	
	public void run() {
		Thread t= Thread.currentThread();
		System.out.println("Started executing "+t.getName());
		
		for (int i=0;i<10;i++) {
			System.out.println(t.getName()+i);
		}
		System.out.println("Finished executing "+t.getName());
	}

	public static void main(String[] args) throws Exception {
		Thread t= new Thread(new ThreadYield(),"New Thread");
		t.start();
		System.out.println("Started executing main thread");
		
		t.yield();//temporarily stop executing main thread and give chance to newly created thread 
		
		for(int i=0;i<10;i++) {
			System.out.println(Thread.currentThread().getName()+i);
		}
	System.out.println("Finished executing "+ Thread.currentThread().getName());

	}

}

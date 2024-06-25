package lecture_9;

public class ThreadJoin extends Thread{
	
	public void run() {
		Thread t= Thread.currentThread();
		System.out.println("Started executing "+getName());
		
		for (int i=0;i<10;i++) {
			System.out.println(t.getName()+i);
		}
		System.out.println("Finished executing "+t.getName());
	}

	public static void main(String[] args) throws Exception {
		Thread t= new Thread(new ThreadJoin(),"New Thread");
		t.start();
		System.out.println("Started executing main thread");
		//wait for main thread to die and allow execute the other thread
		t.join();//main thread is waiting until new thread to join
		
		for(int i=0;i<10;i++) {
			System.out.println(Thread.currentThread().getName()+i);
		}
	System.out.println("Finished executing "+ Thread.currentThread().getName());

	}

}

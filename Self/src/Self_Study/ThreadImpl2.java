package Self_Study;

public class ThreadImpl2 implements Runnable{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("new thread "+i);
		}
	}

	public static void main(String[] args) {
	Thread thread=new Thread(new ThreadImpl2());
	thread.start();
	for(int i=0;i<10;i++) {
		System.out.println("main thread "+i);
	}

	}

}



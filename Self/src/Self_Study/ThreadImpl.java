package Self_Study;

public class ThreadImpl extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("new thread "+i);
		}
	}

	public static void main(String[] args) {
		ThreadImpl threadImpl= new ThreadImpl();
		threadImpl.start();
		for(int i=0;i<10;i++) {
			System.out.println("Main Thread "+i);
		}

	}

}

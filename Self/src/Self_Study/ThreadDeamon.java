package Self_Study;



public class ThreadDeamon extends Thread{


	public static void main(String[] args) {
		System.out.println("Entering main method");
		
		ThreadDeamon t=new ThreadDeamon();
		t.setDaemon(true);
		t.start();
		try {
			ThreadDeamon.sleep(3000);
		}catch(InterruptedException e) {
			
		}
		System.out.println("Leaving main method");
	}
	public void run(){
		System.out.println("Entering run method");
		try {
			System.out.println("In run method: currenThread() is "+Thread.currentThread().getName());
			while(true) {
				Thread.sleep(500);
				System.out.println("In run method: woke up again");
			}
			}catch (InterruptedException x) {
				x.printStackTrace();
		
		}
	}
}
		
	


package lecture_9;
//this is the another method and in industry mostly use this method
public class ex2 implements Runnable {
	public static void main(String[] args) {
		Thread thread1 =new Thread (new ex2());//Thread is a class
		thread1.start();
		Thread thread2 =new Thread (new ex2());
		thread2.start();


		for (int i=0;i<10;i++) {
			//System.out.println("Main Thread => "+i);
			System.out.println(Thread.currentThread().getName()+" = "+i);//can check which one is currently executing
			try{
				Thread.sleep(1000);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		}
		//these threads are main threads


	public void run(){
		for (int i=0;i<10;i++) {
			//System.out.println("New Thread => "+i);
			System.out.println(Thread.currentThread().getName()+" = "+i);
			try{
				Thread.sleep(1000);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
}
	}
	}
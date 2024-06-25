package lecture_9;
//this is a one method and another method in ex2
public class ex1 extends Thread{

	public static void main(String[] args) {
		ex1 e1=new ex1();
		e1.start();
		//to create another thread
		ex1 e2=new ex1();
		e2.start();
		for (int i=0;i<10;i++) {
			//System.out.println("Main Thread => "+i);
			System.out.println(Thread.currentThread().getName()+" = "+i);//can check which one is currently executing
			try{
				Thread.sleep(1000);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		}//these threads are main threads


	public void run(){
		for (int i=0;i<10;i++) {
			//System.out.println("New Thread => "+i);
			System.out.println(Thread.currentThread().getName()+" = "+i);
			try{
				Thread.sleep(1000);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}//these threads are newly created threads
	}
}
//when we execute this time to time output is different as there is no
//order to create threads. no order to create threads that is context switch

package lecture_9;


class Sample{
	//after using synchronized execute in order
	//also we can execute without it 
	//one thread finished execution then other will get the chance to execute
	synchronized static void display() {//both threads run this loop
		for (int i=0;i<10;i++) {
			System.out.println(Thread.currentThread().getName()+" = "+i);
			try{
				Thread.sleep(1000);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
	}//problem is we cannot control this accessing 
}
}
	
public class ex3 implements Runnable {
	Sample sample;
	public ex3(Sample sample) {
		this.sample=sample;
	}
	public static void main(String[] args) {
		Sample sample =new Sample ();
		Thread thread1 =new Thread (new ex3(sample));
		thread1.start();
		Thread thread2 =new Thread (new ex3(sample));
		thread2.start();
		Sample.display();
	}	
	public void run() {
		 Sample.display();
	}
}


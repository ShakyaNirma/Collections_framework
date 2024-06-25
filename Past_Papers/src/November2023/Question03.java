package November2023;


class Car{
	private static final Object lock = new Object();
	public  void displayOutput(Car car) {
		synchronized(lock) {
		try {
			for (int i=0;i<5;i++){
				Thread.sleep(500);
				System.out.println("Car is racing");
			}
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
}
	
	class Bike{
		private static final Object lock = new Object();
		public  void displayOutput(Bike bike) {
			synchronized(lock) {
			try {
				for (int i=0;i<5;i++){
					Thread.sleep(500);
					System.out.println("Bike is racing");
				}
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	}
public class Question03 extends Thread{
		Car car;
		Bike bike;
	

		public Question03(Car car) {
			this.car=car;
		}
		public Question03(Bike bike) {
			this.bike=bike;
			
		}
		public static void main(String[] args) {
			Car car=new Car();
			Bike bike=new Bike();
			Question03 question1=new Question03(car);
			question1.setPriority(MAX_PRIORITY);
			Question03 question2=new Question03(bike);
			question2.setPriority(MIN_PRIORITY);
			question1 .start();
			question2 .start();
		}
	    public void run() {
	        if (car != null) {
	            car.displayOutput(car);
	        } else if (bike != null) {
	            bike.displayOutput(bike);
	        }
	    }
	} 


	
	

package Interface;

public class Main {

	public static void main(String[] args) {
		Car car=new Car();// object means the type of variables access i the class
		//if we add a variable in car class as int value=10, then the this way is okay
		//but if we create above as Engine car= new Car() this havent give access to int value in car;
		car.stop();
		car.accelerate();
		
		Media carMedia=new Car();
		carMedia.stop();
		
		NiceCar car2=new NiceCar();
		
		car2.start();
		car2.startMusic();
		car2.upgradeEngine();
		car2.start();
		

	}

}

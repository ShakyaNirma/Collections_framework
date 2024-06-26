package ClassTest;

public class Car extends Vehicle{
	private int numSeats;
	
	public Car(String model,double rentPriceperDay,int numSeats) {
		super(model, rentPriceperDay);
		this.numSeats=numSeats;
	}
}

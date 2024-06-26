package ClassTest;

public class Motorcycle extends Vehicle {
	private int engineCapacity;
	
	public Motorcycle(String model,double rentalPricePerDay,int engineCapacity) {
		super(model, rentalPricePerDay);
		this.engineCapacity=engineCapacity;
		
	}
}

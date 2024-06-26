package ClassTest;

public class Vehicle {
	protected String model;
	protected double rentalPricePerDay;
	
	public Vehicle(String model,double rentalPricePerDay) {
		this.model=model;
		this.rentalPricePerDay=rentalPricePerDay;
	}
	public double calculateRentalCost(int days) {
		return days*rentalPricePerDay;
	}
	
}

package ClassTest;

public class TemperatureConverter {
	private double temperature;
	
	public TemperatureConverter() {
		temperature=0.0;
	}
	
	public double getTemperature() {
		return temperature;
	}
	
	public double CelciusToFarenheit(double celcius) {
		return temperature= ((celcius*9/5)+32);
	}
	public double FarenheitToCelcius(double farenheit) {
		return temperature=((farenheit-32)*(5/9));
	}

}

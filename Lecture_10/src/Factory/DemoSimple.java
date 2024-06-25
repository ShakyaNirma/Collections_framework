package Factory;

interface Iicolor{
	void fill();
}
class Red implements Iicolor{
	public void fill() {
		System.out.println("Fill in Red");
	}
}

class Blue implements Iicolor{
	public void fill() {
		System.out.println("Fill in Blue");
	}
}
class Green implements Iicolor{
	public void fill() {
		System.out.println("Fill in Green");
	}
}

class ColorFactory {
	public  static Iicolor getColor(String type){
		if(type.equals("red")) {
			return new Red();
		}else if(type.equals("green")) {
			return new Green();
		}else { 
			return new Blue();
		}
	
}
}
public class DemoSimple {
	public static void main (String args[]){
		ColorFactory.getColor("red").fill();
		ColorFactory.getColor("green").fill();
		ColorFactory.getColor("blue").fill();
	}
	
	
}


package Factory;

interface Icolor{
	void fill();
}
class LightRed implements Icolor{
	public void fill() {
		System.out.println("Fill in Light Red");
	}
}

class LightBlue implements Icolor{
	public void fill() {
		System.out.println("Fill in Light Blue");
	}
}
class LightGreen implements Icolor{
	public void fill() {
		System.out.println("Fill in Light Green");
	}
}

class DarkRed implements Icolor{
	public void fill() {
		System.out.println("Fill in Dark Red");
	}
}

class DarkBlue implements Icolor{
	public void fill() {
		System.out.println("Fill in Dark Blue");
	}
}
class DarkGreen implements Icolor{
	public void fill() {
		System.out.println("Fill in Dark Green");
	}
}

abstract class ColourSelection{
	public abstract  Icolor getColor(String type);
}

class LightColorFactory extends ColourSelection{
	public  Icolor getColor(String type){
		if(type.equals("red")) {
			return new LightRed();
		}else if(type.equals("green")) {
			return new LightGreen();
		}else { 
			return new LightBlue();
		}
	
}
}

class DarkColorFactory extends ColourSelection{
	public Icolor getColor(String type){
		if(type.equals("red")) {
			return new DarkRed();
		}else if(type.equals("green")) {
			return new DarkGreen();
		}else { 
			return new DarkBlue();
		}
	
}
}
public class Demo {

	public static void main(String[] args) {
		ColourSelection lightColor=new LightColorFactory();
		lightColor.getColor("red").fill();
	

		ColourSelection darkColor=new DarkColorFactory();
		darkColor.getColor("red").fill();
	}

}

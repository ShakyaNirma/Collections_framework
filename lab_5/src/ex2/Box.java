package ex2;

public class Box implements ICompute {
	private int length, width, height;
	private int volume;
	
	public Box(int length, int width, int height) {
		super();
		this.length = length;
		this.width = width;
		this.height = height;
		
	}
	
	public void calculate() {
		this.volume=this.length*this.width*this.height;
	}
	
	public void display() {
		System.out.println("the volume of the box is: "+ this.volume);
	}

	
}

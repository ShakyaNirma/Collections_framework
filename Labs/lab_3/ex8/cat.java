package ex8;

public class cat extends pet{
	private int livesLeft;
	
	public cat(String n, String o, int a, int l) {
	super(n, o, a);
	this.livesLeft = l;
	}
	
	public cat(String n, String o) {
		super(n, o);
		this.livesLeft=0;
	}
	
	public void showDetails() {
		System.out.println("\n");
		super.showDetails();
		System.out.println(". I am a cat. There's " +this.livesLeft + " lives remain for me.");

	}

	
	}//end of the pet class


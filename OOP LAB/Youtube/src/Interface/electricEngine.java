package Interface;

public class electricEngine implements Engine {
	@Override
	public void start() {
		System.out.println("electric engine start");
	}
	
	@Override
	public void stop() {
		System.out.println("electric engine stop");
	}
	
	@Override
	public void accelerate() {
		System.out.println("electric engine accelerate");
	}
}



package Command;

public class OnCommand implements Command{

	Light light;
	
	public OnCommand(Light light) {
		this.light=light;
	}
	public void execute() {
		this.light.on();
	}
}

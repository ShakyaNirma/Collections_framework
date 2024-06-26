package Command;

public class OffCommand implements Command{
Light light;
	
	public OffCommand(Light light) {
		this.light=light;
	}
	public void execute() {
		this.light.off();
	}
}

 
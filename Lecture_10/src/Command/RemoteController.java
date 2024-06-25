package Command;

public class RemoteController {
	
	private static RemoteController remoteController;

	Command onCommand;
	Command offCommand;
	
	private RemoteController() {}
	
	void setCommand(Command onCommand,Command offCommand) {
		this.onCommand=onCommand;
		this.offCommand=offCommand;
	}
	
	public static RemoteController getInstance() {
		if(remoteController ==null) {
			remoteController=new RemoteController();
		}
		return remoteController;
	}
	
	void onButtonPress() {
		onCommand.execute();
	}
	void offButtonPress() {
		offCommand.execute();
	}
}

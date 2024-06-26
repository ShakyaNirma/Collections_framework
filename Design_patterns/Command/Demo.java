package Command;

public class Demo {

	public static void main(String[] args) {
	
		Light livingRoomLight=new LivingRoomClass();
		Light bedRoomLight=new BedRoomLight();
		
		Command onCommandlivingRoom=new OnCommand(livingRoomLight);
		Command offCommandlivingRoom=new OffCommand(livingRoomLight);

		Command onCommandbedRoom=new OnCommand(bedRoomLight);
		Command offCommandbedRoom=new OffCommand(bedRoomLight);
		
		RemoteController remoteController= RemoteController.getInstance();
		remoteController.setCommand(onCommandlivingRoom,offCommandlivingRoom);
		remoteController.onButtonPress();
		remoteController.offButtonPress();
		
		remoteController.setCommand(onCommandbedRoom,offCommandbedRoom);
		remoteController.onButtonPress();
		remoteController.offButtonPress();
		
	}

}

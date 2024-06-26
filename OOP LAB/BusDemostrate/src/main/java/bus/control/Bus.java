package bus.control;

public class Bus {
	private String busid;
	private int seatNo;
	private String owner;
	private String drivrid;
	
	public Bus(String busid, int seatNo, String owner, String drivrid) {
		this.busid = busid;
		this.seatNo = seatNo;
		this.owner = owner;
		this.drivrid = drivrid;
	}

	public String getBusid() {
		return busid;
	}


	public int getSeatNo() {
		return seatNo;
	}

	public String getOwner() {
		return owner;
	}


	public String getDrivrid() {
		return drivrid;
	}

	
	
	
}

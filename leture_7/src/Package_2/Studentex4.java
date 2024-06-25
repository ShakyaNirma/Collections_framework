package Package_2;

public class Studentex4 {
	private String name;
	private int ditno;
	private String address;
	
	String getDetails() {
	String s=("I am a student\n My name is "+name+"\nI am from "+address+"\nMy dit no is "+ditno);
	return s;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDitno() {
		return ditno;
	}
	public void setDitno(int ditno) {
		this.ditno = ditno;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}

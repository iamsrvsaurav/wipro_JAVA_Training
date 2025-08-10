package demo;

public class Address {
	
	@Override
	public String toString() {
		return "Address [door_no=" + door_no + ", streetAddr=" + streetAddr + ", cityName=" + cityName + ", pinCode="
				+ pinCode + ", getDoor_no()=" + getDoor_no() + ", getStreetAddr()=" + getStreetAddr()
				+ ", getCityName()=" + getCityName() + ", getPinCode()=" + getPinCode() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	public Address() {
		super();
	}
	
	public int getDoor_no() {
		return door_no;
	}

	public void setDoor_no(int door_no) {
		this.door_no = door_no;
	}

	public int getStreetAddr() {
		return streetAddr;
	}

	public void setStreetAddr(int streetAddr) {
		this.streetAddr = streetAddr;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getPinCode() {
		return pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

	int door_no;
	int streetAddr;
	String cityName;
	String pinCode;

	

}

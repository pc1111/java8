package java8_14;

public class DmbCellPhone extends CellPhone {
	
	int channel;
	
	DmbCellPhone(String model, String color, int channel){
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	
	void turnOnDmb() {
		System.out.println("DMB¸¦ ÄÕ´Ï´Ù.");
	}
	void turnOffDmb() {
		System.out.println("DMB¸¦ ²ü´Ï´Ù.");
	}
	void setChannel(int channel) {
		this.channel = channel;
	}
}

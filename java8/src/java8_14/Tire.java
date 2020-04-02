package java8_14;

public class Tire {
	public int maxRotation;
	public int accumulatedRotaion;
	public String location;
	
	public Tire(String locaton, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	public boolean roll() {
		++accumulatedRotaion;
		if(accumulatedRotaion < maxRotation) {
			System.out.println(location + " Tire ���� :" + (maxRotation - accumulatedRotaion) + "ȸ");
			return true;
		}else {
			System.out.println("***" + location + "Tire ��ũ ***");
			return false;
		}
	}
}

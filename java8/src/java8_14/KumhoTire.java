package java8_14;

public class KumhoTire extends Tire{

	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	@Override
	public boolean roll() {
		++accumulatedRotaion;
		if(accumulatedRotaion < maxRotation) {
			System.out.println(location + " kumhoTire ���� :" + (maxRotation - accumulatedRotaion) + "ȸ");
			return true;
		}else {
			System.out.println("***" + location + "Tire ��ũ ***");
			return false;
		}
	}
}

package java8_14;

public class KumhoTire extends Tire{

	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	@Override
	public boolean roll() {
		++accumulatedRotaion;
		if(accumulatedRotaion < maxRotation) {
			System.out.println(location + " kumhoTire ¼ö¸í :" + (maxRotation - accumulatedRotaion) + "È¸");
			return true;
		}else {
			System.out.println("***" + location + "Tire ÆãÅ© ***");
			return false;
		}
	}
}

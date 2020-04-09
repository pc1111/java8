package java8_14;

public class AirplaneEx {

	public static void main(String[] args) {
		SupersonicAiplane sa = new SupersonicAiplane();
		
		sa.takeoff();
		sa.fly();
		sa.flyMode = SupersonicAiplane.SUPERSONIC;
		sa.fly();
		sa.flyMode = SupersonicAiplane.SUPERSONIC;
		sa.fly();
		sa.land();
	}

}

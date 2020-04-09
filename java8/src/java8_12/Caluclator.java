package java8_12;

public class Caluclator {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		cal.powerOn();
		int res1 = cal.plus(10,20);
		System.out.println(res1);
		
		byte num1 = 10;
		byte num2 = 3;
		double res2 = cal.divide(num1, num2); // double은 인트로 자동형변환이 가능하여 사용, 작은것 -> 큰것 가능
		System.out.println(res2);
		
		long num3 = 100;
		long num4 = 30;
		double res3 = cal.divide((int)num3, (int)num4); // long은 인트로 자동형변환이 가능하지 않아 강제변환이 필요,  큰것 -> 작은것 불가능
		cal.poweroff();
	}

}

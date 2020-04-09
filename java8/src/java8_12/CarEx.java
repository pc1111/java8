package java8_12;

public class CarEx {

	public static void main(String[] args) {
		String a = "ㅁ";
		String b = "ㅠ";
		int ab = 0;
		
		Car myCar = new Car("상용자동차","노랑",350); // Car 객체 생성(instance)

		System.out.println("데이터 입력 전");
		System.out.println(myCar.company);
		System.out.println(myCar.color);
		System.out.println(myCar.maxspeed);
		System.out.println();
		
		myCar.company = "현대자동차";
		myCar.model = "아반떼";
		myCar.color = "은색";
		myCar.maxspeed = 300;
		myCar.speed = 100;
		
		System.out.println("데이터 입력 후");
		System.out.println(myCar.company);
		System.out.println(myCar.maxspeed);
		
		System.out.println();
		Car yourCar = new Car(a,b,ab);
		System.out.println(yourCar.company);
		System.out.println(myCar.color);
		System.out.println(yourCar.maxspeed);
		
		System.out.println();
		System.out.println("생성자 예제");

		Car c1 = new Car();
		System.out.println(c1.company);
		System.out.println(c1.model);
		System.out.println(c1.color);
		System.out.println(c1.maxspeed);
		System.out.println(c1.speed);
		
		Car c2 = new Car(250);
		System.out.println(c2.company);
		System.out.println(c2.model);
		System.out.println(c2.color);
		System.out.println(c2.maxspeed);
		System.out.println(c2.speed);
		
		Car c3 = new Car("파랑",350);
		System.out.println(c3.company);
		System.out.println(c3.model);
		System.out.println(c3.color);
		System.out.println(c3.maxspeed);
		System.out.println(c3.speed);
		
		c3.accel(); //메소드 호출
		c3.speed = 325;
		c3.accel();
		c3.accel();
		c3.accel();
		c3.accel();
	}

}

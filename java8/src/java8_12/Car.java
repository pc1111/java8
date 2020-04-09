package java8_12;

public class Car {
	/*필드*/
	String company = "기아자동차";
	String model = "쏘울";
	String color = "파랑";
	int maxspeed = 250;
	int speed = 0;
	
	Car() { // 생성자를 생성하지 않으면 기본생성자가 자동으로 작성됩니다.
		this("기아자동차", "검정", 300);
		
	}
	
	Car(String company, String color, int maxSpeed){
		 this.company = company;
		 this.color = color;
		 this.maxspeed = maxSpeed;
	}
	
	Car(String color, int maxSpeed){
		this("기아자동차", color, maxSpeed);
	}
	
	Car(int maxSpeed){
		this("기아자동차", "검정", maxSpeed);
	}
	
	/*Car( String color,String company, int maxSpeed){ //타입의 중복은 에러를 발생 String, String, int
		 this.company = company;
		 this.color = color;
		 this.maxspeed = maxSpeed;
	}
	
	Car(String company, int maxSpeed, String color){
		 this.company = company;
		 this.color = color;
		 this.maxspeed = maxSpeed;
	}
	Car(String color, int maxSpeed,int maxspeed){
		 this.company = company;
		 this.color = color;
		 this.maxspeed = maxSpeed;
	}*/
	
	/* 메소드(메서드) */
	
	void accel() {
		
		speed += 10;
		if(speed>maxspeed) {
			speed = maxspeed;
		}
		System.out.println("현재 속도 : " + speed);
	}
	
	void brake() {
		speed = 0;
		System.out.println("현재 속도 : " + speed);
	}

}

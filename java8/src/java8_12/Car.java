package java8_12;

public class Car {
	/*�ʵ�*/
	String company = "����ڵ���";
	String model = "���";
	String color = "�Ķ�";
	int maxspeed = 250;
	int speed = 0;
	
	Car() { // �����ڸ� �������� ������ �⺻�����ڰ� �ڵ����� �ۼ��˴ϴ�.
		this("����ڵ���", "����", 300);
		
	}
	
	Car(String company, String color, int maxSpeed){
		 this.company = company;
		 this.color = color;
		 this.maxspeed = maxSpeed;
	}
	
	Car(String color, int maxSpeed){
		this("����ڵ���", color, maxSpeed);
	}
	
	Car(int maxSpeed){
		this("����ڵ���", "����", maxSpeed);
	}
	
	/*Car( String color,String company, int maxSpeed){ //Ÿ���� �ߺ��� ������ �߻� String, String, int
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
	
	/* �޼ҵ�(�޼���) */
	
	void accel() {
		
		speed += 10;
		if(speed>maxspeed) {
			speed = maxspeed;
		}
		System.out.println("���� �ӵ� : " + speed);
	}
	
	void brake() {
		speed = 0;
		System.out.println("���� �ӵ� : " + speed);
	}

}

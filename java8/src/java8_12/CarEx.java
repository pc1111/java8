package java8_12;

public class CarEx {

	public static void main(String[] args) {
		String a = "��";
		String b = "��";
		int ab = 0;
		
		Car myCar = new Car("����ڵ���","���",350); // Car ��ü ����(instance)

		System.out.println("������ �Է� ��");
		System.out.println(myCar.company);
		System.out.println(myCar.color);
		System.out.println(myCar.maxspeed);
		System.out.println();
		
		myCar.company = "�����ڵ���";
		myCar.model = "�ƹݶ�";
		myCar.color = "����";
		myCar.maxspeed = 300;
		myCar.speed = 100;
		
		System.out.println("������ �Է� ��");
		System.out.println(myCar.company);
		System.out.println(myCar.maxspeed);
		
		System.out.println();
		Car yourCar = new Car(a,b,ab);
		System.out.println(yourCar.company);
		System.out.println(myCar.color);
		System.out.println(yourCar.maxspeed);
		
		System.out.println();
		System.out.println("������ ����");

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
		
		Car c3 = new Car("�Ķ�",350);
		System.out.println(c3.company);
		System.out.println(c3.model);
		System.out.println(c3.color);
		System.out.println(c3.maxspeed);
		System.out.println(c3.speed);
		
		c3.accel(); //�޼ҵ� ȣ��
		c3.speed = 325;
		c3.accel();
		c3.accel();
		c3.accel();
		c3.accel();
	}

}

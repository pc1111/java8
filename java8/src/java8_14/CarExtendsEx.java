package java8_14;

public class CarExtendsEx {

	public static void main(String[] args) {
		CarExtends car = new CarExtends();
		for(int i = 1; i <= 5; i++)
		{
			int problemLocation = car.run();
			switch(problemLocation)
			{
			case 1:
				System.out.println("�տ��� HankookTire�� ��ü");
				car.frontLeftTire = new HanKookTire("�տ���", 15);
				break;
			case 2:
				System.out.println("�տ����� KumhoTire�� ��ü");
				car.frontRightTire = new HanKookTire("�տ�����", 13);
				break;
			case 3:
				System.out.println("�ڿ��� HankookTire�� ��ü");
				car.backLeftTire = new HanKookTire("�ڿ���", 14);
				break;
			case 4:
				System.out.println("�ڿ����� KumhoTire�� ��ü");
				car.backRightTire = new HanKookTire("�ڿ�����", 17);
				break;
			}
			System.out.println("------------------------------------------");
		}

	}

}

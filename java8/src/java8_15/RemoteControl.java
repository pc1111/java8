package java8_15;

public interface RemoteControl {
	
	//����ʵ�
	int MAX_VOLUME = 10; // �������̽��� �ʵ�� ����� ���������.
	int MIN_VOLUME = 0;
	
	
	//�߻� �޼ҵ�
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	//����Ʈ �޼ҵ�
	default void setMute(boolean mute) {
		if(mute) System.out.println("���Ұ� ���·� �����մϴ�.");
		else System.out.println("���Ұ� ���¸� �����մϴ�.");
	}

	//���� �޼ҵ�
	static void changeBattery() {
		System.out.println("�������� ��ȯ�մϴ�");
	}
}

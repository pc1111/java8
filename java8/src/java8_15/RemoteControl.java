package java8_15;

public interface RemoteControl {
	
	//상수필드
	int MAX_VOLUME = 10; // 인터페이스의 필드는 상수로 만들어진다.
	int MIN_VOLUME = 0;
	
	
	//추상 메소드
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	//디폴트 메소드
	default void setMute(boolean mute) {
		if(mute) System.out.println("음소거 상태로 설정합니다.");
		else System.out.println("음소거 상태를 해제합니다.");
	}

	//정적 메소드
	static void changeBattery() {
		System.out.println("건전지를 교환합니다");
	}
}

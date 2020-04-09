package java8_14;

public class CellPhoneEx {

	public static void main(String[] args) {
		DmbCellPhone dcp = new DmbCellPhone("갤럭시S20", "레드", 10);
		
		dcp.powerOn();
		dcp.bell();
		dcp.sendVoice("여보세요.");
		dcp.receiveVoice("택배입니다.");
		dcp.sendVoice("집앞에 놓아 주세요");
		dcp.receiveVoice("넹.");
		dcp.hangUp();
		dcp.turnOnDmb();
		dcp.setChannel(100);
		dcp.turnOffDmb();
		dcp.powerOff();
		
		CellPhone cp = new CellPhone();
		cp.powerOn();
//		cp.turnOnDmb(); 부모는 자식의 자료를 사용할수없다.
	}

}

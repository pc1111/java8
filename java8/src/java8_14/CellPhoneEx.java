package java8_14;

public class CellPhoneEx {

	public static void main(String[] args) {
		DmbCellPhone dcp = new DmbCellPhone("������S20", "����", 10);
		
		dcp.powerOn();
		dcp.bell();
		dcp.sendVoice("��������.");
		dcp.receiveVoice("�ù��Դϴ�.");
		dcp.sendVoice("���տ� ���� �ּ���");
		dcp.receiveVoice("��.");
		dcp.hangUp();
		dcp.turnOnDmb();
		dcp.setChannel(100);
		dcp.turnOffDmb();
		dcp.powerOff();
		
		CellPhone cp = new CellPhone();
		cp.powerOn();
//		cp.turnOnDmb(); �θ�� �ڽ��� �ڷḦ ����Ҽ�����.
	}

}

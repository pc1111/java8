package java8_15;

public class IndexOfEx {

	public static void main(String[] args) {
		String str = "�ڹ� ���α׷���";
		int index = str.indexOf("����");
		System.out.println(index);
		index = str.indexOf("C ���");
		System.out.println(index);
		str = "�ڹ��ڹ��ڹ� �������� �׷��������Դϴ�.";
		index = str.indexOf("��"); // �Ű������� �� ���� ��쿡 0������ �˻�
		System.out.println(index);
		index = str.indexOf("��", index+1);//ù��° �Ű����� : �˻���, 2��° �Ű����� : �˻� ���� ��ġ
		System.out.println(index);
		
		String str2 = str.replace("��������","����");
		System.out.println(str);
		System.out.println(str2);
		
		/////// substring() ���ڿ� �߶󳻱�
		
		String ssn = "880815-1234567";
		
		String firstNum = ssn.substring(0, 6);
		System.out.println(firstNum);
		
		String secondNum = ssn.substring(7);
		System.out.println(secondNum);
		
		/////////// trim() ���ڿ� �յ� ���� �߶󳻱� ���ڿ�.trim();
		/////// split() ���ڸ� �ڸ��� ��� �迭�� ���� 
	}

}

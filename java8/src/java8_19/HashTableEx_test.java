package java8_19;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashTableEx_test {

	public static void main(String[] args) {
//		HashTableEx ht = new HashTableEx();
		Scanner s = new Scanner(System.in);
		Map<String, String> ht = new Hashtable<>();
		//Hashtable<String, String> ht = new HashTable<>();
		System.out.println("�������� �и��� �̸��� ��ȭ��ȣ 4���� �Է��Ͻʽÿ�");
		for(int i = 0 ; i < 4; i ++)
		{
			System.out.print("�̸�, ��ȭ��ȣ : ");
			String key =s.next();
			String value = s.next();
			ht.put(key, value );
		}
		System.out.println("��ȭ��ȣ�� �˻��� �̸��� �Է��ϼ���.");
		String search = s.next();
		String tel = ht.getOrDefault(search, "��ϵ��� ���� ����");
		System.out.println(search + "�� ��ȭ��ȣ�� " + tel + "�Դϴ�.");
		s.close();

	}

}

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
		System.out.println("공백으로 분리된 이름과 전화번호 4개를 입력하십시오");
		for(int i = 0 ; i < 4; i ++)
		{
			System.out.print("이름, 전화번호 : ");
			String key =s.next();
			String value = s.next();
			ht.put(key, value );
		}
		System.out.println("전화번호를 검색할 이름을 입력하세요.");
		String search = s.next();
		String tel = ht.getOrDefault(search, "등록되지 않은 상태");
		System.out.println(search + "의 전화번호는 " + tel + "입니다.");
		s.close();

	}

}

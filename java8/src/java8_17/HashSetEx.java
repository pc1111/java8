package java8_17;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HashSetEx {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();// 입력순서와 관계없이 출력한다.
		set.add("사과");
		set.add("배");
		set.add("포도");
		set.add("멜론");
		set.add("멜론"); // 동일한 값을 중복 출력하지 않는다.
		
		for(String str : set)
			System.out.println(str);
		
		System.out.println();
		List<String> list = new ArrayList<>();
		
		list.add("사과");
		list.add("배");
		list.add("포도");
		list.add("멜론");
		list.add("사과");
		for(String str : list)
			System.out.println(str);
		
		System.out.println();
		System.out.println(set.contains("사과"));
		System.out.println(set.isEmpty());
		if(!set.isEmpty())
				set.clear();
		System.out.println(set.size());
		
		Iterator<String> iterator = list.iterator(); //컬렉션 공통 메서드
		while(iterator.hasNext()) {
			String str = iterator.next();
			System.out.println(str);
		}
	}

}

package java8_17;

import java.util.*;


public class LickedListEx {

	public static void main(String[] args) {
		List<String> arrayList = new ArrayList<>();
		List<String> linkedList = new LinkedList<>();
		
		
		long start = System.currentTimeMillis();
		for(int i=0; i<1_000_000; i++) {
			arrayList.add(String.valueOf(i));
		}
		long end = System.currentTimeMillis();
		System.out.println("ArrayList : " + (end - start) + "ms");
		
		start = System.currentTimeMillis();
		for(int i=0; i<1_000_000; i++) {
			linkedList.add(String.valueOf(i));
		}
		end = System.currentTimeMillis();
		System.out.println("ArrayList : " + (end - start) + "ms");
		
		
		//제일 앞 0번 삽입
		start = System.currentTimeMillis();
		for(int i=0; i<10_000; i++) {
			arrayList.add(0, String.valueOf(i));
		}
		end = System.currentTimeMillis();
		System.out.println("ArrayList : " + (end - start) + "ms");
		
		start = System.currentTimeMillis();
		for(int i=0; i<10_000; i++) {
			linkedList.add(0, String.valueOf(i));
		}
		end = System.currentTimeMillis();
		System.out.println("ArrayList : " + (end - start) + "ms");
		
		
	}

}

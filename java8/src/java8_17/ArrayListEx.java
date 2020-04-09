package java8_17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListEx {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		System.out.println(list.size());
		list.add("���");
		list.add("��");
		list.add("������");
		list.add("���ξ���");

		System.out.println(list.size());
		
		String str = list.get(0);
		System.out.println(str);
		
		for(int i = 0 ; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		list.add(2,"����");
		
		for(String temp : list)
			System.out.println(temp);
		System.out.println();
		
		list.remove(1);
		
		for(String temp : list)
			System.out.println(temp);
		System.out.println();
		
		list.remove("������");
		
		for(String temp : list)
			System.out.println(temp);
		System.out.println();
		
		list.set(1, "����");
		for(String temp : list)
			System.out.println(temp);
		System.out.println();
		
		System.out.println(list.contains("����"));
		System.out.println(list.contains("����"));
		System.out.println(list.isEmpty()); // ����Ʈ�� �����
		if(!list.isEmpty()) {
			list.clear();
		}
		System.out.println();
		System.out.println(list.isEmpty());
		
		int[] arr = new int[] {10, 20, 30, 40, 50};
		for(int num : arr) {
			if(num == 30) {
				System.out.println(num == 30);
			}
		}
		System.out.println();
		List<Integer> arrList = Arrays.asList(10, 20, 30, 40, 50);
		System.out.println(arrList.contains(30));
		
		//List<Integer> streamList = Arrays.stream(arr).boxed().collect(Collectors.toList()); // �迭�� ����Ʈ�� ��ȯ
		
		Integer[] ary =  arrList.toArray(new Integer[arrList.size()]);
	}

}

//package java8_19;
//
//public class FunctionAndThenComposeExample {
//	public static void main(String[] args) {
//		Function<Member, Address> functionA;
//		Function<Address, String> functionB;
//		Function<Member, String> functionAB;
//		String city;
//		
//		functionA = (m) -> m.getAddress();
//		functionB = (a) -> a.getCity();
//		functionAB = functionA.andThen(functionB);
//		city = fuctionAB.apply(new Member("ȫ�浿", "hong", new Address("�ѱ�", "����")));
//		System.out.println("���� ���� : " + city);
//		
//
//		functionAB = functionA.compose(functionA);
//		city = fuctionAB.apply(new Member("ȫ�浿", "hong", new Address("�ѱ�", "����")));
//		System.out.println("���� ���� : " + city);
//	} 
//}

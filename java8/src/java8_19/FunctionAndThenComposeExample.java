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
//		city = fuctionAB.apply(new Member("홍길동", "hong", new Address("한국", "서울")));
//		System.out.println("거주 도시 : " + city);
//		
//
//		functionAB = functionA.compose(functionA);
//		city = fuctionAB.apply(new Member("홍길동", "hong", new Address("한국", "서울")));
//		System.out.println("거주 도시 : " + city);
//	} 
//}

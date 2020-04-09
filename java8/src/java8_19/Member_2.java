package java8_19;

public class Member_2 {
	private String name;
	private String id;
	
	public Member_2() {
		System.out.println("Member() 실행");
	}
	
	public Member_2(String id) {
		System.out.println("Member(String id) 실행");
	}
	public Member_2(String name, String id) {
		System.out.println("Member(String name, String id)");
		this.name = name;
		this.id = id;
	}
	
	public String getId() {return id;}
}

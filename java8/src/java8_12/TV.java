package java8_12;

public class TV {
	
	String TV_name ;
	int year;
	int inc;
	
	TV(String TV_name,int year,int inc){
		this.TV_name = TV_name;
		this.year = year;
		this.inc = inc;
	}
	
	void show(){
		System.out.println(TV_name + "���� ���� " + year +"���� " + inc + "��ġ TV");
	}
}

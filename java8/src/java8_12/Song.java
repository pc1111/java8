package java8_12;

public class Song {

	String title;
	String artist;
	int year;
	String country;
	
	Song(){
		
	}
	
	Song(String title, String artist, int year, String country){
		this.title = title;
		this.artist = artist;
		this.year = year;
		this.country = country;
	}
	
	void show() {
		System.out.println(year + "�� " + country + "������ " + artist +"�� �θ� " + title);
	}
}

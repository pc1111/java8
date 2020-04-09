package java8_18;

public class Student {
	private String name;
	private int englishScore;
	private int mathScore;
	
	public Student(String name, int englishScore, int mathScoore) {
		this.name = name;
		this.englishScore = englishScore;
		this.mathScore = mathScoore;
	}
	
	public String getName() {return name;}
	public int getEglishScore() {return englishScore;}
	public int getMathScore() {return mathScore; }
}

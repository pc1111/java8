package java8_15;

public class Hangman {
	String hiddenString;
	StringBuffer outputString = new StringBuffer();
	StringBuffer inputString = new StringBuffer();
	int remainder;
	int failed;

	public Hangman(String game) {
		hiddenString = game;
	}

	public int playGame() {
		this.inputString = new StringBuffer(hiddenString);
		this.remainder = hiddenString.length();
		this.failed = 6;

		for (int i = 0; i < remainder; i++)
			outputString.append("_");

		return remainder;
	}

	public int go(StringBuffer player) {

		int temp = 0;
		int count = remainder;
		
		int i = 0;
		
		while (count >= 0) {
			
			count--;
			if ((player.charAt(0)) == (inputString.charAt(i))) {
				outputString.deleteCharAt(i);
				outputString.insert(i, inputString.charAt(i));
				inputString.deleteCharAt(i);
				inputString.insert(i, "_");
				temp = 1;
			} else {
				i += 1;
			}

			
		}
		
		
		if (temp == 0)
			failed--;
		show();
		count = cheak();
		if (count == remainder) {
			System.out.println("정답입니다.");
			return 30;
		} else {
			return failed;
		}
		
	}
	
	private void show() {
		System.out.println("남아있는 라이프 : "+failed);
		System.out.println(outputString);
	}
	
	private int cheak() {
		int count = 0;
		for (int i = 0; i < remainder; i++) {
			if (hiddenString.charAt(i) == outputString.charAt(i)) {
				count++;
			}
		}
		return count;
	}
	
	public void ready() {
		
		System.out.println("문자를 입력해주세요");
	}
	
}

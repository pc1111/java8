package java8_20;

public class ContributionCount {

	public static void main(String[] args) {
		Account acc = new Account();
		Customer cust[] = new Customer[10];
		for(int i=0; i<10; i++)
		{
			cust[i] = new Customer(acc);
			cust[i].start();
		}
	}

}

package lab2;

public class Program {

	public static void main(String[] args) {
		
		Account myAccount = new Account(5, "George A", 100.00);
		
		processAccount(myAccount);
		System.out.println(myAccount.getDetails());
		
		int k = 100;
		incInt(k);
		System.out.println(k);
		
	}
	
	static void processAccount(Account acc) {
		acc.addInterest();
	}
	
	private static void incInt(int x) {
		x++;
	}
	
}

package lab2;

public class Account {
		
	public static void main(String[] args) {
		
		// Create an instance of Account
		Account acc1 = new Account(1, "George", 10000.00);
		
		// Invoke deposit() and withdraw()
		acc1.deposit(256.31);
		System.out.println(acc1.getDetails());
		acc1.withdraw(100.00);
		System.out.println(acc1.getDetails());
		
		// Create array of three account references
		Account[] accounts = new Account[3];

		accounts[0] = new Account(2, "Tim", 200.00);
		accounts[1] = new Account(3, "Jim", 99735.53);
		accounts[2] = new Account(4, "Jimothy", 1056392.00);
		
		// get details for each account
		for (Account account : accounts) {
			account.getDetails();
			System.out.println(account.getDetails());
		}
		
		Account myAccount = new Account(5, "George A", 100.00);
		
		// Add interest on myAccount
		myAccount.addInterest();
		System.out.println(myAccount.getDetails());
		
		// Create partner account
		Account partnerAccount = myAccount;
		
		// Add interest to partner account and check if myAccount balance changed
		partnerAccount.addInterest();
		System.out.println(myAccount.getDetails());
	}
	
	private int id;
	private String owner;
	private double balance;
	
	// Constructor
	public Account (int id, String owner, double balance) {
		this.id = id;
		this.owner = owner;
		this.balance = balance;
	}
	
	void deposit(double amount) {
		if (amount > 0.00) {
			this.balance += amount;
		} else {
			System.out.println("Invalid amount entered.");
		}
	}
	
	void withdraw(double amount) {
		if (amount <= this.balance) {
			this.balance -= amount;
		} else {
			System.out.println("Insufficient funds.");
		}
	}
	
	public String getDetails() {
		return "ID: " + this.id + ", Owner: " + this.owner + ", balance: " + this.balance;
	}
	
	public void addInterest() {
		this.balance *= 1.025;
	}
	

}
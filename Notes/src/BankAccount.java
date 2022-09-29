
public class BankAccount {
	private double balance = 0.0;
	String accountName;
	public static double intRate;
	public static int numAccts = 0;
	
	// A constructor allows a default value
	// by default, a constructor with no parameters is created
	
	public BankAccount() {
		System.out.println("Bank account constructor no parameters.");
		numAccts++;
	}
	
	public BankAccount(double initialBalance) {
		balance = initialBalance;
	}
	public BankAccount(String name, double initBal) {
		this.balance = initBal;
		this.accountName = name;
	}
	
	// public means other classes can access the variable
	//
	public void deposit (double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		balance -= amount;
	}
	
	// an accessor method is a method to return a specific value
	public double getBalance() {
		return balance;
	}
	
	// a mutator method is a method to change a specific value
	public void setBalance(double newBalance) {
		balance = newBalance;
	}
	
	// precondition: 
	// postcondition: 
	
	public double calculateInterest(double rate, double time) {
		double interest = this.balance * rate;
		return interest;
	}
	
	public double predictInterest(double principal, double rate, double time) {
		double predicted = principal * this.calculateInterest(rate, time);
		return predicted;
	}
	
	// premade function that automatically runs
	public String toString() {
		return accountName + "'s balance is " + this.getBalance();
	}
	
	public void BannedClients() {
		System.out.println("????");
	}
	
	
}


public class SavingsAccount extends BankAccount{
	
	// constructors are not inherited
	// use super() to inherit constructors
	// any super() constructor call must go first
	// note: super.method() can inherit from methods
	// If a subclass constructor makes no explicit super() call, then
	// super() is automatically called
	
	// if a subclass constructor makes an explicit super call with paramters,
	// then super() with no parameters is not called.
	
	// a subclass without a constructor makes an automatic call to a no parameter constructor of the superclass.
	// If no such constructor exists, then an error results.
	// Note: object contains a no parameter constructor which is why no error results when a constructor is not defined.
	
	public SavingsAccount(String name, double amount) {
		super(name, amount);
		System.out.println("Connor Desmond Emma.");
	}
	
	public void BannedClients() {
		super.BannedClients();
		System.out.println("savings accoutn banned");
		
	}
	
	// object is the superclass of all other classes inherit from
	
	// To override (change) an inheritied method,
	// write method header and then change the code
	
	public double calculateInterest(double rate, double time) {
		double extra = 1.1;
		return getBalance() * rate * time * extra;
	}
	public void premiumSavings() {
		System.out.println("You qualify for premium savings.");
	}
}

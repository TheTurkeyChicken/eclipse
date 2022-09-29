
public class CasinoPlayer {
	String name;
	double bal;
	double bet;
	
	public CasinoPlayer(double amount, String name) {
		this.name = name;
		this.bal = amount;
	}
	
	public double getBal() {
		return this.bal;
	}
	public void depBal(double amount) {
		this.bal += amount;
	}
	public void withBal(double amount) {
		this.bal-= amount;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String newName) {
		this.name = newName;
	}
	public boolean betAmount(double amount) {
		if(amount > bal) {System.out.println("You bet too much!"); return false;}
		this.bet = amount;
		return true;
	}
	public double getBet() {
		return this.bet;
	}
//	public void withdraw(double amount) {
//		if(checkBalance(amount)) bal -= amount;
//	}
//	public void deposit(double amount) {
//		bal += amount;
//	}
//	public static int randint(int l, int h) {
//		return (int)(Math.random() * (h - l + 1) + l);
//	}
//	private boolean checkBet(double bet) {
//		return (bet >= 0) && (bet <= max) && (bet <= bal); // returns true if bet is valid
//	}
//	private boolean checkBalance(double amt) {
//		return amt <= bal;
//	}
}

import java.util.Scanner;

public class GuessingPlayer extends CasinoPlayer {
	static final double depositlimit = 1000;
	public GuessingPlayer(double amount, String name) {
		super(amount, name);
	}
	public int randn() { // helper method
		return (int)(Math.random() * 10 + 1);
	}
	public void play(int guess) { // returns reward
		int num = randn();
		if(!betAmount(this.bet)) {
			System.out.println("Bet amount too large!");
			return;
		}
		withBal(bet); // takes away money on bet
		depBal(payout(Math.abs(num - guess)));
	}
	public double payout(int diff) {
		double bet = this.bet; // already checked bet
		if(diff == 0) return bet * 5;
		else if(diff == 1) return bet * 2;
		return 0;	
	}
	public void depBal(double amount) {
		if(amount > depositlimit) {System.out.println("Deposit limit reached!"); this.bal += depositlimit;}
		this.bal += amount;
	}
}


public class RoulettePlayer extends GuessingPlayer {
	public RoulettePlayer(double amount, String name) {
		super(amount, name);	
	}
	public int randn() {
		return (int)(Math.random() * 39 + 1);
	}
	public void play(int guess) {
		int num = randn();
		if(!betAmount(this.bet)) {
			System.out.println("Bet amount too large!");
			return;
		}
		withBal(bet); // takes away money on bet
		depBal(payout(guess, num));
	}
	public double payout(int guess, int num) {
		int correctrange = (int)(Math.random() * 3), correctparity = (int)(Math.random() * 2);
		if(guess == num) return bet * 5;
		if(guess > correctrange * 13 && guess <= (correctrange + 1) * 13) return bet * 2;
		if(guess % 2 == correctparity) return bet;
		return 0;
	}
}

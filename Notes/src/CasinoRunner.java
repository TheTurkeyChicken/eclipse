import java.util.Scanner;

public class CasinoRunner {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// Segment one:
		CasinoPlayer MrLu = new CasinoPlayer(500, "Mr Lu");
		MrLu.depBal(100);
		MrLu.withBal(300);
		System.out.println(MrLu.getBal());// prints 300.0
		
		MrLu.setName("Alfred");
		System.out.println(MrLu.getName()); // Alfred
		
		MrLu.betAmount(400); // You bet too much!
		MrLu.betAmount(200);
		System.out.println(MrLu.getBet()); // 200.0
		
		// Segment two:
		GuessingPlayer Edward = new GuessingPlayer(5000, "Edward");
		Edward.betAmount(3000);
		Edward.play(scan.nextInt()); // results can vary
		// see GuessingPlayer class for more details on questions b and c (such as the method: payout)
		System.out.println(Edward.getBal());
		
		Edward.depBal(5000); // limit is 1000, as manually set in GuessingPlayers class; prints "Deposit limit reached!"
		
		// Segment three:
		RoulettePlayer Connor = new RoulettePlayer(500, "Connor");
		Connor.betAmount(300);
		System.out.println(Connor.randn()); // prints something between 1 and 39, since its random
		Connor.play(scan.nextInt());
		System.out.println(Connor.getBal());
	}
}

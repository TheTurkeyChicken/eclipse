import java.util.Scanner;
public class RockPaperScissors {
	public static void main(String[] args) {
		System.out.println("How many games?");
		Scanner scan = new Scanner(System.in);
		int games = scan.nextInt(), pchoice, cchoice, wins = 0, losses = 0, ties = 0;
		for(int i = 0; i < games; i++) {
			System.out.println("Choose: rock (1), paper (2), or scissors (3)?");
			pchoice = scan.nextInt();
			cchoice = (int)(Math.random() * 3 + 1);
			if(cchoice == 1) System.out.println("The computer chose rock.");
			else if(cchoice == 2) System.out.println("The computer chose paper.");
			else System.out.println("The computer chose scissors.");
			
			if(cchoice == pchoice) {System.out.println("You tied this round!"); ties++;}
			else if(((pchoice - cchoice) + 3) % 3 == 1) {System.out.println("You won this round!"); wins++;}
			else {System.out.println("You lost this round!"); losses++;}
		}
		System.out.println("Session over. You won " + wins + " times, lost " + losses + " times, and tied " + ties + " times.");
	}
}

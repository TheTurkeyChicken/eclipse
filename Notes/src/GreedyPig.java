import java.util.Scanner;
public class GreedyPig {
	public static int dice() {
		return (int)(Math.random() * 6 + 1);
	}
	public static void printScore(int[] psum, int players) {
		System.out.println("---------------------------");
		for(int i = 0; i < players; i++) System.out.println("Player " + (i + 1) + ": " + psum[i] + "\tpts");
		System.out.println("---------------------------");
	}
	public static void pressAnyKeyToContinue() { 
	        System.out.println("\nPress Enter key to continue...");
	        try {System.in.read();}  
	        catch(Exception e) {}  
	 }
	public static void main(String[] args) {
		System.out.println("\r\n"
				+ " ██████╗ ██████╗ ███████╗███████╗██████╗ ██╗   ██╗    ██████╗ ██╗ ██████╗ ███████╗\r\n"
				+ "██╔════╝ ██╔══██╗██╔════╝██╔════╝██╔══██╗╚██╗ ██╔╝    ██╔══██╗██║██╔════╝ ██╔════╝\r\n"
				+ "██║  ███╗██████╔╝█████╗  █████╗  ██║  ██║ ╚████╔╝     ██████╔╝██║██║  ███╗███████╗\r\n"
				+ "██║   ██║██╔══██╗██╔══╝  ██╔══╝  ██║  ██║  ╚██╔╝      ██╔═══╝ ██║██║   ██║╚════██║\r\n"
				+ "╚██████╔╝██║  ██║███████╗███████╗██████╔╝   ██║       ██║     ██║╚██████╔╝███████║\r\n"
				+ " ╚═════╝ ╚═╝  ╚═╝╚══════╝╚══════╝╚═════╝    ╚═╝       ╚═╝     ╚═╝ ╚═════╝ ╚══════╝\r\n"
				+ "                                                                                  \r\n"
				+ "\r\n"
				+ "   ___            __         __  _    \r\n"
				+ "  / _ )__ __  __ / /_ _____ / /_(_)__ \r\n"
				+ " / _  / // / / // / // (_-</ __/ / _ \\\r\n"
				+ "/____/\\_, /  \\___/\\_,_/___/\\__/_/_//_/\r\n"
				+ "     /___/                            \r\n"
				+ "");
 		Scanner scan = new Scanner(System.in);
		int rand1 = 0, rand2 = 0, turn = -1, players, pcsum, pfinished = -1;
		System.out.println("Enter the amount of players: ");
		players = scan.nextInt();
		int[] psum = new int[players];
		while(true) {
			pcsum = 0;
			if(pfinished != -1) break;
			turn = (turn + 1) % players;
			System.out.println("IT IS NOW PLAYER " + (turn + 1) + "'S TURN");
			do {
				rand1 = dice();
				rand2 = dice();
			} while(rand1 == 6 || rand2 == 6);
			System.out.println("Initial roll: " + rand1 + " and " + rand2);
			pcsum += rand1 + rand2;
			while(true) {
				if((psum[turn] + pcsum) >= 100) {
					System.out.println("\r\n"
							+ " ██████   █████  ███    ███ ███████      ██████  ██    ██ ███████ ██████  \r\n"
							+ "██       ██   ██ ████  ████ ██          ██    ██ ██    ██ ██      ██   ██ \r\n"
							+ "██   ███ ███████ ██ ████ ██ █████       ██    ██ ██    ██ █████   ██████  \r\n"
							+ "██    ██ ██   ██ ██  ██  ██ ██          ██    ██  ██  ██  ██      ██   ██ \r\n"
							+ " ██████  ██   ██ ██      ██ ███████      ██████    ████   ███████ ██   ██ \r\n"
							+ "                                                                          \r\n"
							+ "                                                                          \r\n"
							+ "\nPlayer " + (turn + 1) + " has reached 100! The scores are as follows: ");
					psum[turn] += pcsum;
					printScore(psum, players);
					return;
				}
				System.out.println("You have " + psum[turn] + " points from before, and " + pcsum + " points this round.");
				System.out.println("Player " + (turn + 1) + " make a move: 0 for stand, 1 for hit");
				int input = scan.nextInt(); // 1 for hit, 0 for stand
				if(input == 0) break;
				rand1 = dice(); rand2 = dice();
				System.out.println("You rolled: " + rand1 + " and " + rand2);
				if(rand1 == 6 && rand2 == 6) {
					psum[turn] = 0;
					pcsum = 0;
					System.out.println("Player " + (turn + 1) + " rolled double 6. Yikes. You lose all your points.");
					break;
				}
				if(rand1 == 6 || rand2 == 6) {
					pcsum = 0;
					System.out.println("Player " + (turn + 1) + " rolled a 6. Turn is over and gets no points from this round.");
					break;
				}
				pcsum += rand1 + rand2;
				
			}
			psum[turn] += pcsum;
			System.out.println("Player " + (turn + 1) + " ended this round with " + psum[turn] + " points.");
			printScore(psum, players);
			pressAnyKeyToContinue();
		}
	}
}

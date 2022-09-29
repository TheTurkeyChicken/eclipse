import java.util.Scanner;

public class GuessMyNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int high = 0, low = 0, curguess, num = (int)(Math.random() * 100 + 1);
		boolean ezmode;
		
		System.out.println("Would you like easy mode? (enter true or false)");
		ezmode = scan.nextBoolean();
		System.out.println("LET THE SUFFERING BEGIN!");
		for(int i = 0; i < 10; i++) {
			System.out.println("Guess a number. This is try number " + (i + 1));
			curguess = scan.nextInt();
			if(curguess == num) {
				System.out.println(num + " was correct!\nYou guessed too high " + high + " times, and guessed too low " + low + " times.\nTotal guesses: " + (high + low));
				return;
			}
			else if(curguess > num) {
				high++;
				System.out.println("Too high");
			}
			else {
				low++;
				System.out.println("Too low");
			}
			if(ezmode) System.out.println("You were " + (Math.abs(curguess - num)) + " from my number.");
		}
		System.out.println("You ran out of guesses! You guessed too high " + high + " times, and guessed too low " + low + " times.\nTotal guesses: " + (high + low));
	}
}

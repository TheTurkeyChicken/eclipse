import java.util.*;

public class Hangman {
	public static int right = 0;
	public static void printScore(int wrong, String reveal, Vector<Character> wrongchar) {
		System.out.println("Wrong guesses: " + wrong + "\n" + reveal + "\nWrong characters: ");
		System.out.println(wrongchar);
		return;
	}
	public static String modReveal(String reveal, String sword, String chara) {
		int nextoc = sword.indexOf(chara);
		while(nextoc != -1) {
			sword = sword.substring(0, nextoc) + "@" + sword.substring(nextoc + 1);
			reveal = reveal.substring(0, nextoc * 2) + chara + reveal.substring(nextoc * 2 + 1); // fix this
			nextoc = sword.indexOf(chara);
			right++;
		}
		return reveal;
	}
	public static void main(String[] arg) {
		int attempts = 0, wrong = 0;
		Vector<Character> wrongchar = new Vector<Character>(26);
		Vector<Character> rightchar = new Vector<Character>(26);
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter secret word: ");
		String sword = scan.nextLine().toLowerCase(), guess = "", reveal = "";
		for(int i = 0; i < sword.length(); i++) {
			reveal = reveal + "_ ";
		}
		System.out.println("You will have 7 opporunities to guess incorrectly.");
		while(true) {
			if(wrong > 7) {
				System.out.println("You have ran out of guesses!");
				break;
			}
			System.out.println("Guess a letter (or the word):");
			guess = scan.nextLine().toLowerCase();
			if(guess.equals(sword) || right == sword.length()) {
				System.out.println("You have guessed the word!");
				break;
			}
			else if(rightchar.contains(guess.charAt(0))) {
				System.out.println("You have already guessed that letter!");
			}
			else if(sword.indexOf(guess) == -1) {
				System.out.println("\"" + guess + "\" was not in the word.");
				wrong++; wrongchar.add(guess.charAt(0));
				printScore(wrong, reveal, wrongchar);
			}
			else {
				System.out.println(guess + " was a letter!");
				reveal = modReveal(reveal, sword, guess);
				printScore(wrong, reveal, wrongchar);
				rightchar.add(guess.charAt(0));
				if(right == sword.length()) {
					System.out.println("You have guessed the word!");
					break;
				}
			}
		}
		printScore(wrong, sword, wrongchar);
	}
}

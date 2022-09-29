// Justin Li's while assignment

import java.util.Scanner;

public class whileLoopAssignment {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Print 1000-500 with while loop
		int counter = 1000;
		while(counter >= 500) {
			System.out.println(counter);
			counter--;
		}
		
		// Print all even numbers 100-200
		counter = 100;
		while(counter <= 200) {
			System.out.println(counter);
			counter += 2;
		}
		
		// Print numbers 15-75 with steps of 15
		counter = 15;
		while(counter <= 75) {
			System.out.println(counter);
			counter += 15;
		}
		
		// Given a number, divide the number until it is less than one
		counter = 0;
		double n = scan.nextDouble();
		while(n >= 1) {
			n /= 2;
			counter++;
		}
		System.out.println(counter);
		
		// Calculate average of a numbers; ask user for numbers until input of -1
		double avg = 0;
		counter = 0;
		while(true) {
			n = scan.nextDouble();
			if(n == -1) break;
			avg += n;
			counter++;
		}
		System.out.println("The average was: " + (avg / counter));
		
		// Given 5 integers, print the sum
		int sum = 0;
		counter = 0;
		while(counter < 5) {
			sum += scan.nextInt();
			counter++;
		}
		System.out.println("Sum of 5 numbers: " + sum);
		// Ask for a 4-digit number; keep track of # of tries until user gets answer
		// unclear what the question was: so i just did a guessing number game limited to 4-dig numbers
		int randn = (int)(Math.random() * 9000 + 1000), tries = 0, guess;
		while(true) {
			System.out.println("Enter a 4-digit number: ");
			guess = scan.nextInt();
			if(guess < 1000 || guess >= 10000) continue;
			if(guess == randn) {
				System.out.println("You have guessed the number!");
				break;
			}
			else if(guess < randn) System.out.println("Your guess was too small!");
			else System.out.println("Your guess was too large!");
			tries++;
		}
		System.out.println("Total tries: " + tries);
		
		// Ask for a 4-digit number, ask until the correct number was achieved or guessed 5 times. If guessed 5 times, print "Account locked"
		// i am assuming 0000 (or any number with leading zeroes) is not 4-digit, even though 4-digit passwords allow for leading zeroes
		randn = (int)(Math.random() * 9000 + 1000);
		counter = 0;
		while(true) {
			if(counter == 5) {
				System.out.println("Account locked!");
				break;
			}
			System.out.println("Enter a 4-digit passcode (no leading zeroes)");
			guess = scan.nextInt();
			if(guess < 1000 || guess >= 10000) continue;
			if(guess == randn) {
				System.out.println("You guessed the password!");
				break;
			}
			counter++;
		}
	}
}

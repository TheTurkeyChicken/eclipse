import java.util.Scanner;

public class input {
	public static void main(String[] args) {
		// Memorizing code is not necessary
		// However, knowing the concept of input
		// is necessary
		
		int num;
		System.out.print("Enter an integer: ");
		Scanner scan = new Scanner(System.in);
		num = scan.nextInt();
		
		// to enter doubles
		// scan.nextDouble()
		// to enter strings
		// scan.netLine()
		
		// what could be on the AP or Mr. Lu's quiz
		// num = //input from user
		// Assume the user enters an integer, num
		
		// Exercise
		// ask the user to enter 3 different integers
		// print out the largest.
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		//sort
		
		//Exercise 2
		// Generate the number but don't tell the user
		// Ask the user to guess the number
		// tell user how far they are or if they are correct
		
		System.out.print("Guess my number between 1 and 10: ");
		int guess = scan.nextInt();
		
		int secret = (int)(Math.random() * 11 + 1);
	}
}

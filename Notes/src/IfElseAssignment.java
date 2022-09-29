import java.util.Scanner;

public class IfElseAssignment {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// Print "greater or equal to 100" or vice versa for a number in input
		int n = scan.nextInt();
		if(n >= 100) System.out.println("greater or equal to 100");
		else System.out.println("less than 100");
		
		// State whether a number is divisible by 3
		n = scan.nextInt();
		if(n % 3 == 0) System.out.println("divisible by 3");
		else System.out.println("not divisible by 3");
		
		// State whether a number is divisible by both 5 & 7, 5 only, 7 only, or none
		n = scan.nextInt();
		if(n % 5 == 0 && n % 7 == 0) System.out.println("divisible by 5 and 7");
		else if(n % 5 == 0) System.out.println("divisible by 5 only");
		else if(n % 7 == 0) System.out.println("divisible by 7 only");
		else System.out.println("not divisible by 5 nor 7");
		
		// State if a number is a perfect square
		double dn = scan.nextDouble();
		if(dn == Math.pow(Math.sqrt(dn), 2)) System.out.println("perfect square");
		else System.out.println("not perfect square");
		
		// Print respective letter grade for a real number between 0 and 100, print error if not in range
		dn = scan.nextDouble();
		if(dn < 0 || dn > 100) System.out.println("error");
		else if(dn > 86) System.out.println("Average");
		else if(dn > 73) System.out.println("BELOW AVERAGE");
		else if(dn > 50) System.out.println("CAN'T HAVE DINNER");
		else System.out.println("F I N D  N E W  F A M I L Y");
		
		// Given an integer, print "negative odd", "negative even", zero, "positive odd", or "positive even"
		n = scan.nextInt();
		if(n == 0) System.out.println("zero");
		else if(n < 0 && ((n % 2) + n) % 2 == 0) System.out.println("negative even");
		else if(n < 0 && ((n % 2) + n) % 2 == 1) System.out.println("negative odd");
		else if(n % 2 == 0) System.out.println("positive even");
		else System.out.println("positive odd");
		
		// Given capacity and attendance, print "fire hazard" if attendance > capacity,
		// "full" if attendance is within 90-100% of capacity, or "entry allowed"
		int capacity = scan.nextInt(), attendance = scan.nextInt();
		if(capacity > attendance) System.out.println("fire hazard");
		else if(capacity >= attendance * 0.9 && capacity <= attendance) System.out.println("full");
		else System.out.println("entry allowed");
		
		// Given a number 1-100, generate a random number 1-100, state the larger number, or if they are the same
		n = scan.nextInt();
		int randn = (int)(Math.random() * 100 + 1); // 99 + 1
		System.out.println(n + '\n' + randn);
		if(n == randn) System.out.println("same");
		else if(n > randn) System.out.println("your number was greater");
		else System.out.println("the random number was greater");
		
		// Given 3 integers, print biggest integer
		int a = scan.nextInt(), b = scan.nextInt(), c = scan.nextInt();
		if(a > b && a > c) System.out.println(a);
		else if(b > a && b > c) System.out.println(b);
		else System.out.println(c);
		
		// Given 2 two-digit integers, print whether the last digit of the numbers are equal or not
		a = scan.nextInt();
		b = scan.nextInt();
		System.out.println(a % 10 == b % 10);
		
	}
}

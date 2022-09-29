import java.util.Scanner;
public class ForLoopsAssignment {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Print all odd numbers from 100 to 1
		for(int i = 99; i >= 1; i -= 2) System.out.println(i);
		
		// Print numbers 1-100 divisible by 12
		for(int i = 1; i <= 100; i++) if(i % 12 == 0) System.out.println(i);
		
		// Print all numbers 500-1000, but double all multiples of 10
		for(int i = 500; i <= 1000; i++) {
			if(i % 10 == 0) System.out.println(i * 2);
			else System.out.println(i);
		}
		
		// Ask the user for a number smaller than 10. Print every number from 100 down to the inputed number
		int n = scan.nextInt();
		for(int i = 100; i >= n; i--) System.out.println(i);
		
		// Ask user for two numbers. Print out all the numbers between the two numbers (inclusive)
		int a = scan.nextInt(), b = scan.nextInt();
		if(a > b) { // to cover cases where a is greater than b
			int tb = b;
			b = a;
			a = tb; // swap a and b values
		}
		for(int i = a; i <= b; i++) System.out.println(i);
		
		// Ask user for two numbers between 1-100, then print out all numbers between 1-100 execept for these two numbers
		a = scan.nextInt(); b = scan.nextInt();
		for(int i = 1; i <= 100; i++) {
			if(i == a || i == b) continue;
			System.out.println(i);
		}
		
		// Determine a user-inputed number whether it is prime or not
		n = scan.nextInt();
		boolean isPrime = true;
		if(n == 1) System.out.println("Neither");
		for(int i = 2; i <= Math.sqrt(n); i++) {
			if(n % i == 0) {
				isPrime = false;
				break;
			}
		}
		System.out.println(isPrime);
		
		//Ask user for a number, and print out the sum of all numbers from 1 to that number
		n = scan.nextInt();
		int sum = 0;
		for(int i = 1; i <= n; i++) sum += i;
		System.out.println(sum);
		
		// Ask user for a number and print its factorial
		n = scan.nextInt();
		int factorial = 1;
		for(int i = 1; i <= n; i++) factorial *= i;
		System.out.println(factorial);
		
		// Print out all numbers from 500-1000, and place an "X" beside multiples of 5, a "Y" for multiples of 12, and a "Z" for numbers divisible by both 5 and 12
		for(int i = 500; i <= 1000; i++) {
			if(i % 5 == 0 && i % 12 == 0) System.out.print("Z");
			else if(i % 5 == 0) System.out.print("X");
			else if(i % 12 == 0) System.out.print("Y");
			System.out.println(i);
		}
		
		// Ask user for a number and state whether it is a perfect number or not (perfect numbers are numbers of which are equal to the sum of all its factors except for itself)
		n = scan.nextInt();
		int sumfactors = 0;
		for(int i = 1; i <= n / 2; i++) if(n % i == 0) sumfactors += i;
		System.out.println(sumfactors == n);
		
		// Given two numbers, print out their GCF
		a = scan.nextInt(); b = scan.nextInt();
		int GCF = 1;
		for(int i = 1; i <= Math.min(a, b); i++) if(a % i == 0 && b % i == 0 && i > GCF) GCF = i;
		System.out.println(GCF);
	}
}

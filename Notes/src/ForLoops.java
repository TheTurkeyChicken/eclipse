import java.util.Scanner;

public class ForLoops {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Next class - boolean quiz October 17
		// next next class - guess my number
		// next week quiz - if/else
		
		// For loops
		// for(start; end; increment)
		
		// example 1
		for(int i = 0; i <= 10; i++) {
			System.out.println("Ed Wang is great." + i);
			
		}
		
		// Example 2
		// The increment can be changed
		// The start and end can be changed
		
		// Print all odd numbers from 1 to 99;
		for(int i = 1; i <= 99; i += 2) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		// Print all odd from 99 to 1
		
		for(int i = 99; i >= 1; i -= 2) {
			System.out.print(i + " ");
		}
		
		// Exercise 1
		// Write FizzBuzz: multiple of 3, fizz, multiple of 5, buzz, multuple of both, FizzBuzz
		// Print all other numbers
		for(int i = 0; i < 100; i++) {
			if(i % 3 == 0 && i % 5 == 0) System.out.println("fizzbuzz");
			else if(i % 3 == 0) System.out.println("fizz");
			else if(i % 5 == 0) System.out.println("buzz");
			else System.out.println(i);
		}
		
		// Exercise 2
		// Ask the user for a number
		// Print the sum of 1 to that number
		// Example: User enters 5
		// Print 1 + 2 + 3 + 4 + 5 = 15
		int n = scan.nextInt();
		int sum = 0;
		for(int i = 1; i <= n; i++) {
			sum += i;
			if(i == n) System.out.print(i);
			else System.out.print(i + " + ");
		}
		System.out.println(" = " + sum);
		
		// Exercise 3
		// Factorial
		n = scan.nextInt();
		long product = 1;
		for(int i = 1; i <= n; i++) product *= i;
		System.out.println("Factorial of " + n + " is: " + product);
		
		// Exercise 4
		// User enters an integer, print whether integer is a prime or not
		n = scan.nextInt();
		boolean isPrime = true;
		for(int i = 2; i <= Math.sqrt(n); i++) {
			if(n % i == 0) {
				isPrime = false;
				break;
			}
		}
		System.out.println("Is prime? " + isPrime);
	}
}

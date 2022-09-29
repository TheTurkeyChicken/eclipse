
public class MathOperations {
	public static void main(String[] args) {
		// Math Operations
		// square root
		System.out.println(Math.sqrt(64));
		
		// power
		System.out.println(Math.pow(2, 5));
		
		// absolute value
		System.out.println(Math.abs(-100));
		
		// random number
		// will give a number between 0 and 1 exclusive
		System.out.println(Math.random());
		
		int min = 10, max = 20;
		for(int i = 0; i < 200; i++) {
			System.out.println(Math.random() * Math.abs(max - min + 1) + min);
		}
		
		// mod (modulus) is represented by %
		
		System.out.println("24 mod 7 is " + 24 % 7);
		
		// When is mod useful?
		// Example: determining whether an integer is odd or even
		
		int x = 14;
		if(x % 2 == 0) {
			System.out.println("x is even");
		}
		else {
			System.out.println("x is odd");
		}
		
		// Exercise: Given a three digit number, print out each individual digit
		
		int num = 456, digit = 9, ans = 0;
		System.out.println(((int)(num / 100))); num = num % 100; 
		System.out.println(((int)(num / 10)));
		System.out.println(num % 10);
//		for(int i = 0; i < digit; i++) {
//			ans += (int) ((num % 10.0) * Math.pow(10, i));
//			num /= 10;
//		}
//		System.out.println(ans);
		
		// Exercise 2: Given a number of hours, print out how many years, days, and hours
		
		int hours = 1000;
		System.out.println("Years = " + hours / 24 / 365);
		System.out.println("Days = " + hours / 24);
		System.out.println("Extra hours = " + hours % 24);
		
		System.out.println(3 - 48 * 23 + 16 / 10);
		System.out.println(Math.sqrt(2));
		System.out.println(Math.pow(7, 42));
		System.out.println((-2 + Math.sqrt(8)) * Math.pow(14, 3));
		System.out.println(Math.random());
		System.out.println((int)(Math.random() * 6 + 1) + (int)(Math.random() * 6 + 1));
		System.out.println((int)(Math.random() * 8001 + 1000));
		System.out.println((int)(Math.random() * 51 + 25));
		System.out.println((int)(Math.random() * 10));
		System.out.println(Math.abs((int)(Math.random() * 21 + 15) - (int)(Math.random() * 21 - 25)));
		System.out.println(38800.0 / 60 / 60 / 24);
		System.out.println(500 * 1.609);
		System.out.println((int)(Math.random() * 51 + 100) * 0.45);
	}
}


public class DataTypes {
	public static void main(String[] args) {
		// Two categories of data types
		// Objects and primitive data
		
		// Objects have multiple pieces of information
		// Primitive data has one piece of information (one memory space)
		
		// Objects are capitalized
		// primitive data is never capitalized
		
		// int, double, String
		
		// to declare a variable, declare the type first
		// a variable name has no spaces, no symbols, and
		// cannot start with a number
		
		int adamw = 1;
		adamw = 2;
		
		int justin = 3;
		
		adamw = adamw + justin;
		adamw++;
		adamw += 5;
		adamw--;
		
		System.out.println(adamw);
		
		// an int has a max value
		// this can be accessed with Integer.MAX_VALUE and Integer.MIN_VALUE
		
		System.out.println(Integer.MAX_VALUE);
		
		// double are real numbers
		// integers can be stored in doubles, but not vice versa
		
		double connor = 1.2345;
		connor = 5;
		
		int i = 1;
		double d = 1.5;
		
		// error: i = d
		
		// casting
		// allows double to be converted into integers
		// allows doubles to be truncated
		// 1.99 truncated becomes 1
		
		// use Math.round() to round numbers
		double josh = 5.9;
		int allen;
		
		allen = (int) josh;
		System.out.println(allen);
		
		// random number between 10 and 30
		// note: you must cast the multiplication
		// not just Math.random()
		int rand = (int)(Math.random() * (21)) + 10;
		System.out.println(rand);
		
		double eden;
		eden = (double) 22/7;
		System.out.println(eden);
		
		double max;
		max = (double)(4 / 3);
		System.out.println(max);
		
		// creating constants
		// sometimes, you want to create a variable
		// that cannot be changed
		
		final double gravity = 9.8;
		// error: gravity = 10.2;
		
		// boolean
		// a boolean value is either true or false
		boolean michael = false;
	}
}

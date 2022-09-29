import java.util.Scanner;
public class NestedForLoops {
	public static void mian(String[] args) {
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.println(i + " and " + j);
			}
		}
		
		// Create 10x10 times table
		for(int i = 1; i <= 10; i++) {
			for(int j = 1; j <= 10; j++) {
				System.out.println(i + " x " + j + " = " + i * j);
			}
		}
		
		
	}
}

import java.util.Scanner;

public class Nim {
	public static int getheaps() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter amount of heaps:");
		return scan.nextInt();
	}
	public static int[] getinp() {
		int heapnum, amount;
		Scanner scan = new Scanner(System.in);
		System.out.println("From which pile would you like to take from?");
		heapnum = scan.nextInt() - 1;
		System.out.println("Now enter how many you would like to take from this pile:");
		amount = scan.nextInt();
		int[] retarr = {heapnum, amount};
		return retarr;
	}
	public static boolean isover(int[] arr) {
		for(int i = 0; i < arr.length; i++)	if(arr[i] != 0) return false;
		return true;
	}
	public static void displayboard(int[] arr) {
		System.out.print("\nHeap:\t\t\t");
		for(int i = 0; i < arr.length; i++) System.out.print((i + 1) + "\t");
		System.out.print("\nStones left:\t\t");
		for(int i = 0; i < arr.length; i++) System.out.print(arr[i] + "\t");
		System.out.println();
	}
	public static void main(String[] args) {
		System.out.println("Please decide beforehand who player 1 and player 2 will be.");
		int heaps = getheaps();
		int[] arr = new int[heaps];
		for(int i = 1; i <= arr.length; i++) arr[i - 1] = i;
		while(true) {
			int[] input = new int[2]; // pile, amount
			// Player 1
			if(isover(arr)) {
				System.out.println("Player 2 loses!");
				return;
			}
			displayboard(arr);
			System.out.println("\n****PLAYER 1****");
			while(true) {
				input = getinp();
				if(input[0] >= 0 && input[0] < arr.length && arr[input[0]] - input[1] >= 0 && input[1] > 0) break; // check for valid input
				System.out.println("You have entered an invalid input!");
			}
			arr[input[0]] -= input[1];
			// Player 2
			if(isover(arr)) {
				System.out.println("Player 1 loses!");
				return;
			}
			displayboard(arr);
			System.out.println("\n****PLAYER 2****");
			while(true) {
				input = getinp();
				if(input[0] >= 0 && input[0] < arr.length && arr[input[0]] - input[1] >= 0 && input[1] > 0) break;
				System.out.println("You have entered an invalid input!");
			}
			arr[input[0]] -= input[1];
			
			
		}
	}
}

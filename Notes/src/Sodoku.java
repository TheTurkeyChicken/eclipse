import java.util.Arrays;
import java.util.ArrayList; // import the ArrayList class


public class Sodoku {
	int[][] arr = {{0,9,6,0,0,0,0,0,8},
			{0,3,1,5,0,4,2,7,6},
			{0,5,7,8,6,1,9,4,0},
			{0,0,5,0,0,0,4,3,0},
			{6,0,0,3,0,0,0,0,0},
			{0,0,0,0,4,8,0,2,5},
			{7,0,8,4,0,9,0,0,0},
			{5,0,0,0,3,6,7,0,0},
			{0,0,4,0,0,0,0,0,2}}; // 0 means empty
	public static final int EMPTY = 0; 
	
	public Sodoku() {		
		
	}
	public void prtarr() {
		System.out.println();
		for(int i = 0; i < 9; i++) {
			for(int j = 0; j < 9; j++) {
//				System.out.println("i, j, n: " + i + ", " + j + ", " + arr[i][j]);
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	public boolean check(int r, int c, int n) { // returns true if the current n at arr[r][c] is good, false otherwise
		int cr = r - r % 3, cc = c - c % 3;
		
		// check if n is ok in its row
		for(int i = 0; i < 9; i++) {
			if(arr[r][i] == n) return false;
		}
		
		// check if n is ok in its col
		for(int i = 0; i < 9; i++) {
			if(arr[i][c] == n) return false;
		}
		
		// check current subsquare
		for(int i = cr; i < cr + 3; i++) {
			for(int j = cc; j < cc + 3; j++) {
				if(arr[i][j] == n) return false;
			}
		}
		
		return true;
	}
	public boolean sol(int r, int c) {
		for(int i = 0; i < 9; i++) {
			if(i < r) continue; // don't check for anything before; can save a bit of time
			for(int j = 0; j < 9; j++) {
				if(arr[i][j] == EMPTY) {
					for(int num = 1; num <= 9; num++) {
						if(check(i, j, num)) {
							arr[i][j] = num;
							if(sol(i, j)) return true;
							else arr[i][j] = EMPTY;
						}
					}
					return false;
				}
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Sodoku sudoku = new Sodoku();
		System.out.println("Original grid: ");
		sudoku.prtarr();
		if(sudoku.sol(0, 0)) {System.out.println("Solved sudoku grid: "); sudoku.prtarr();}
		else System.out.println("Unsolvable!");
		
	}
}

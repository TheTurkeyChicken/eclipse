
public class TwoDArrays {
	public static void main(String[] args) {
		// array within an array
		
		// to declare
		int[][] mat = new int[5][5];
		
		int[][] matrix = { {1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}};
		
		// to traverse a 2D array
		// use a nested for loop
		
		// the outside is for rows
		// the inside loop is for columns
		
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				System.out.println(matrix[i][j]);
			}
			System.out.println();
		}
		
		// Vocab:
		// When traversing a 2D array, and going now by row,
		// this is called row major order
		// the opposite is called column major order
		
		// Exercise:
		// Determine whether a 2D array is ordered from smallest to biggest using row major order
		
		boolean inOrder = true;
		
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				if(matrix[i][j] > matrix[i][j + 1]) {
					inOrder = false;
				}
			}
		}
		
		// Exercise:
		// Print the sum of every column
		
		int colsum = 0;
		
		for(int col = 0; col < matrix[0].length; col++) {
			for(int row = 0; row < matrix.length; row++) {
				colsum += matrix[row][col];
			}
			System.out.println();
			colsum = 0;
		}
	}
}

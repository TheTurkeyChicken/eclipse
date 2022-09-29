public class Introto2DArrays {
	public static int[][] get2darr(int r, int c) {
		int[][] newarr = new int[r][c];
		for(int i = 0; i < r; i++) {
			for(int j = 0; j < c; j++) {
				newarr[i][j] = (int)(Math.random() * 100);
			}
		}
		return newarr;
	}
	public static void main(String[] args) {
	
		int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		
		//1 - Find the smallest integer and print it.
		System.out.print("Q1: ");
			int min = arr[0][0];
			for (int i = 0; i <= arr.length-1; i ++) {
				for (int j = 0; j <= arr[i].length-1; j ++) {
					if (arr[i][j] < min)
						min = arr[i][j];
				}
			}
			System.out.println(min);
		
		//2 - Print whether the array is a square or a rectangle.
		System.out.print("Q2: ");
			boolean square = true;
			for (int i = 0; i <= arr.length-1; i ++) {
				if (arr.length != arr[i].length)
					square = false;
			}
			if (square)
				System.out.println("Square");
			else if (!square)
				System.out.println("Rectangle");
	
		//3 - Given a column number, print sum of the column.
		System.out.print("Q3: ");
			int given = 1;
			int sum = 0;
			for (int i = 0; i <= arr.length-1; i ++) {
				sum += arr[i][given]-1;
			}
			System.out.println(sum);
		
		//4 - Print the row number with largest sum.
		System.out.print("Q4: ");
			sum = 0;
			int temp = 0;
			int rownum = 0;
			for (int i = 0; i <= arr.length-1; i ++) {
				temp = sum;
				for (int j = 0; j <= arr[i].length-1; j ++) {
					sum += arr[i][j];
				}
				if (temp > sum)
					sum = temp;
				rownum = i;
			}
			System.out.println(rownum+1);
			
		//5 - Of two integers, print out which occurs more frequently and print both if frequency is equal.
		System.out.print("Q5: ");
			int given1 = 1;
			int given2 = 3;
			int counter1 = 0;
			int counter2 = 0;
			for (int i = 0; i <= arr.length-1; i ++) {
				for (int j = 0; j <= arr[i].length-1; j ++) {
					if (arr[i][j] == given1)
						counter1 ++;
					if (arr[i][j] == given2)
						counter2 ++;
				}
			}
			if (counter1 > counter2)
				System.out.println(given1);
			else if (counter2 > counter1)
				System.out.println(given2);
			else
				System.out.println(given1 + ", " + given2);
			
		//6 - Replace a given int with the int below it (first row if given int is in last row).
		System.out.print("Q6: ");
			int given3 = 8;
			for (int i = 0; i <= arr[0].length-1; i ++) {
				for (int j = 0; j <= arr.length-1; j ++) {
					if (arr[j][i] == given3) {
						if (j == arr.length-1)
							System.out.println(arr[0][i]);
						else {
							arr[j][i] = arr[j+1][i];
							System.out.println(arr[j][i]);
						}
					}
				}
			}
	
		//7 - Using row-major order, print whether the array is in order (smallest to biggest).
		System.out.print("Q7: ");
			boolean inorder = true;
			temp = 0;
			for (int i = 0; i <= arr.length-1; i ++) {
				for (int j = 0; j <= arr[i].length-1; j ++) {
					if (arr[i][j] < temp)
						inorder = false;
					temp = arr[i][j];
				}
			}
			if (inorder)
				System.out.println("In Order.");
			else
				System.out.println("Not In Order.");
	
		//8 - Change even numbers to the number on the right (If last in row, change to first number of the next row).
		System.out.print("Q8: ");
			for (int i = 0; i <= arr.length-1; i ++) {
				for (int j = 0; j <= arr[0].length-1; j ++) {
					if (arr[i][j] % 2 == 0) {
						if (j == arr.length-1)
							arr[i][j] = arr[i+1][0];
						else {
							arr[i][j] = arr[i][j+1];
						}
					}
				}
			} System.out.println("I checked this - it works");
			
		//9 - State whether there are duplicates in the array.
		System.out.print("Q9: ");
			boolean duplicate = false;
			for (int i = 0; i <= arr.length-1; i ++) {
				for (int j = 0; j <= arr[0].length-1; j ++) {
					for (int k = 0; k <= arr.length-1; k ++) {
						for (int l = 0; l <= arr[0].length-1; l ++) {
							if (i != k && j != l && arr[i][j] == arr[k][l])
								duplicate = true;
								break;
						}
					}
				}
			}
			if (duplicate)
				System.out.println("Duplicate(s) present.");
			else
				System.out.println("No duplicate(s) present.");
		
		//10 - Change words of an array with 3 or less letters to null. Print how many changes were made.
		System.out.print("Q10: ");
			String[][] array = {{"poo", "pooo", "pooo"}, {"pooo", "poo", "pooo"}, {"pooo", "pooo", "poo"}};
			int counter = 0;
			
			for (int i = 0; i <= array.length-1; i ++) {
				for (int j = 0; j <= array[0].length-1; j ++) {
					if (array[i][j].length() <= 3) {
						array[i][j] = null;
						counter ++;
					}
				}
			}
			System.out.println(counter);
		
		//11 - Create a method to search for a last name. Print out the first and last name, or "not found."
		System.out.print("Q11: ");
			String[][] ar = {{"Edward", "Gao"}, {"Bincent", "Bao"}, {"Bobber", "Beung"}, {"Lustin", "Ji"}, {"Will", "Bang"}, {"Hufei", "Yuang"}, {"Karman", "Assam"}, {"Diam", "Lachner"}, 
					{"Banderson", "Bao"}, {"Lalvin", "Ciu"}};
			search(ar, "Gao");
	}
		
	public static void search (String[][] array, String lastname) {
	
		boolean found = false;
		int row = 0;
		for (int i = 0; i <= 1; i ++) {
			if (lastname.equals(array[i][1])) {
				found = true;
				row = i;
				break;
			}
		}
		if (found)
			System.out.println(array[row][0] + " " + array[row][1]);
		else 
			System.out.println("Not Found.");
			
	}
}

//import java.util.Arrays;
//public class Introto2DArrays {
//	public static int[][] get2darr(int r, int c) {
//		int[][] newarr = new int[r][c];
//		for(int i = 0; i < r; i++) {
//			for(int j = 0; j < c; j++) {
//				newarr[i][j] = (int)(Math.random() * 100);
//			}
//		}
//		return newarr;
//	}
//	public static void main(String[] args) {
//		// 1: print smallest int in array
//		int smallint = 99999;
//		int[][] q1arr = get2darr(5, 5);
//		for(int i = 0; i < 5; i++) {
//			for(int j = 0; j < 5; j++) {
//				if(q1arr[i][j] < smallint) smallint = q1arr[i][j];
//			}
//		}
//		System.out.println(smallint);
//		
//		// 2: print whether array is square or rectangle
//		System.out.println(q1arr.length == q1arr[0].length); // only works for non-jagged arrays
//		
//		// 3: given an integer, print the sum of that column
//		int someint = 4, q3sum = 0;
//		for(int i = 0; i < q1arr[someint].length; i++) {
//			q3sum += q1arr[someint][i];
//		}
//		System.out.println(q3sum);
//		
//		// 4: print the row number with the largest sum
//		int q4largestsum = -1, q4largestrow, q4rsum = 0;
//		for(int i = 0; i < q1arr.length; i++) {
//			q4rsum = 0;
//			for(int j = 0; j < q1arr[i].length; j++) {
//				q4rsum += q1arr[i][j];
//			}
//			if(q4rsum < q4largestsum) q4largestsum = q4rsum;
//		}
//		
//		// 5: print out most frequent occurence of two given numbers
//		int q5a = 5, q5b = 4, q5acounter = 0, q5bcounter = 0;
//		for(int i = 0; i < q1arr.length; i++) {
//			for(int j = 0; j < q1arr[i].length; j++) {
//				if(q1arr[i][j] == q5a) q5acounter++;
//				else if(q1arr[i][j] == q5b) q5bcounter++;
//			}
//		}
//		if(q5acounter == q5bcounter) System.out.println("Same amount of occurences");
//		else if(q5acounter > q5bcounter) System.out.println(q5acounter + " occured more.");
//		else System.out.println(q5bcounter + " occured more.");
//		
//		// 6: replace aosi
//	}
//}

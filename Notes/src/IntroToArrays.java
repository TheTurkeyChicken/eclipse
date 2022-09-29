import java.util.Arrays;

public class IntroToArrays {
	private static final int INT_MAX = 0;

	public static int[] randarr() {
		int[] arr = new int[20];
		for(int i = 0; i < 20; i++) arr[i] = (int)(Math.random() * 100 + 1);
		return arr;
	}
	public static void printarr(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// 1: sum of all elements in array
		int[] q1arr = randarr();
		int q1sum = 0;
		for(int i = 0; i < q1arr.length; i++) q1sum += q1arr[i];
		System.out.println("Q1: " + q1sum);
		
		// 2: average of all elements in array
		int[] q2arr = randarr();
		int q2avg = 0;
		for(int i = 0; i < q2arr.length; i++) q2avg += q2arr[i];
		q2avg /= q2arr.length;
		System.out.println("Q2: " + q2avg);
		
		// 3: print array elements in reverse
		int[] q3arr = randarr();
		System.out.println("3: ");
		for(int i = q3arr.length - 1; i >= 0; i--) System.out.print(q3arr[i] + " ");
		System.out.println();
		
		// 4: print contents of array, swap first and last elements, print array again
		int[] q4arr = randarr();
		printarr(q4arr);
		int temp = q4arr[0];
		q4arr[0] = q4arr[q4arr.length - 1];
		q4arr[q4arr.length - 1] = temp;
		System.out.println("4: ");
		printarr(q4arr);
		
		// 5: print smallest element
		int[] q5arr = randarr();
		Arrays.sort(q5arr);
		System.out.println("5: " + q5arr[0]);
		
		// 6: Make every second element negative
		int[] q6arr = randarr();
		int q6sum = 0;
		System.out.println("6: ");
		for(int i = 0; i < q6arr.length; i++) {
			if(i % 2 == 1) q6arr[i] = -q6arr[i];
			q6sum += q6arr[i];
		}
		printarr(q6arr);
		
		// 7: count how many times an odd number appears in the array
		int[] q7arr = randarr();
		int q7counter = 0;
		for(int i = 0; i < q7arr.length; i++) {
			if(q7arr[i] % 2 == 1) q7counter++;
		}
		System.out.println("7: " + q7counter);
		
		// 8: print sum of array, but double every integer smaller than 10
		int[] q8arr = randarr();
		int q8sum = 0;
		for(int i = 0; i < q8arr.length; i++) {
			if(q8arr[i] < 10) q8sum += 2 * q8arr[i];
			else q8sum += q8arr[i];
		}
		
		// 9: search the amount of times a number appears in an array
		int[] q9arr = randarr();
		int find = 29, q9counter = 0;
		for(int i = 0; i < q9arr.length; i++) {
			if(q9arr[i] == find) q9counter++; 
		}
		if(q9counter == 0) System.out.println("9: " + q9counter);
		else System.out.println("Number is not in array");
		
		// 10: sum first 10 and last 10 elements in array, and state the larger sum
		int[] q10arr = randarr();
		int q10sum1 = 0, q10sum2 = 0;
		for(int i = 0; i < q10arr.length; i++) {
			if(i < 10) q10sum1 += q10arr[i];
			else q10sum2 += q10arr[i];
		}
		if(q10sum1 == q10sum2) System.out.println("10: Both first and last 10 have the same sum.");
		else if(q10sum1 > q10sum2) System.out.println("10: The first 10 sum are larger!");
		else System.out.println("10: the last 10 sum are larger!");
		System.out.println("First 10: " + q10sum1 + ", Last 10: " + q10sum2);
		
		// 11: Accept an integer as parameter
		int[] q11arr = randarr();
		int param = 47, q11counter1 = 0, q11counter2 = 0;
		for(int i = 0; i < q11arr.length; i++) {
			if(q11arr[i] <= param && i < 10) q11counter1++;
			else q11counter2++;
		}
		if(q11counter1 == q11counter2) System.out.println("11: Both first and last ten have same amout of numbers!");
		else if(q11counter1 < q11counter2) System.out.println("11:  The last 10 have more smaller numbers.!");
		else System.out.println("11: The first 10 have more smaller numbers!");
		
		// 12: every time a number is bigger than its predecessor, print the value and index 
		int[] q12arr = randarr();
		int lastnum = INT_MAX;
		for(int i = 0; i < q12arr.length; i++) {
			if(q12arr[i] > lastnum) System.out.print(q12arr + ", " + i + "; ");
		}
		
		// 13: given a number, find all the pairs in the array which sum to that number
		int[] q13arr = randarr();
		int q13counter = 0;
		param = 56; 
		
		for(int i = 0; i < q13arr.length; i++) {
			for(int j = i + 1; j < q13arr.length; j++) {
				if(q13arr[i] + q13arr[j] == param) q13counter++;
			}
		}
		System.out.println("13: " + q13counter);
		
		// 14: Fill an array with numbers from 1-20, remove a number, and find the missing number
		int[] q14arr = new int[20];
		int randint = (int)(Math.random() * 20), q14sum = 0;
		for(int i = 0; i < 20; i++) {
			q14arr[i] = i + 1;
		}
		q14arr[randint] = 0;
		for(int i = 0; i < q14arr.length; i++) {
			q14sum += q14arr[i];
		}
		System.out.println(20 * (21) / 2 - q14sum);
		
		// 15: given an array with equal parts positive and negative numbers, rearrnge the array so positive and negative numbers are alternating
		int[] q15arr1 = randarr(), q15arr2 = new int[20];
		for(int i = 0; i < q15arr1.length / 2; i++) {
			q15arr1[i] = -q15arr1[i];
		}
		Arrays.sort(q15arr1);
		for(int i = 0; i < q15arr1.length / 2; i++) {
			q15arr2[i * 2] = q15arr1[i];  
		}
		for(int i = 10; i < q15arr1.length; i++) {
			q15arr2[(i - 10) * 2 + 1] = q15arr1[i]; 
		}
		
		
	}
}

package Pck1;

/*
 * Find min and max.
 * Store 15 integers in an array and random numbers in the range of 0 to 100.
 * Create a method findMin() for a minimum number and findMax() for
 * a maximum number inside of the array. Display the data to the console.
 */

import java.util.Arrays;
import java.util.Random;

public class MaxandMin {

	public static void main(String[] args) {
		Random rnd = new Random(-1);
		int[] ary = new int[15];
		
		for(int i = 0; i < ary.length; i++) {
			ary[i] = rnd.nextInt(101);
		}
		System.out.println(Arrays.toString(ary));
		
		int min = findMin(ary);
		int max = findMax(ary);
		
		displayData(min, max);

	}
	public static int findMin(int[] ary) {
		int min = ary[0];
		for(int i = 1; i < ary.length; i++) {
			if(ary[i] < min) {
				min = ary[i];
				
			}
		}
		return min;
	
	}
	public static int findMax(int[] ary) {
		int max = ary[0];
		for(int i = 1; i < ary.length; i++) {
			if(ary[i] > max) {
				max = ary[i];
			}
		}
		return max;
	}
	public static void displayData(int min, int max) {
		
		System.out.println("The minimun number " + min);
		System.out.println("The maximum number " + max);
	}

}

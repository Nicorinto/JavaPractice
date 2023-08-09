package Pck1;

/*
 * Project Coping arrays.
 * Create an array with 25 integer and assign a random number in the range
 * 0 to 100. create a second array and copy from the first array and use 
 * Arrays.toString() function to display to the console. 
 */

import java.util.Arrays;
import java.util.Random;

public class CopyArrays {

	public static void main(String[] args) {
		Random rnd = new Random();
		int[] ary = new int[25];
		
		for(int i = 0; i < ary.length; i++) {
			ary[i] = rnd.nextInt(100);
			
		}
		System.out.print("First arrays: "+ Arrays.toString(ary) + "\n");
		
		int[] ary1 = new int[25];
		for(int i = 0; i < ary.length; i++) {
			ary1[i] = ary[i];
		}
		System.out.println("Second arrays: " + Arrays.toString(ary1));
		

	}

}

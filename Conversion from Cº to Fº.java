Exercise 5.3
Write a program that displays the following table (note
that farenheit = celsius * 9/5 + 32):
Celsius |  Fahrenheit
0	     32.0
2	     35.6
...
96	     204.8	
98	     208.4
Introduction to Java Programming and Data Structures
by Daniel Liang

package Pck1;

public class Section5_3 {

	public static void main(String[] args) {
		
		System.out.println("Celsius\t" + " Fahrenheit");
		
		for(int i = 0; i < 100; i++) {
			if(i % 2 == 0)
		
		for(int j = i; j <= i; j++) {
			float farenheit = (float) (j * (9.0 / 5) + 32);
			if(j % 2 == 0)
			System.out.println(i + "\t "+ farenheit);
		}
		}

	}

}

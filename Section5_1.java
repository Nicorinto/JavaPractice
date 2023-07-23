package Pck1;

import java.util.Scanner;

public class Section5_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter you Score: ");
		int student = input.nextInt();
		
		int count = 0;
		while(count != student) {
			if(student > 60) {
				System.out.println("you pass the exam");
			}
			else if(student < 60) {
				System.out.println("you don't pass the exam");
			}
			else {
				System.out.println("try again");
			}
		if(student == -1){
			System.out.println("no number are entered except 0");
			break;
			}
			System.out.print("Enter you Score: ");
			student = input.nextInt();
			count ++;
		}

	}

}

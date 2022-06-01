package com.syntax.class05;

import java.util.Scanner;

public class HW6 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter your Quiz score");
		int quiz = input.nextInt();
		System.out.println("Enter your Mid-term score");
		int mid = input.nextInt();
		System.out.println("Enter your Final score");
		int fin = input.nextInt();

		int result = ((quiz + mid + fin) / 3);

		if (result >= 90) {
			System.out.println("Your grade is A");
		
		} else if (result >= 70 && result <= 90) {
			System.out.println("Your grade is B");
		
		} else if (result >= 50 && result <= 70) {
			System.out.println("Your grade is C");
		
		} else if (result < 50) {
			System.out.println("Your ghreat is F");
		}

	}

}

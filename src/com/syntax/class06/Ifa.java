package com.syntax.class06;

import java.util.Scanner;

public class Ifa {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter your Quiz score");
		int quiz = input.nextInt();
		System.out.println("Enter your Mid-term score");
		int mid = input.nextInt();
		System.out.println("Enter your Final score");
		int fin = input.nextInt();

		int result = ((quiz + mid + fin) / 3);

		char grade;

		if (result >= 90) {
			grade = 'A';

		} else if (result >= 70 && result <= 90) {
			grade = 'B';

		} else if (result >= 50 && result <= 70) {
			grade = 'C';

		} else {
			grade = 'F';
		}
		System.out.println("You are a " + grade + " student");
		
		if (grade=='A' || grade=='B') {
			System.out.println("You are doing great");
		}else {
			System.out.println("Please try to study more");
		}

	}

}

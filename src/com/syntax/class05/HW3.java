package com.syntax.class05;

import java.util.Scanner;

public class HW3 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter number worked years");
		int years = input.nextInt();

		if (years >= 5) {
			System.out.println("Eligible for the bonus");
			System.out.println("Annual salary");
			int salary = input.nextInt();
			if (salary > 50000)
				System.out.println("bonus 5000");
			else
				System.out.println("bonus 3000");

		} else {
			System.out.println("not eligible for bonus");

		}

	}

}

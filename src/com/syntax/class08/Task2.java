package com.syntax.class08;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String credit = "Yes";

		do {
			System.out.println("Apply for a credit card");
			credit = input.next();
		} while (!credit.equalsIgnoreCase("Yes"));
		System.out.println("Good job");

	}

}

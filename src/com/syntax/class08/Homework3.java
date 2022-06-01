package com.syntax.class08;

import java.util.Scanner;

public class Homework3 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		boolean loan = true;
		int credit = 0;

		System.out.println("Do you need a loan");
		loan = input.nextBoolean();

		System.out.println("What is your credit score?");
		credit = input.nextInt();
		if (credit > 600) {
			System.out.println("not eligible");
		} else if (credit >= 600 && credit <= 700) {
			System.out.println("Maybe eligible");
		} else if (credit > 701 && credit > 800) {
			System.out.println("Eligible");
		} else if (credit > 801) {
			System.out.println("Definitely eligible");
		} else {
			System.out.println("Unknown");
		}

	}

}

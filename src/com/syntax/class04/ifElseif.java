package com.syntax.class04;

public class ifElseif {

	public static void main(String[] args) {
		int num1 = 20;
		int num2 = 20;

		if (num1 > num2) {
			System.out.println(num1 + " is larger than " + num2);
		} else if (num2 > num1) {
			System.out.println(num2 + " is larger than " + num1);
		} else {
			System.out.println(num1 + " is equal to " + num2);
		}

		System.out.println("------------------------------------------------");

		int day = 1;

		if (day == 1) {
			System.out.println("Monday");
		} else if (day == 2) {
			System.out.println("Tuesday");

		} else if (day == 3) {
			System.out.println("Wednesday");

		} else if (day == 4) {
			System.out.println("Thursday");

		} else if (day == 5) {
			System.out.println("Friday");

		} else if (day == 6) {
			System.out.println("Saturday");

		} else if (day == 7) {
			System.out.println("Sunday");
		}

		System.out.println("------------------------------------------------");

		int month = 13;

		if (month == 1) {
			System.out.println("January");
		} else if (month == 2) {
			System.out.println("February");
		} else if (month == 3) {
			System.out.println("March");
		} else if (month == 4) {
			System.out.println("April");
		} else if (month == 5) {
			System.out.println("May");
		} else if (month == 6) {
			System.out.println("June");
		} else if (month == 7) {
			System.out.println("July");
		} else if (month == 8) {
			System.out.println("August");
		} else if (month == 9) {
			System.out.println("September");
		} else if (month == 10) {
			System.out.println("October");
		} else if (month == 11) {
			System.out.println("November");
		} else if (month == 12) {
			System.out.println("December");
		} else
			System.out.println("It's not a month");

	}
}
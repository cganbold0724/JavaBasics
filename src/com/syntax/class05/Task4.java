package com.syntax.class05;

import java.util.Scanner;

public class Task4 {
	
	/* Write a program that will print whether it is a weekend or weekday. 
	 * If any day from 1-5 output “It is a weekday”, day from 6-7 output “It is a weekend”, any other day output “Invalid day”
	 */

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("What days is today?");
		int day=input.nextInt();
		
		if (day>=5) {
			System.out.println("It is a weekday");
		}else if (day>=6 && day>=7) {
			System.out.println("It is a weekend");
		}else {
			System.out.println("invalid day");
		}

	}

}

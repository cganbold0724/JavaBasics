package com.syntax.class05;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Do you have a credit card or not");
		String answer=scan.next();
		
		if(answer.equalsIgnoreCase("no")) {
			System.out.println("We will offer you credit card");
		}else {
			System.out.println("What is your balance on the card");
			int balance=scan.nextInt();
			if(balance>=1000) {
				System.out.println("Pay off immediately");
			}else {
				System.out.println("You can spend more");
			}
		}
	

	}

}

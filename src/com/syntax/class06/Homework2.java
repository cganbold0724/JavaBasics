package com.syntax.class06;

import java.util.Scanner;

public class Homework2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter value for sale: yes or no");
		String sale = input.nextLine();

		if (sale.equals("yes")) {
			System.out.println("Which item are you interested in?");
			String item = input.next();
			System.out.println("What is the price?");
			double price = input.nextDouble();
			if (price < 20) {
				System.out.println("After 10% discount from " + price + " to " + (price - (price * .1)));
			} else if (price >= 20 && price <= 100) {
				System.out.println("After 20% discount from " + price + " to " + (price - (price * .2)));
			} else if (price >= 100 && price <= 500) {
				System.out.println("After 30% discount from " + price + " to " + (price - (price * .3)));
			} else if (price > 500) {
				System.out.println("After 50% discount from " + price + " to " + (price - (price * .5)));
			}
		} else if (sale.equals("no")) {
			System.out.println("You are not going for shopping");
		}
		
	}

}

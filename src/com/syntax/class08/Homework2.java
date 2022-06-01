package com.syntax.class08;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		/*ask user to enter item they want to buy and price of that item
		 *Every time user enters money, accumulate the amount and tell the user how much is left to pay off
		 *If user give more money program should return a change. Whenever a user done with payments program should say “Thank you for shopping!”
		 */
		
		int money=0; int pay=0; int change=0; int amount=0;
		
		System.out.println("Please enter the item you want to buy?");
		String item = input.nextLine();
		System.out.println("What is the price of that item?");
		int price = input.nextInt();
		System.out.println("Please enter your payment");
		
		do {
			money=input.nextInt();
			amount+=money;
			pay=price-amount;
			if (amount>price) {
				change=amount-price;
				System.out.println("This is your change: "+change);
				System.out.println("Thank you for shopping! Here is your "+item);
				break;
			}else if(amount==price) {
				System.out.println("Thank you for shopping! Here is your "+item);
				break;
			}
			System.out.println("You need to pay this much now: "+pay);
		}while(amount<price);
		System.out.println("Go somewhere else");
		
	

}

}

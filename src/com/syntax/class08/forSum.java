package com.syntax.class08;

import java.util.Scanner;

public class forSum {

	public static void main(String[] args) {
		
		int sumEven=0;
		int sumOdd=0;
		
		for (int i = 1; i <= 70; i++) {
			if (i % 2 == 0) {
				sumEven+=i;
			}else {
				sumOdd+=i;
			}
			
		}
		System.out.println("sum even numbers is "+sumEven);
		System.out.println("sum odd numbers is "+sumOdd);
		
		System.out.println();
		
		/*declare a secret number
		 * you want to ask user to guess your secret number
		 * you code should keep asking to guess until user gets your secret number
		 */
		
		Scanner input = new Scanner(System.in);
		int secret = 21;
		System.out.println("Guess your secret number");
		secret = input.nextInt();
		while (secret!=21) {
			System.out.println("Guess again");
			secret = input.nextInt();
			
		}
		System.out.println("Congratulations");
		
		//or
		
		System.out.println("-------------------------------------------------------------");

		int secretNum = 25;
		int guessedNum;
		do {
			System.out.println("Guess my secret number");
			guessedNum = input.nextInt();
		} while (guessedNum != secretNum);
		System.out.println("You got it");
			
		

	}

}

package com.syntax.class08;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int sumOdd=0;
		int sumEven=0;
		int start;
		int end;
		
		System.out.println("Start number");
		start = input.nextInt();
		System.out.println("End number");
		end = input.nextInt();
		
		for(int i=start; i<=end; i++) {
			if (i%2 ==0) {
				sumEven+=i;
			}else if(i%2!=0) {
				sumOdd+=i;
			}
		}
		System.out.println("Sum even numbers is "+sumEven);
		System.out.println("Sum odd numbers is "+sumOdd);

	}

}
